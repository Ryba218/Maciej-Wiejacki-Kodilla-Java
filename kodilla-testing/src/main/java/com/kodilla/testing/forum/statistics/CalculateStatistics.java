package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private double users;
    private double posts;
    private double comments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPosts;



    public void calculateAdvStatistics(Statistics statistics){


        this.users = statistics.userNames().size();
        this.posts = statistics.postsCount();
        this.comments = statistics.commentsCount();
        this.postsPerUser = this.posts/this.users;
        this.commentsPerUser = this.comments/this.users;
        this.commentsPerPosts = this.comments/this.posts;

    }

    public void ShowStatistics() {
        System.out.println("Users: " + users);
        System.out.println("Posts: " + posts);
        System.out.println("Comments: " + comments);
        System.out.println("Posts pre user: " + postsPerUser);
        System.out.println("Comments per user: " + commentsPerUser);
        System.out.println("Comments per posts: " + commentsPerPosts);

    }

    public double getUsers() {
        return users;
    }

    public double getPosts() {
        return posts;
    }

    public double getComments() {
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




