package com.kodilla.patterns;

import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {




    @BeforeClass
    public static void saveLogger() {
        Logger.getInstance().log("John");
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String login = Logger.getInstance().getLastLog();
        System.out.println("Logged: " + login);
        //Then
        Assert.assertEquals("John", login );
    }

}
