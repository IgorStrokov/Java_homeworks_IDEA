package com.epam.homework3;

public class Task1 {
    public static void main(String[] args) {
        {
            int row = 1;
            while (row < 10) {

                int number = row;
                while (number >= 1) {
                    System.out.print("* ");
                    number--;
                }
                row++;
                System.out.println();
            }

        }

        {
            int row = 8;
            while (row >= 1) {

                int number = row;
                while (number >= 1) {
                    System.out.print("* ");
                    number--;
                }
                row--;
                System.out.println();
            }

        }
    }
}
