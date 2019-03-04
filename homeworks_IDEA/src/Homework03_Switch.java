package com.epam.excectural;

import java.util.Scanner;

public class Homework03_Switch {
    public static void main(String[] args) {

        System.out.println("Hello! Plz, type a number from 1 to 5 to see a triangle:");

        Scanner sc = new Scanner(System.in);
        int triangle = sc.nextInt();

        if ((0 < triangle) & (triangle < 6)) {
            switch (triangle) {
                case 1: {
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
                break;

                case 2: {
                    int row = 1;
                    int number = 9;

                    while (row < 10) {
                        int space = row;
                        while (space >= 1) {
                            System.out.print("  ");
                            space--;
                        }
                        row++;
                        while (number >= 1) {
                            System.out.print("* ");
                            number--;

                        }
                        number = (10 - row);
                        System.out.println();
                    }
                }
                break;
                case 3: {
                    int row = 9;
                    int number = 0;

                    while (row >= 1) {
                        int space = row;
                        while (space >= 1) {
                            System.out.print("  ");
                            space--;
                        }
                        row--;
                        while (number < 10) {
                            System.out.print("* ");
                            number++;

                        }
                        number = row;
                        System.out.println();
                    }
                }
                break;
                case 4: {
                    int row = 9;
                    int number = 0;

                    while (row >= 1) {
                        int space = row;
                        while (space >= 1) {
                            System.out.print("  ");
                            space--;
                        }
                        row--;
                        while (number < 10) {
                            System.out.print("* ");
                            number++;

                        }
                        number = row;
                        System.out.println();
                    }

                }

                {
                    int row = 1;
                    int number = 9;

                    while (row < 10) {
                        int space = row;
                        while (space >= 1) {
                            System.out.print("  ");
                            space--;
                        }
                        row++;
                        while (number >= 1) {
                            System.out.print("* ");
                            number--;

                        }
                        number = (10 - row);
                        System.out.println();
                    }
                }
                break;
                case 5: {
                    int row = 9;
                    int number = 0;

                    while (row >= 1) {
                        int space = row;
                        while (space >= 1) {
                            System.out.print("  ");
                            space--;
                        }
                        row--;
                        while (number < 10) {
                            System.out.print("* ");
                            System.out.print("* ");
                            number++;

                        }
                        number = row;
                        System.out.println();
                    }
                }

                {
                    int row = 9;
                    int number = 0;

                    while (row >= 1) {
                        int space = row;
                        while (space >= 1) {
                            System.out.print("  ");
                            space--;
                        }
                        row--;
                        while (number < 10) {
                            System.out.print("* ");
                            System.out.print("* ");
                            number++;

                        }
                        number = row;
                        System.out.println();
                    }
                }
                break;
                default:
                    System.out.println("Please, type correct number (1-5)!");
                    break;
            }
            }
        else {
            System.out.println("Incorrect number, plz try again!");
        }


    }
}
