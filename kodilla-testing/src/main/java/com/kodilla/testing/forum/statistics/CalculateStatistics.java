package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private int users;
    private int posts;
    private int comments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPosts;



    public void calculateAdvStatistics(Statistics statistics){


        this.users = statistics.userNames().size();
        this.posts = statistics.postsCount();
        this.comments = statistics.commentsCount();
        this.postsPerUser = calculatePostsPerUser() ;
        this.commentsPerUser =calculateCommentsPerUser() ;
        this.commentsPerPosts = calcualteCommentsPerPost() ;

    }

    private double calculatePostsPerUser () {
        if (this.users>0){
            return (double) this.posts/this.users;
        } else{
            return 0;
        }
    }

    private double calculateCommentsPerUser () {
        if (this.users>0) {
            return (double) this.comments/this.users;
        } else {
            return 0;
        }
    }

    private double calcualteCommentsPerPost () {
        if (this.posts>0) {
            return (double) this.comments/this.posts;
        } else {
            return 0;
        }
    }





    public void ShowStatistics() {
        System.out.println("Users: " + users);
        System.out.println("Posts: " + posts);
        System.out.println("Comments: " + comments);
        System.out.println("Posts pre user: " + postsPerUser);
        System.out.println("Comments per user: " + commentsPerUser);
        System.out.println("Comments per posts: " + commentsPerPosts);

    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPosts() {
        return commentsPerPosts;
    }
}




