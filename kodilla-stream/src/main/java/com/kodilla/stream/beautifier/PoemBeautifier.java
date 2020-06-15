package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String txt, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(txt);
    }
}
