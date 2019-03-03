package com.epam.homework3;

public class Task2 {
    public static void main(String[] args) {

        int row = 1;
        int number = 9;

        while (row < 10) {
            int space = row;
            while (space >=1) {
                System.out.print("  ");
                space-- ;
            }
            row++ ;
            while (number >= 1) {
                System.out.print("* ");
                number-- ;

            }
            number = (10 - row);
            System.out.println();
        }
    }
}