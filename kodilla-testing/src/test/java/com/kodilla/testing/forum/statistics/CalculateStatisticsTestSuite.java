package com.kodilla.testing.forum.statistics;

import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


public class CalculateStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test passed, is OK");
    }

    @Test
    public void testZeroPosts(){
        //Given
        int posts = 0;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(posts);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int postsQuantity = calculateStatistics.getPosts();
        double postsPerUser = calculateStatistics.getPostsPerUser();
        double commentsPerPosts = calculateStatistics.getCommentsPerPosts();
        //Then
        Assert.assertEquals(0,postsQuantity);
        Assert.assertEquals(0,postsPerUser,0.01);
        Assert.assertEquals(0,commentsPerPosts,0.01);

    }
    @Test
    public void Test1000Posts() {

        //Given
        double posts = 1000;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn((int)posts);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int postsQuantity = calculateStatistics.getPosts();
        double postsPerUser = calculateStatistics.getPostsPerUser();
        double commentsPerPosts = calculateStatistics.getCommentsPerPosts();
        //Then
        Assert.assertEquals(1000, postsQuantity);
        Assert.assertEquals(0,postsPerUser,0.01);
        Assert.assertEquals(0,commentsPerPosts,0.01);
    }

    @Test
    public void TestZeroComments() {
        //Given
        int comments = 0 ;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int commentsQuantity = calculateStatistics.getComments();
        double commentsPerUser = calculateStatistics.getCommentsPerUser();
        double commentsPerPosts = calculateStatistics.getCommentsPerPosts();
        //Then
        Assert.assertEquals(0, commentsQuantity);
        Assert.assertEquals(0,commentsPerUser,0.01);
        Assert.assertEquals(0,commentsPerPosts,0.01);
    }
    @Test
    public void testPostsMoreThanComments() {
        //Given
        int comments = 50;
        int posts = 100;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int commentsQuantity = calculateStatistics.getComments();
        int postsQuantity = calculateStatistics.getPosts();
        double commentsPerPosts = calculateStatistics.getCommentsPerPosts();
        //Then
        Assert.assertTrue(commentsQuantity < postsQuantity);
        Assert.assertEquals(0.5,commentsPerPosts,0.5);
    }

    @Test
    public void testCommentsMoreThanPosts() {
        //Given
        int comments = 200;
        int posts = 100;

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int commentsQuantity = calculateStatistics.getComments();
        int postsQuantity = calculateStatistics.getPosts();
        double commentsPerPosts = calculateStatistics.getCommentsPerPosts();
        //Then
        Assert.assertTrue(commentsQuantity > postsQuantity);
        Assert.assertEquals(2,commentsPerPosts,0);

    }
    @Test
    public void testZeroUsers() {
        //Given
        List<String> users = new ArrayList<>();

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(users);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int usersQuantity = calculateStatistics.getUsers();
        //Then
        Assert.assertEquals(0,usersQuantity);
    }

    @Test
    public void testOneHundredUsers() {
        //Given
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            users.add("User" + i);
        }

        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.userNames()).thenReturn(users);

        CalculateStatistics calculateStatistics = new CalculateStatistics();
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int usersQuantity = calculateStatistics.getUsers();
        //Then
        Assert.assertEquals(100,usersQuantity);
    }




}
