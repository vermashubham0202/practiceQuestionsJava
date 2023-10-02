package com.pidkui.hacker_earth.medium;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfSteps {
    public static void main(String[] args) {

        int arraySize;
        int[] arrA;
        int[] arrB;
        int minimumNum;
        int minimumNumIndex;
        boolean isAllEqualToMinNum = true;
        int step = 0;

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
        // find minimum in arrA[i]
        minimumNum = arrA[0];
        minimumNumIndex = 0;

        for (int i = 1; i < arrA.length; i++) {
            if (arrA[i] < minimumNum) {
                minimumNum = arrA[i];
                minimumNumIndex = i;
            }
        }

        int[] arrATemp = Arrays.copyOf(arrA, arrA.length);
        // except minimum number index is it possible to reduce all other numbers to minimum number
        while (arrATemp[minimumNumIndex] > arrB[minimumNumIndex]) {
            isAllEqualToMinNum = true;
            minimumNum = arrATemp[minimumNumIndex];

            for (int i = 0; i < arraySize; i++) {
                if (i != minimumNumIndex) {
                    while (arrATemp[i] > minimumNum) {
                        arrATemp[i] -= arrB[i];
                        step++;
                    }
                    if (arrATemp[i] != minimumNum) {
                        break;
                    }
                }
            }

            for (int num : arrATemp) {
                if (num != minimumNum) {
                    isAllEqualToMinNum = false;
                    break;
                }
            }

            if (isAllEqualToMinNum) {
                break;
            }

            // copy all other elements as it is except minimum number index
            for (int i = 0; i < arrA.length; i++) {
                if (i != minimumNumIndex) {
                    arrATemp[i] = arrA[i];
                }
            }
            arrATemp[minimumNumIndex] -= arrB[minimumNumIndex];
            step = (arrA[minimumNumIndex] - arrATemp[minimumNumIndex]) / arrB[minimumNumIndex];
        }

        if (isAllEqualToMinNum) {
            System.out.println(step);
        } else {
            System.out.println("-1");
        }
    }
}
