package com.kodilla.good.patterns.allExpensiveShop;

public class User {

    private String userNick;
    private String userName;
    private String userLastName;

    public String getUserNick() {
        return userNick;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNick='" + userNick + '\'' +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                '}';
    }

    public User(final String userNick, final String userName, final String userLastName) {
        this.userNick = userNick;
        this.userName = userName;
        this.userLastName = userLastName;

    }

}
