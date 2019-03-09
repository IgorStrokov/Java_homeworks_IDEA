package com.epam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework05_Task4 {
    public static void main(String[] args) {
        int[] arr = getArray(getSize());
        int[] negativeArr = getNegativeArr(arr);
        int[] positiveArr = getPositiveArr(arr);
        printArray(arr, negativeArr, positiveArr);
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

    static int getLength(int[] arr) {
        int leng = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                leng++;
            }
        }
        return leng;
    }

    static int[] getNegativeArr(int[] arr) {
        int[] negativeArr = new int[getLength(arr)];
        for (int i = 0, a = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeArr[a] = arr[i];
                a++;
            }
        }
        return negativeArr;
    }

    static int[] getPositiveArr(int[] arr) {
        int leng = arr.length - getLength(arr);
        int[] positiveArr = new int[leng];
        for (int i = 0, a = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveArr[a] = arr[i];
                a++;
            }
        }
        return positiveArr;
    }

    static void printArray(int[] arr, int[] negativeArr, int[] positiveArr) {
        System.out.println("Unsorted array:\n" + Arrays.toString(arr) +
                            "\nNegative array:\n" + Arrays.toString(positiveArr) +
                            "\nPositive array:\n" + Arrays.toString(negativeArr));
    }
}
