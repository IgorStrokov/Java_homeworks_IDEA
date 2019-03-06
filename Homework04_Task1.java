package com.epam.homework04;

import java.util.Scanner;

public class Homework04_Task1 {
    public static StringBuilder getBinary(int d) {
        StringBuilder sb = new StringBuilder();

        System.out.println("Your number is:" + d);
        int x = 1;
        for (int i = 0; i < 32; i++) {
            sb.append((d & x) == 0 ? "0" : "1");
        }
        sb = sb.reverse();
        return sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();



        String str = getBinary(int d);
        System.out.println(str);
    }
}
