package com.pidkui.hacker_earth.medium;

import java.util.Scanner;

public class BestIndex {
    public static void main(String[] args) {

        int arraySize;
        int[] arr;
        long[] sumHolder;
        long sum;
        long maximumSum = Long.MIN_VALUE;
        int totalElement;

        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();

        arr = new int[arraySize];
        sumHolder = new long[arraySize];

        // input
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scanner.nextInt();
            if (i == 0) {
                sumHolder[i] = arr[i];
            } else {
                sumHolder[i] = sumHolder[i - 1] + arr[i];
            }
        }

        // logic
        for (int i = 0; i < arraySize; i++) {
            totalElement = arraySize - i;

            int n = 1;
            while (n * (n + 1) <= totalElement * 2) {
                n++;
            }
            n--;

            int index = (n * (n + 1)) / 2 + i - 1;

            if (i == 0) {
                sum = sumHolder[index];
            } else {
                sum = sumHolder[index] - sumHolder[i - 1];
            }

            if (sum > maximumSum) {
                maximumSum = sum;
            }
        }
        System.out.print(maximumSum);
    }
}
