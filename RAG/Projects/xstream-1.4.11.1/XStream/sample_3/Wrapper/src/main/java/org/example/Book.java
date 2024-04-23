package org.example;

import com.thoughtworks.xstream.XStream;

class Book {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", price=" + price + "]";
    }
}