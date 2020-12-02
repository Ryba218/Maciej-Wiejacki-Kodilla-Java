package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.aspectj.apache.bcel.generic.LOOKUPSWITCH;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public void processSearchCompany(final String phraseSearch) throws SearchException {
        boolean wasError = false;
        List<Company> queryResult;

        LOGGER.info("Searching according to: " + phraseSearch );

        if (phraseSearch == null) {
            LOGGER.error(SearchException.ERR_EMPTY_QUERY);
            wasError = true;
            throw new SearchException(SearchException.ERR_EMPTY_QUERY);

        }
        LOGGER.info("OK. Registering a new search phrase");

        try{
            queryResult = companyDao.retrieveByAnyLettersOfCompanyName(phraseSearch);
            if (queryResult.size() < 1) {
                LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
                wasError = true;
                throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
            } else {
                LOGGER.info("List of matching phrases: ");
                for (Company result : queryResult) {
                    LOGGER.info("ID: " + result.getId() + " , Company: " + result.getName());
                }
            }
        } catch (Exception e) {
            throw new SearchException(SearchException.ERR_SEARCH_PROCESSOR_ERROR);
        } finally {
            if (wasError) {
                LOGGER.info("There were errors");
            } else {
                LOGGER.info("Searching OK");
            }
        }
    }

    public void processSearchEmployee(final String phraseSearch) throws SearchException {
        boolean wasError = false;
        List<Employee> queryResult;

        LOGGER.info("Searching for phrases for Employee " + phraseSearch);

        if (phraseSearch == null) {
            LOGGER.error(SearchException.ERR_EMPTY_QUERY);
            wasError = true;
            throw new SearchException(SearchException.ERR_EMPTY_QUERY);
        }

        LOGGER.info("OK. Registering a new search phrase");

        try {
            queryResult = employeeDao.retrieveByAnyLettersOfEmployeeName(phraseSearch);
            LOGGER.info("ID: " + queryResult);

            if (queryResult.size() < 1) {
                LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
                wasError = true;
                throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            } else {
                LOGGER.info("List of matching phrases: ");
                for (Employee results : queryResult) {
                    LOGGER.info("ID: " + results.getId() + ", Employee: " + results.getFirstname() + " " + results.getLastname());
                }
            }
        } catch (Exception e) {
            throw new SearchException(SearchException.ERR_SEARCH_PROCESSOR_ERROR);
        } finally {
            if (wasError) {
                LOGGER.info("There were errors");
            } else {
                LOGGER.info("Everything is fine");
            }
        }
    }
}
