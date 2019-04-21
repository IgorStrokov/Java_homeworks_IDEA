package com.epam.model;

public class Book {

    private static int nextID=1;
    private int id;
    private String Name;
    private String Author;
    private String PubHouse;
    private int year;
    private int pages;
    private double price;

    public Book(){

        this.id=nextID++;
    }

    public int getId() { return id;    }
    public String getName() {   return Name;    }
    public void setName(String name) {        this.Name = name;    }
    public String getAuthor() {        return Author;    }
    public void setAuthor(String author) {        this.Author = author;    }
    public String getPubHouse() {        return PubHouse;    }
    public void setPubHouse(String pubHouse) {        this.PubHouse = pubHouse;    }
    public int getYear() {        return year;    }
    public void setYear(int year) {        this.year = year;    }
    public int getPages() {        return pages;    }
    public void setPages(int pages) {        this.pages = pages;    }
    public double getCost() {        return price;    }
    public void setCost(double cost) {        this.price = price;    }

    public Book(String name, String author, String PubHouse, int year, int pages, int costOfBook) {
        this();
        this.Name =name;
        this.Author = author;
        this.PubHouse = PubHouse;
        this.year = year;
        this.pages = pages;
        this.price = costOfBook;
    }



    public void changePrice(double percent){
        this.price= price+price*percent/100;
    }

    public String  toString(){
        return "id: " + this.getId() + " Name: " + this.getName() + " Author: " + this.getAuthor() + " PubHouse: " + this.getPubHouse() +
                " year: " + this.getYear() + " pages: " + this.getPages() + " cost: " + this.getCost();
    }
}
