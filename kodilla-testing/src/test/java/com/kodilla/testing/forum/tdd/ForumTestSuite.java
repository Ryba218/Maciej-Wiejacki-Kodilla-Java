package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the begining of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preeparing to execute test#" + testCounter);
    }
    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //When
        forumUser.addPost("mrsmith","Hello, everyone, this is my first contribution here!");
        //Then
        Assert.assertEquals(1,forumUser.getPostQuantity());
    }
    @Test
    public void testAddComment () {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello, evevryone, " + "this is my first contribution here!", "mrsmith");
        //When
        forumUser.addComment(thePost,"mrsmith", "Thank you for all good words");
        //Then
        Assert.assertEquals(1,forumUser.getCommentsQuantity());
    }
    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello, evevryone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());
        //When
        ForumPost retrivedPost;
        retrivedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost,retrivedPost);

    }
    @Test
    public void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello, evevryone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words","mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment,retrievedComment);

    }
    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello, evevryone, " + "this is my first contribution here!", "mrsmith");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello, evevryone, " + "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words","mrsmith");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemovePost(){
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello, evevryone, " + "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(),thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0,forumUser.getPostQuantity());

    }











}
