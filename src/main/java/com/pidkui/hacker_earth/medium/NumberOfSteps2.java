package com.pidkui.hacker_earth.medium;

import java.io.IOException;
import java.util.Scanner;

public class NumberOfSteps2 {
    public static void main(String[] args) throws IOException {

        int arraySize;
        int[] arrA;
        int[] arrB;
        int minimumNum;
        int step = 0;
        boolean notAllSame = true;

        // input
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();

        arrA = new int[arraySize];
        arrB = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrA[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            arrB[i] = scanner.nextInt();
        }

        // logic
        minimumNum = arrA[0];

        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i] < minimumNum) {
                minimumNum = arrA[i];
            }
        }

        while (notAllSame) {
            notAllSame = false;

            for (int i = 0; i < arraySize; i++) {
                while (arrA[i] > minimumNum) {
                    arrA[i] = arrA[i] - arrB[i];
                    notAllSame = true;
                    step++;
                }

                if (minimumNum > arrA[i]) {
                    minimumNum = arrA[i];
                }
                if (minimumNum < 0) {
                    break;
                }
            }
        }

        if (minimumNum < 0) {
            System.out.println(-1);
        } else {
            System.out.println(step);
        }
    }
}
