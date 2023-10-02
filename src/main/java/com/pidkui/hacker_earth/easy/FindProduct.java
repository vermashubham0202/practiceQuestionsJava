package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        int arraySize;
        int[] arr;
        long answer = 1;

        Scanner sc = new Scanner(System.in);
        arraySize = sc.nextInt();

        if (arraySize < 1 || arraySize > 1000) {
            System.exit(0);
        }

        arr = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < 1 || arr[i] > 1000) {
                System.exit(0);
            }
        }

        for (int i = 0; i < arraySize; i++) {
            answer = (answer * arr[i]) % (1000000000 + 7);
        }

        System.out.println(answer);
    }
}
