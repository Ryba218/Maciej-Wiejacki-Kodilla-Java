package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int number;
    private String name;
    private char sex;
    private LocalDate birthDate;
    private int postQuantity;

    public ForumUser(int number, String name, char sex, LocalDate birthDate, int postQuantity) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postQuantity = postQuantity;
    }



    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
