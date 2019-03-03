package com.epam.homework3;

public class Task3 {
    public static void main(String[] args) {

        int row = 9;
        int number = 0;

        while (row >= 1) {
            int space = row;
            while (space >=1) {
                System.out.print("  ");
                space-- ;
            }
            row-- ;
            while (number < 10) {
                System.out.print("* ");
                number++ ;

            }
            number = row;
            System.out.println();
        }
    }

}
