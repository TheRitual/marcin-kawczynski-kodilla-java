package com.kodilla.stream;

/*
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import java.util.List;
import java.util.Map;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
 */


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumSex;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - STREAMS!");

        Forum forum = new Forum();

        System.out.println("\n ALL:");
        forum.getUsers().forEach(System.out::println);

        Map<Integer, ForumUser> userMap = forum.getUsers().stream()
                .filter( forumUser -> forumUser.getSex() == ForumSex.MALE)
                .filter( forumUser -> ChronoUnit.YEARS.between(forumUser.getDateOfBirth(), LocalDate.now()) >= 20)
                .filter( forumUser -> forumUser.getAmountOfPosts() >=1 )
                .collect(Collectors.toMap(ForumUser::getUuid, ForumUser -> ForumUser));

        System.out.println("\n Filtered:");
        userMap.entrySet().forEach(System.out::println);

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getPublicationYear() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

/*        BookDirectory bd = new BookDirectory();
        bd.getList().stream()
                .filter(book -> book.getPublicationYear() > 2005)
                .forEach(System.out::println);

        System.out.println();

        List<Book> resultList = bd.getList().stream()
                .filter(book -> book.getPublicationYear() > 2005)
                .collect(Collectors.toList());

        resultList.stream().forEach(System.out::println);

        Map<String, Book> theResultMapOfBooks = bd.getList().stream()
                .filter(book -> book.getPublicationYear() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/

  /*      People.getList().stream()
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1)
                .equals("M"))
                .forEach(System.out::println);*/


        /*SaySomething ss = new SaySomething();
        ss.say();

        Processor proc = new Processor();
        ExecuteSaySomething ess = new ExecuteSaySomething();
        proc.execute(ess);

        Executor thirdLine = () -> System.out.println("What would you do?");
        proc.execute(thirdLine);

        proc.execute(() -> System.out.println("What if I fell to the floor?"));

        System.out.println();

        ExpressionExecutor ee = new ExpressionExecutor();
        ee.execute(12, 13, (a, b) -> (a + b));
        ee.execute(12, 13, (a, b) -> a - b);
        ee.execute(12, 13, (a, b) -> a * b);
        ee.execute(12, 13, (a, b) -> a / b);

        System.out.println();

        ee.execute(12, 13, FunctionalCalculator::add);
        ee.execute(12, 13, FunctionalCalculator::substract);
        ee.execute(12, 13, FunctionalCalculator::multiply);
        ee.execute(12, 13, FunctionalCalculator::divide);

        System.out.println();

        System.out.println(PoemBeautifier.beautify("A warning to the people, the good and the evil", String::toUpperCase));
        System.out.println(PoemBeautifier.beautify("This is WAR", String::toLowerCase));
        System.out.println(PoemBeautifier.beautify("To the soldier, the civilian, the martyr, the victim", txt -> txt.replace(' ', '_')));
        System.out.println(PoemBeautifier.beautify("This is war", txt -> txt.toUpperCase().replace(' ', '_')));
        System.out.println(PoemBeautifier.beautify("It's the moment of truth and the moment to lie", txt -> txt.toLowerCase().replace(' ', '_')));
        System.out.println(PoemBeautifier.beautify("And the moment to live and the moment to die",
                txt -> txt.toUpperCase();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

    }
}
