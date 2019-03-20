package com.epam.homework6;

public class Book {

    private int ID;
    private String Name;
    private String Author;
    private String PubHouse;
    private int year;
    private int pages;
    private double price;

    public Book(int ID, String name, String author, String publisher, int year, int pageAmount, double price) {

        this.ID = ID;
        this.Name = name;
        this.Author = author;
        this.PubHouse = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book() {      }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getPubHouse() {
        return PubHouse;
    }
    public void setPubHouse(String pubHouse) {
        this.PubHouse = pubHouse;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public void view() {

        System.out.println("Book №:" + this.getID() + "\nName: " + this.getName() +
                "\nAuthor: " + this.getAuthor() + "\nPublishing House: " + this.getPubHouse() +
                        "\nYear: " + this.getYear() + "\nPages: " + this.getPages() + "\nPrice: " + this.getPrice() + " UAH");
    }
}