package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemDecorator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*
        Forum forum = new Forum();

        Map<Integer, ForumUser> forumUserMap = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUniqueUserId, ForumUser -> ForumUser));

        forumUserMap.entrySet().stream()
                    .map(entry -> entry.getKey() + ": "+ entry.getValue())
                    .forEach(System.out::println);


    ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    */
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Lambda", (word -> word.toUpperCase()));
        poemBeautifier.beautify("Lambda", (word -> "***" + word + "***"));
        poemBeautifier.beautify("Lambda", (word -> word.replaceAll("Lambda", "LaMbDa")));

        //System.out.println("Using stream to generate even numbers from 1 to 20");

        //NumbersGenerator.generateEven(20);
    }


}