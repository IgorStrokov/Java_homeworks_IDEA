package com.epam.controller;

public class Verify {

    public void verifyArrayLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException(" The length has to be more then 0 ");
        }
    }

    public void verifyYear(int year) throws Exception {
        if (year < 1700 || year > books.length) {
            throw new Exception(" Incorrect input of the year ");
        }
    }
    public void verifyString(String string) throws Exception{
        if(string == null){
            throw new Exception(" The string couldn't be empty ");
        }
    }
}
