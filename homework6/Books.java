package com.epam.homework6;

public class Books {

    private Book[] books;

    public Books(int length) {

        books = new Book[length];
    }

    public Books() {}

    public void addBook(Book book) {

        for(int a = 0; a < books.length; a++) {
            if (books[a] == null) {
                books[a] = book;
                break;
            }
        }
    }

    public void printAllBooks() {

        for(Book a : books) {
            if (a != null) a.view();
            System.out.println();
        }
    }

    public void changePrice(boolean whatChange, double percent) {

        if (whatChange) {
            for (Book book : books) {
                if (book != null)
                    book.setPrice((book.getPrice() * percent / 100) + book.getPrice());
            }
        }
        else {
            for (Book a : books) {
                if (a != null)
                    a.setPrice(a.getPrice() - (a.getPrice() * percent / 100));
            }
        }
    }

    public Book[] findByDate(int date) {

        Book[] newBooks = new Book[books.length];
        int i = 0;

        for(Book a : books) {
            if (a.getYear() > date) {
                newBooks[i++] = a;
            }
        }
        return newBooks;
    }

    public Book[] searchAuthor(String author) {

        Book[] newBooks = new Book[books.length];
        int i = 0;

        for(Book a : books) {
            if (a.getAuthor().equals(author)) {
                newBooks[i++] = a;
            }
        }

        return newBooks;
    }


}