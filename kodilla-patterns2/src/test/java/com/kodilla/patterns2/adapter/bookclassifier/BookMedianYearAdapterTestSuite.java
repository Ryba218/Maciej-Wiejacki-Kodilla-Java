package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;


public class BookMedianYearAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> setOfBooks = new HashSet<>();
        setOfBooks.add(new Book("Author1","Title1",1900,"1"));
        setOfBooks.add(new Book("Author2","Title2",1910,"1"));
        setOfBooks.add(new Book("Author3","Title3",1920,"1"));
        setOfBooks.add(new Book("Author4","Title4",1930,"1"));
        setOfBooks.add(new Book("Author5","Title5",1940,"1"));
        //When
        LibraryAdapter adapter = new LibraryAdapter();
        int medianYear = adapter.publicationYearMedian(setOfBooks);
        //Then
        Assert.assertEquals(medianYear,1920);

    }
}
