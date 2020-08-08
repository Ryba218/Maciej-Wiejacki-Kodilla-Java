package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().addTask("Task1");
        board.getInProgressList().addTask("Task2");
        board.getToDoList().addTask("Task3");
        //When
        String result1 = board.getDoneList().getTasks().get(0);
        String result2 = board.getInProgressList().getTasks().get(0);
        String result3 = board.getToDoList().getTasks().get(0);
        //Then
        Assert.assertEquals("Task1", result1);
        Assert.assertEquals("Task2", result2);
        Assert.assertEquals("Task3", result3);
    }
}
