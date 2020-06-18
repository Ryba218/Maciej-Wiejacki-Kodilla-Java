package com.kodilla.stream;



import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theUsersMap = forum.getTheUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getPostQuantity()>=1)
                .collect(Collectors.toMap(ForumUser::getNumber,ForumUser -> ForumUser));

        theUsersMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);














        // BookDirectory theBookDirectory = new BookDirectory();

       // Map<String,Book> theResultMapOfBooks = theBookDirectory.getList().stream()
       //        .filter(book -> book.getYearOfPublication() > 2005)
       //        .collect(Collectors.toMap(Book::getSignature,book -> book));

       // System.out.println("# elements: " + theResultMapOfBooks.size());
       // theResultMapOfBooks.entrySet().stream()
       //       .map(entry -> entry.getKey() + ": " + entry.getValue())
       //       .forEach(System.out::println);




        //BookDirectory theBookDirectory = new BookDirectory();
       // List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
       //         .filter(boo -> boo.getYearOfPublication()>2005)
       //         .collect(Collectors.toList());

       // System.out.println("# elements: " + theResultListOfBooks.size());
       // theResultListOfBooks.stream()
       //         .forEach(System.out::println);


        // People.getList().stream()
        //         .map(s ->s.toUpperCase())
        //        .filter(s -> s.length()>11)
        //        .map(s -> s.substring(0,s.indexOf(" ")+2) + ".")
        //        .filter(s -> s.substring(0,1).equals("M"))
        //        .forEach(System.out::println);


        //ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        //System.out.println("Calculating expressions with method references");
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        //expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        // expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        // expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
        // expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
        //expressionExecutor.executeExpression(10,5,(a,b)-> a/b);


       // PoemBeautifier poemBeautifier = new PoemBeautifier();

       // String betterText = poemBeautifier.beautify("some text",(txt -> txt.toUpperCase()));
       // System.out.println(betterText);

        //String betterText2 = poemBeautifier.beautify("some text",(txt -> txt.replaceAll("some text","supertext")) );
        //System.out.println(betterText2);

        //String betterText3 = poemBeautifier.beautify("some text",(txt -> txt.replace(" ","X")));
        //System.out.println(betterText3);

        //String betterText4 = poemBeautifier.beautify("some text",(txt -> "Best " + txt + " ever!" ));
        //System.out.println(betterText4);

        //String betterText5 = poemBeautifier.beautify("SOME TEXT",(txt -> txt.toLowerCase()));
        //System.out.println(betterText5);


        //System.out.println("Using Stream to generate even numbers from 1 to 20");
        //NumbersGenerator.generateEven(20);

    }
}
