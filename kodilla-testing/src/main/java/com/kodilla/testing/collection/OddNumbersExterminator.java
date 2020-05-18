package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    ArrayList<Integer> numbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers){

        this.numbers = numbers;
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        int i = numbers.size();
        while(i!=0) {
            i--;
            System.out.println("ArrayList elelment: " + i);
            if (numbers.get(i) % 2 != 0) {
                System.out.println("Deleting odd number");
                numbers.remove(i);
            } else {
                System.out.println("Even number - stays");
            }

        }
        System.out.println("ArrayList with even numbers size: " + numbers.size());
        return numbers;
    }
}
