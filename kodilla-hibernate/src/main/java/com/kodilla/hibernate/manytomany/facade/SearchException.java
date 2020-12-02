package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static final String ERR_EMPLOYEE_NOT_FOUND = "No matching Employees";
    public static final String ERR_COMPANY_NOT_FOUND = "No matching Companies";
    public static final String ERR_SEARCH_PROCESSOR_ERROR = "There have been errors in processing";
    public static final String ERR_EMPTY_QUERY = "Query is empty";

    public SearchException(String message) {
        super(message);
    }
}
