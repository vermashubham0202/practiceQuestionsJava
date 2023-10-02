package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class SevenSegmentDisplay2 {
    public static void main(String[] args) {

        int totalTest;
        String number;
        int totalSticks;
        int[] strickHolder = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        Scanner scanner = new Scanner(System.in);
        totalTest = scanner.nextInt();

        for (int i = 0; i < totalTest; i++) {
            number = scanner.next();

            totalSticks = 0;
            for (int j = 0; j < number.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(number.charAt(j)));
                totalSticks += strickHolder[digit];
            }

            if (totalSticks % 2 == 0) {
                for (int k = 0; k < totalSticks / 2; k++) {
                    System.out.print("1");
                }
            } else {
                System.out.print("7");
                totalSticks -= 3;
                for (int k = 0; k < totalSticks / 2; k++) {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
