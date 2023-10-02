package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {

        int arraySize;
        int[] data;
        String ans;

        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();

        data = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            data[i] = scanner.nextInt();
        }

        if(data[arraySize - 1] % 10 == 0) {
            ans = "Yes";
        } else {
            ans = "No";
        }

        System.out.println(ans);
    }
}
