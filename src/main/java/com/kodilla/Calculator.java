package com.kodilla;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;

public class Calculator {

        public double adding(double x,double y) {
        double addingResult = x + y;
        return addingResult;
        }
        public double substraction(double x,double y) {
        double substractionResult = x - y;
        return substractionResult;
        }
    public static void main(String[] args) {
         Calculator calculator = new Calculator();
         double addResult = calculator.adding(2.6,3.8);
         System.out.println("Adding result: " + addResult); git add *

         double subResult = calculator.substraction(4.5,2.2);
         System.out.println("Substraction result: " + subResult);


    }


}


