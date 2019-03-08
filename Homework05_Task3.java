package com.epam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_Task3 {
    public static void main(String[] args) {
        int[] arr1 = getArray1(getSize());
        int[] arr2 = getArray2(arr1);
        int[] oddArr = getOddArr(arr1, arr2);
        printArray(arr1, arr2, oddArr);
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

    static int[] getArray1(Integer size) {
        if (size == null)
            return null;

        int[] arr1 = new int[size];
        for (int a = 0; a < size; a++) {
            arr1[a] = (int) (Math.random() * 20) - 10;
        }
        return arr1;
    }

    static int[] getArray2(int[] arr1) {
        int size = arr1.length;

        int[] arr2 = new int[size];
        for (int a = 0; a < size; a++) {
            arr2[a] = (int) (Math.random() * 20) - 10;
        }
        return arr2;

    }

    static int[] getOddArr(int[] arr1, int[] arr2) {
        int oddSize = (arr1.length / 2) + (arr1.length % 2);
        int[] oddArr = new int[oddSize];
        for (int i = 0, a = 0; a < oddSize ; i = i + 2, a++) {
          oddArr[a] = arr1[i] + arr2[i];
        }
        return oddArr;
    }

    static void printArray(int[] arr1, int[] arr2, int[] oddArr) {
        System.out.println("Your first array is:\n" + Arrays.toString(arr1) +
                "\nYour second array is:\n" + Arrays.toString(arr2) + "\nOdd array You've got:\n" + Arrays.toString(oddArr));
    }
}
