package com.epam.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {

    private static Scanner sc = new Scanner(System.in);
    public static int inputInt() {
        int count = 0;
        int maxCount = 4;

        while (count < maxCount) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input a number, you have " + (maxCount - count) + " tries");
            }
            count++;
        }
        throw new InputMismatchException();
    }
    public static String inputString(){
        return sc.next();
    }
}
