package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int num;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        if (num < 1 || num > 10) {
            System.exit(0);
        }

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.print(factorial);
    }
}
