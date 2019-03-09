package com.epam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_Additional1 {
    public static void main(String[] args) {
        int[] arr = getArray(getSize());
        int average = getAverage(arr);
        int[] averageArr = getAverageArr(arr, average);
        printArr(arr, average, averageArr);
    }

    private static void printArr(int[] arr, int average, int[] averageArr) {
        System.out.println("Your array is:\n" + Arrays.toString(arr) +
                "\nAverage is:\n" + average +
                "\nAverage array\n" + Arrays.toString(averageArr));
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

    static int getAverage(int[] arr) {
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average /= arr.length;
        return average;
    }

    static int[] getAverageArr(int[] arr, int average) {
        int size = 0;
        for (int a = 0 ; a < arr.length ; a++) {
            if (arr[a] > average) {
                size++;
            }
        }
        int[] averArray = new int[size];
        for (int i = 0, a = 0; a < arr.length; a++) {
            if(arr[a] > average) {
                averArray[i] = arr[a];
                i++;
            }
        }
        return averArray;
    }
}
