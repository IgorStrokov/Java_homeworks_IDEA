package com.epam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5_Task2 {
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

    static Integer getOddSum(int[] arr) {
        int exitVal = arr.length - 1;
        int sum = 0;
        for (int i = 0; i <= exitVal; i +=2) {
            sum += arr[i];
        }
        return sum;
    }

    static void printArray(int[] arr) {
        System.out.println("Your array is:\n" + Arrays.toString(arr));
        System.out.println("Sum of odd elements:\n" + getOddSum(arr));
    }
}