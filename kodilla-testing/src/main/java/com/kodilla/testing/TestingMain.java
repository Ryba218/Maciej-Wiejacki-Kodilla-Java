
package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        int a = 11;
        int b = 7;

        int expectedAddResult = a + b;
        int expectedSubResult = a - b;


        Calculator test = new Calculator();

        if (expectedAddResult == test.add(a,b)) {
            System.out.println("Adding OK");
        }  else {
            System.out.println("Adding isn't OK");
        }

        if (expectedSubResult == test.substract(a,b)) {
            System.out.println("Substraction OK");
        }  else {
            System.out.println("Substraction failed");
        }


        
    }
}
