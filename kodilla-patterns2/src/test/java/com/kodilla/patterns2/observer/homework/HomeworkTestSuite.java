package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void updateTaskTest() {
        //Given
        Student natasha = new Student("Natasha");
        Student stefano = new Student("Stefano");
        Student romek = new Student("Romek");
        Mentor tomasz = new Mentor("Tomasz");
        natasha.registerObserver(tomasz);
        stefano.registerObserver(tomasz);
        romek.registerObserver(tomasz);
        //When
        natasha.addTask("Very difficult task");
        natasha.addTask("The hardest task ever");
        stefano.addTask("Task so difficult, it's hard to describe");
        romek.addTask("Task");
        //Then
        assertEquals(4,tomasz.getUpdateCount());

    }
}
