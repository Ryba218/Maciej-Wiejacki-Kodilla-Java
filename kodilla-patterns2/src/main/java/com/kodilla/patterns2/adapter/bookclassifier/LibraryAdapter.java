package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class LibraryAdapter extends LibraryAdaptee implements Classifier   {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature,com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = bookSet.stream()
                .collect(Collectors.toMap(b -> new BookSignature(b.getSignature()),
                        b -> new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                                b.getAuthor(),
                                b.getTitle(),
                                b.publicationYear
                        )));
        return medianPublicationYear(bookMap);
    }
}
