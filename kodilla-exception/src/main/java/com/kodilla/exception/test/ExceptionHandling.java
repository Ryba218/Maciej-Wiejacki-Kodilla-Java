package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {


        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String string = secondChallenge.probablyIWillThrowException(5, 2);
            System.out.println(string);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("End");
        }

    }
}
