package com.epam.homework;

import java.util.Arrays;

public class Homework05_Additional2 {
    public static void main(String[] args) {
        int[] arr1 = getArray(getSize());
        int[] arr2 = getArray(getSize());
        int[] concatArr = joinArr(arr1, arr2);
        printArray(arr1, arr2, concatArr);
    }

    static int getSize() {
        int size = (int) (Math.random() * 10);
        return size;
    }

    static int[] getArray(int size) {
        int[] newArr = new int[size];
        for (int a = 0; a < size; a++) {
            newArr[a] = (int) (Math.random() * 10);
        }
        return newArr;
    }

    static int[] joinArr(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }

    static void printArray(int[] arr1, int[] arr2, int[] concatArr) {
        System.out.println("First array is:\n" + Arrays.toString(arr1) +
                "\nSecond array is:\n" + Arrays.toString(arr2) +
                "\nConcatanation array:\n" + Arrays.toString(concatArr));
    }
}
