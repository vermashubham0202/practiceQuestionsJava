package com.pidkui.hacker_earth.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {

        int totalTest;
        String number;
        int totalSticks = 0;
        int[] strickHolder = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        Scanner scanner = new Scanner(System.in);
        totalTest = scanner.nextInt();

        for (int t = 0; t < totalTest; t++) {
            totalSticks = 0;

            number = scanner.next();
            BigInteger num = new BigInteger(number);

            if (num.toString().length() < number.length()) {
                totalSticks = (number.length() - num.toString().length()) * 6;
            }

            if (num.compareTo(BigInteger.ZERO) == 0) {
                totalSticks = 6;
            }

            while (num.compareTo(BigInteger.ZERO) > 0) {
                int rem = Integer.parseInt(String.valueOf(num.mod(BigInteger.TEN)));
                num = num.divide(BigInteger.TEN);
                totalSticks += strickHolder[rem];
            }

            if (totalSticks % 2 == 0) {
                for (int i = 0; i < totalSticks / 2; i++) {
                    System.out.print("1");
                }
            } else {
                System.out.print("7");
                for (int i = 0; i < (totalSticks / 2) - 1; i++) {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
