package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        }catch(Exception e){
                //do nothing
            }
    }

    @Test
    public void testSearchEmployeeLastName() {
        //Given
        Employee employee = new Employee("Stefan","Kurek");
        Employee employee2 = new Employee("Anna", "Jamna");

        Company company = new Company("Orange");

        employee.getCompanies().add(company);
        employee2.getCompanies().add(company);

        company.getEmployees().add(employee);
        company.getEmployees().add(employee2);

        //When
        employeeDao.save(employee);
        int employeeId = employee.getId();
        employeeDao.save(employee2);
        int employee2Id = employee2.getId();

        List<Employee> result = employeeDao.retrieveByLastName("Kurek");

        //Then
        //Then
        Assert.assertEquals(1, result.size());
        Assert.assertNotEquals(0, employeeId);
        Assert.assertNotEquals(0, employee2Id);

        //CleanUp
        try {
            employeeDao.deleteById(employeeId);
            employeeDao.deleteById(employee2Id);
            companyDao.delete(company);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void testSearchCompanyFirstThreeLeeters() {
        //Given
        Company company1 = new Company("Orange");
        Company company2 = new Company("TMobile");

        Employee employee = new Employee("Andrzej", "Góra");

        company1.getEmployees().add(employee);
        company2.getEmployees().add(employee);

        employee.getCompanies().add(company1);
        employee.getCompanies().add(company2);

        //When
        companyDao.save(company1);
        int companyId = company1.getId();
        companyDao.save(company2);
        int company2Id = company2.getId();

        List<Company> result = companyDao.retrieveByThreeLetters("Ora");
        for (Company resultCompany : result) {
            System.out.println(resultCompany.getName());
        }

        //Then
        Assert.assertEquals(1, result.size());
        Assert.assertNotEquals(0, companyId);
        Assert.assertNotEquals(0, company2Id);

        //CleanUp
        try {
            companyDao.deleteById(companyId);
            companyDao.deleteById(company2Id);
            employeeDao.delete(employee);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



























