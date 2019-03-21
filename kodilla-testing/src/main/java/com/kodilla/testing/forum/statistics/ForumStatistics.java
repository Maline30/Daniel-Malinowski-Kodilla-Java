package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int userQuantity;
    private int postQuantity;
    private int commentsQuantity;
    private double commentsAvgOnUsers;
    private double postsAvgOnUsers;
    private double commentsAvgOnPosts;

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getCommentsAvgOnUsers() {
        return commentsAvgOnUsers;
    }

    public double getPostsAvgOnUsers() {
        return postsAvgOnUsers;
    }

    public double getCommentsAvgOnPosts() {
        return commentsAvgOnPosts;
    }

    public void calculateAdvStatistics(Statistics statistics){
        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        commentsAvgOnPosts = calculateCommentsAvgOnPosts();
        commentsAvgOnUsers = calculateCommentsAvgOnUser();
        postsAvgOnUsers = calculatePostAvgOnUsers();
    }

    double calculatePostAvgOnUsers(){
        if(userQuantity > 0){
            return (double)postQuantity / userQuantity;
        }else{
            return 0;
        }
    }

    double calculateCommentsAvgOnUser(){
        if(userQuantity > 0){
            return (double)commentsQuantity / userQuantity;
        }else{
            return 0;
        }
    }

    double calculateCommentsAvgOnPosts(){
        if(postQuantity > 0){
            return (double)commentsQuantity / postQuantity;
        }else{
            return 0;
        }
    }

    void showForumStatistics(){
        System.out.println("Forum Statistics");
        System.out.println("Users: " + userQuantity);
        System.out.println("Posts: " + postQuantity);
        System.out.println("Comments: " + commentsQuantity);
        System.out.println("Average Posts on Users: " + calculatePostAvgOnUsers());
        System.out.println("Average Comments on Users: " + calculateCommentsAvgOnUser());
        System.out.println("Average Comments on Posts: " + calculateCommentsAvgOnPosts());
    }
}
