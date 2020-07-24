package com.kodilla.good.patterns.challenges;

public class User {


    private String nickName;
    private String email;
    private String adresse;

    public User(String nickName, String email, String adresse) {
        this.nickName = nickName;
        this.email = email;
        this.adresse = adresse;
    }

    public String getNickName() {
        return nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }
}
