package com.kodilla.spring.calculator;

import com.kodilla.spring.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(1,2);
        double result2 = calculator.sub(3,2);
        double result3 = calculator.mul(2,2);
        double result4 = calculator.div(4,2);
        //Them
        Assert.assertEquals(3,result,0);
        Assert.assertEquals(1,result2,0);
        Assert.assertEquals(4,result3,0);
        Assert.assertEquals(2,result4,0);
    }
}
