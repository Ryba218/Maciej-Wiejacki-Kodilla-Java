package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> normalArrayList = new ArrayList<Integer>();
        ArrayList<Integer> emptyArrayList = new ArrayList<Integer>();
        //When
        OddNumbersExterminator completedList1 = new OddNumbersExterminator(emptyArrayList);
        completedList1.exterminate(emptyArrayList);
        //Then
        Assert.assertEquals(normalArrayList,emptyArrayList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalArrayList = new ArrayList<Integer>();
        normalArrayList.add(1);
        normalArrayList.add(2);
        normalArrayList.add(3);
        normalArrayList.add(4);
        ArrayList<Integer> oddArrayExtract = new ArrayList<Integer>();
        oddArrayExtract.add(2);
        oddArrayExtract.add(4);
        //When
        OddNumbersExterminator completedList = new OddNumbersExterminator(normalArrayList);
        completedList.exterminate(normalArrayList);
        //Then
        Assert.assertEquals(oddArrayExtract,normalArrayList);
    }
}
