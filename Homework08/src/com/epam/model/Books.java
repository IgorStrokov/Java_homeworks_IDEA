package com.epam.model;

import com.epam.controller.Verify;

import java.util.Arrays;
import java.util.Comparator;

public class Books {

    private Book [] books;
    private int count=0;

    Verify verify = new Verify();

    public Books(int length) {
        try {
            verify.verifyArrLenght(length);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        books=new Book[length];
    }

    public Book[] getBooks() {
        return books;
    }

    public int getCount() {
        return count;
    }

    public boolean addBook(Book book) {
        if(count >= books.length)
        {
            return false;
        }
        books[count++] = book;
        return true;
    }

    public void changePrice(double percent){
        for(int i = 0;i < count; i++){
            books[i].changePrice(percent);
        }
    }

    public Books findByAuthor(String author){
        try{
            verify.verifyString(author);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        Books newBook = new Books(count);
        for(int i = 0; i < count; i++){
            if(books[i].getAuthor().equalsIgnoreCase(author)){
                newBook.addBook(books[i]);
            }
        }
        return newBook;
    }

    public Books findByYear(int year) {
        try {
            verify.verifyYear(year);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Books newBook = new Books(count);
        for (int i = 0; i < count; i++) {
            if (books[i].getYear() > year) {
                newBook.addBook(books[i]);
            }
        }
        return newBook;
    }

    public Book [] sortByAuthor(){
        Book[] newBooks = Arrays.copyOf(books, count);
        Arrays.sort(newBooks, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });

        return newBooks;
    }

    public Book [] sortByPublisher(){
        Book[] newBooks = Arrays.copyOf(books, count);
        Arrays.sort(newBooks, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPubHouse().compareTo(o2.getPubHouse());
            }
        });

        return newBooks;
    }

    public Book [] sortByCost(){
        Book[] newBooks = Arrays.copyOf(books, count);
        Arrays.sort(newBooks, new Comparator<Book>(){
            @Override
            public int compare(Book b1, Book 22) {
                return (int)(b2.getCost() - b1.getCost());
            }
        });

        return newBooks;
    }

}
