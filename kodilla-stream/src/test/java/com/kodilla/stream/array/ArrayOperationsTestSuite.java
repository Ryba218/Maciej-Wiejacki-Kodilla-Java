package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        double expected = 8.0;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(expected,average,0.01);
    }
}
