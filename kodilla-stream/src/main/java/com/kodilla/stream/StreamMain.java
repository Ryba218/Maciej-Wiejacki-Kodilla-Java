package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.FunctionalCalculator;
import com.kodilla.stream.lambda.Processor;


public class StreamMain {
    public static void main(String[] args) {


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


        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String betterText = poemBeautifier.beautify("some text",(txt -> txt.toUpperCase()));
        System.out.println(betterText);

        String betterText2 = poemBeautifier.beautify("some text",(txt -> txt.replaceAll("some text","supertext")) );
        System.out.println(betterText2);

        String betterText3 = poemBeautifier.beautify("some text",(txt -> txt.replace(" ","X")));
        System.out.println(betterText3);

        String betterText4 = poemBeautifier.beautify("some text",(txt -> "Best " + txt + " ever!" ));
        System.out.println(betterText4);

        String betterText5 = poemBeautifier.beautify("SOME TEXT",(txt -> txt.toLowerCase()));
        System.out.println(betterText5);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);




    }
}
