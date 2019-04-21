package com.epam.view;

import com.epam.controller.Validator;
import com.epam.model.Books;

public class ViewBook {

    Validator validator = new Validator();

    public void print(Books books){
        if(books.getCount()==0){
            System.out.println( "No books!");
        }
        for(int i = 0; i < books.getCount(); i++){
            System.out.println(books.getBooks()[i].toString());
        }
    }
    public void print(String text){
        System.out.println(text);
    }
}