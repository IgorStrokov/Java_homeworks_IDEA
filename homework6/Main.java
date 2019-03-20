package com.epam.homework6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Books books = new Books(4);

        books.addBook(new Book(1, "Book of happiness", "Mr. Who", "Tetrada", 2000, 76, 245));
        books.addBook(new Book(2, "Almost got it!", "Marry Straith", "MosPub", 1998, 130, 999));
        books.addBook(new Book(3, "English for beginners", "Colledge", "CollegePrints", 2018, 230, 100));
        books.addBook(new Book(4, "King of the Ring", "J. R. R. Tolkien", "Abvgdeyka", 2008, 1050, 1050));

        System.out.println("Aviable books:\n");

        books.printAllBooks();

        while(true) {

            System.out.print("Choose a task: \n(price, author, year)\n");
            String task = sc.next();

            switch(task) {

                case "price":
                    try {
                        System.out.print("Write a percent: ");
                        double percent = sc.nextDouble();
                        books.changePrice(true, percent);
                        books.printAllBooks();
                    }
                    catch(Exception e) {
                        System.out.println("Invalid value!");
                    }
                    break;

                case "author":
                    System.out.print("Search by author: ");
                    sc.nextLine();
                    String author = sc.nextLine();
                    boolean fillThis = false;
                    for(Book b : books.searchAuthor(author)) {
                        if (b != null) {
                            b.view();
                            fillThis = true;
                        }
                    }
                    if (!fillThis) System.out.println("No books found!");
                    break;

                case "year":
                    System.out.print("\nWrite a year (yyyy): ");
                    int date = sc.nextInt();
                    fillThis = false;
                    for(Book b : books.findByDate(date)) {
                        if (b != null) {
                            b.view();
                            fillThis = true;
                        }
                    }
                    if (!fillThis) System.out.println("No books found!");
                    break;
                default:
                    System.out.println("Wrong search!");
                    break;
            }
        }
    }
}