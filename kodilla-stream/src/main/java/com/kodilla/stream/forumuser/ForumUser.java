package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int uniqueUserId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPublishedPosts;

    public ForumUser(int uniqueUserId, String userName, char sex, LocalDate dateOfBirth, int numberOfPublishedPosts) {
        this.uniqueUserId = uniqueUserId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPublishedPosts = numberOfPublishedPosts;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPublishedPosts() {
        return numberOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueUserId=" + uniqueUserId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPublishedPosts=" + numberOfPublishedPosts +
                '}';
    }
}