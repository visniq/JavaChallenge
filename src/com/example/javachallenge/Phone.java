package com.example.javachallenge;

public class Phone {
    private static String phoneName;
    private static String userName;

    public Phone(String phoneName, String userName) {
        this.phoneName = phoneName;
        this.userName = userName;
    }


    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
