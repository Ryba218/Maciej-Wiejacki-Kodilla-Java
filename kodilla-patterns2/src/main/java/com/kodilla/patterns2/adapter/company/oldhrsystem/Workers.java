package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String [] [] workers = {
            {"6702", "John","Smith"},
            {"6208","Ivone", "Novak"},
            {"7502","Jessie","Pinkman"},
            {"7501","Walter", "White"},
            {"7507","Clara","Lanson"}};
    private double [] salaries = {
            4500,
            3700,
            4350,
            9000,
            6200};
    public String getWorker(int n) {
        if (n>salaries.length) {
            return "";
        }
        String coma = ", ";
        return workers[n][0] + coma + workers[n][1] + coma + workers[n][2] + coma + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
