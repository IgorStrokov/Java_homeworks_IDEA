package com.epam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_Task1 {
    public static void main(String[] args) {
        int[] arr = getArray(getSize());
        printArray(arr);
    }

    static Integer getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter length of array:");
        int size = sc.nextInt();
        if (size < 1) {
            System.out.println("Incorrect number!");
            return null;
        }
        return size;
    }

    static int[] getArray(Integer size) {
        if (size == null) return null;

        int[] newArr = new int[size];
        for (int a = 0; a < size; a++) {
            newArr[a] = (int) (Math.random() * 200) - 100;
        }
        return newArr;
    }

    static int[] revArray(int[] arr) {
        int size = arr.length;
        int[] reverseArray = new int[size];
        for (int i = size - 1,  a = 0; a != size; i--, a++) {
            reverseArray[i] = arr[a];
        }
        return reverseArray;
    }

    static void printArray(int[] arr) {
        System.out.println("You have created an array:\n" + Arrays.toString(arr));
        System.out.println("Reverse array:\n" + Arrays.toString(revArray(arr)));
    }
}

