package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;


public class forumStatisticsTestSuite {

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

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @Before
    public void beforeTest() {
        statisticsMock = mock(Statistics.class);

        List<String> mockList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            mockList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(mockList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        forumStatistics = new ForumStatistics();
    }

    @Test
    public void calculateAdvStatisticsWithZeroPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostQuantity());
        assertEquals(0, forumStatistics.getPostsAvgOnUsers(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgOnPosts(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsWithThousandPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostQuantity());
        assertEquals(100, forumStatistics.getPostsAvgOnUsers(), 2000);
        assertEquals(10, forumStatistics.getPostQuantity(), 2000);
    }

    @Test
    public void calculateAdvStatisticsWithZeroComments() {
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsQuantity());
        assertEquals(0, forumStatistics.getCommentsAvgOnPosts(), 0.1);
        assertEquals(0, forumStatistics.getCommentsAvgOnUsers(), 0.1);
    }

    @Test
    public void calculateAdvStatisticsWithCommentsLessThanPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(50, forumStatistics.getPostQuantity());
        assertEquals(20, forumStatistics.getCommentsQuantity());
        assertEquals(2.5, forumStatistics.getPostsAvgOnUsers(), 0.01);
        assertEquals(0.4, forumStatistics.getCommentsAvgOnPosts(), 0.01);
        assertEquals(1.0, forumStatistics.getCommentsAvgOnUsers(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsWithCommentsBiggerThanPosts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(50);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20, forumStatistics.getPostQuantity());
        assertEquals(50, forumStatistics.getCommentsQuantity());
        assertEquals(1.0, forumStatistics.getPostsAvgOnUsers(), 0.01);
        assertEquals(2.5, forumStatistics.getCommentsAvgOnPosts(), 0.01);
        assertEquals(2.5, forumStatistics.getCommentsAvgOnUsers(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsWithZeroUsers() {
        //Given
        List<String> listMock = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUserQuantity());
        assertEquals(0, forumStatistics.getPostsAvgOnUsers(), 0.01);
        assertEquals(0, forumStatistics.getCommentsAvgOnUsers(), 0.01);
    }

    @Test
    public void calculateAdvStatisticsWithHundredUsers() {
        //Given
        List<String> mockList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            mockList.add("User");
        }
        when(statisticsMock.usersNames()).thenReturn(mockList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUserQuantity());
        assertEquals(0.1, forumStatistics.getPostsAvgOnUsers(), 0.01);
        assertEquals(0.2, forumStatistics.getCommentsAvgOnUsers(), 0.01);
    }
}