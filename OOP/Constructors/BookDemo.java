package Constructors;

import java.util.Scanner;

class Book {

    String title;
    String author;
    Double price;

    Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Double price = sc.nextDouble();
        Book b = new Book(title, author, price);
        b.display();
    }
}
