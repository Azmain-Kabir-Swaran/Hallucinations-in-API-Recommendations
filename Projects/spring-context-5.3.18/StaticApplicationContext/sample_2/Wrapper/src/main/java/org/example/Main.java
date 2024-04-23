package org.example;


import org.springframework.context.support.StaticApplicationContext;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StaticApplicationContext context = new StaticApplicationContext();

        // Adding beans to the context
        User user = new User("John", "Doe");
        Book book = new Book("12345678", "Spring 5.3");

        context.registerSingleton("user", user);
        context.registerSingleton("book", book);

        context.refresh();

        // Retrieve beans from the context
        User retrievedUser = (User) context.getBean("user");
        Book retrievedBook = (Book) context.getBean("book");

        System.out.println("Retrieved User: " + retrievedUser.toString());
        System.out.println("Retrieved Book: " + retrievedBook.toString());
    }
}