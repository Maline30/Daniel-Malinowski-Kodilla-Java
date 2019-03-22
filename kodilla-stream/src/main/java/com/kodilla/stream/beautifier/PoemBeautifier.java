package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String word, PoemDecorator poemDecorator) {
        String results = poemDecorator.decorate(word);
            System.out.println(results);

    }
}
