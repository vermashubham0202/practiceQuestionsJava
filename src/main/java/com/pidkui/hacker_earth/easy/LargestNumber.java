package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        String num;
        int k;

        Scanner scanner = new Scanner(System.in);
        num = scanner.next();
        k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            num = maxAfterDeletion(num);
        }
        System.out.print(num);
    }

    public static String maxAfterDeletion(String num) {
        long maximum = Long.MIN_VALUE;

        for (int i = 0; i < num.length(); i++) {
            long indexRemovedNum = Long.parseLong(num.substring(0, i) + num.substring(i + 1, num.length()));
            if (indexRemovedNum > maximum) {
                maximum = indexRemovedNum;
            }
        }
        return String.valueOf(maximum);
    }
}
