package com.epam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_Additional3 {
    public static void main(String[] args) {
        int[] arr = getArray(getSize());
        int maxValue = getMax(arr);
        int minValue = getMin(arr);
        int[] newArr = getIndivid(arr, maxValue, minValue);
        printArr(arr, maxValue, minValue, newArr);

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
            newArr[a] = (int) (Math.random() * 5);
        }
        return newArr;
    }

    static int getMax(int[] arr) {
        int maxVal = arr[1];
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int getMin(int[] arr) {
        int minVal = arr[1];
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    static int[] getIndivid(int[] arr, int maxValue, int minValue) {
        int size = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] != minValue) {
                if (arr[a] != maxValue) {
                    size++;
                }
            }
        }
        int[] newArray = new int[size];
        for (int a = 0, i = 0; a < arr.length; a++) {
            if (arr[a] != minValue) {
                if (arr[a] != maxValue) {
                    newArray[i] = arr[a];
                    i++;
                }
            }
        }
        return newArray;
    }

    static void printArr(int[] arr, int maxValue, int minValue, int[] newArr) {
        System.out.println(Arrays.toString(arr));
        System.out.println(minValue);
        System.out.println(maxValue);
        System.out.println(Arrays.toString(newArr));
    }

}
