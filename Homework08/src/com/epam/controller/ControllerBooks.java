package com.epam.controller;

import com.epam.model.*;
import com.epam.view.*;

import java.util.Scanner;

public class ControllerBooks {

    Scanner sc = new Scanner(System.in);
    private Books books;
    private ViewBook viewBooks=new ViewBook();
    private void init(){

        viewBooks.print("How many books U want me to show?");

        books = new Books(InputUtil.inputInt());

        books.addBook(new Book("Book of happiness", "Mr. Who", "Tetrada", 2000, 76, 245));
        books.addBook(new Book("Almost got it!", "Marry Straith", "MosPub", 1998, 130, 999));
        books.addBook(new Book("English for beginners", "Mr. Who", "CollegePrints", 2018, 230, 100));
        books.addBook(new Book("King of the Ring", "J. R. R. Tolkien", "Abvgdeyka", 2008, 1050, 1050));

    }
    public void run(){
        init();
        viewBooks.print(books);

        while(true) {

            System.out.print("Choose a task (price, author, year, sort(author, cost, publisher)\n" + "Or type 'exit' for quit:\n");
            String task = sc.next();

            switch(task) {

                case "price":
                    try {
                        System.out.print("Write a percent: ");
                        double percent = sc.nextDouble();
                        books.changePrice(percent);
                        viewBooks.print(books);
                    } catch (Exception e) {
                        System.out.println("Invalid value!");
                    }
                    break;

                case "author":
                    System.out.print("Search by author: ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    boolean fillThis = false;
                    for (Book b : books.findByAuthor(author.toLowerCase()) {
                        if (b != null) {
                            System.out.println(b.toString() + "\n");
                            fillThis = true;
                        }
                    }
                    if (!fillThis) System.out.println("No books found!");
                    break;

                case "year":
                    System.out.print("\nWrite a year (yyyy): ");
                    int date = sc.nextInt();
                    fillThis = false;
                    for (Book b : books.findByYear(date)) {
                        if (b != null) {
                            System.out.println(b.toString() + "\n");
                            fillThis = true;
                        }
                    }
                    if (!fillThis) System.out.println("No books found!");
                    break;

                case "sort":
                    switch (task) {
                        case "author":
                    for (Book element : books.sortByAuthor()) {
                        System.out.println(element.getAuthor());
                    }

                case "cost":
                    for (Book element : books.sortByCost()) {
                        System.out.println(element.getCost());
                    }

                case "publisher":
                    for (Book element : books.sortByPublisher()) {
                        System.out.println(element.getPubHouse());
                    }
            }

                default:
                    System.out.println("Wrong command!");
                    break;

                case "exit":
                    return;
            }
        }
    }
}
