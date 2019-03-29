package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {

        usersList.add(new ForumUser(1, "John", 'M', LocalDate.of(1992, 6, 12), 1));
        usersList.add(new ForumUser(2, "Paulina", 'F', LocalDate.of(1996, 5, 24), 3));
        usersList.add(new ForumUser(3, "Julian", 'M', LocalDate.of(2002, 2, 12), 0));
        usersList.add(new ForumUser(4, "Kinga", 'F', LocalDate.of(1992, 3, 12), 4));
        usersList.add(new ForumUser(5, "Dorota", 'F', LocalDate.of(2012, 11, 12), 23));
        usersList.add(new ForumUser(6, "Piotr", 'M', LocalDate.of(1996, 12, 12), 11));
        usersList.add(new ForumUser(7, "Krystian", 'M', LocalDate.of(1998, 7, 12), 65));
        usersList.add(new ForumUser(8, "Agnieszka", 'F', LocalDate.of(1988, 8, 12), 2));
        usersList.add(new ForumUser(9, "Daniel", 'M', LocalDate.of(1972, 10, 12), 1));
        usersList.add(new ForumUser(10, "Adam", 'M', LocalDate.of(1998, 9, 12), 123));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}