package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class MaximumBorders {
    public static void main(String[] args) {

        int totalTest;
        int row;
        int column;
        int maximumConsecutiveHash;
        int hashCounter;

        Scanner scanner = new Scanner(System.in);
        totalTest = scanner.nextInt();

        for (int i = 0; i < totalTest; i++) {
            row = scanner.nextInt();
            column = scanner.nextInt();

            char[][] arr = new char[row][column];

            // input
            for (int j = 0; j < row; j++) {
                String rowContent = scanner.next();
                for (int k = 0; k < column; k++) {
                    arr[j][k] = rowContent.charAt(k);
                }
            }

            maximumConsecutiveHash = 0;

            // row-wise scan
            for (int j = 0; j < row; j++) {
                hashCounter = 0;
                for (int k = 0; k < column; k++) {
                    if (arr[j][k] == '#') {
                        hashCounter++;
                    } else if (arr[j][k] == '.') {
                        if (hashCounter > 0) {
                            if (hashCounter > maximumConsecutiveHash) {
                                maximumConsecutiveHash = hashCounter;
                            }
                            hashCounter = 0;
                        }
                    }
                }
                if (hashCounter > maximumConsecutiveHash) {
                    maximumConsecutiveHash = hashCounter;
                }
            }

            // column-wise scan
            for (int j = 0; j < column; j++) {
                hashCounter = 0;
                for (int k = 0; k < row; k++) {
                    if (arr[k][j] == '#') {
                        hashCounter++;
                    } else if (arr[k][j] == '.') {
                        if (hashCounter > 0) {
                            if (hashCounter > maximumConsecutiveHash) {
                                maximumConsecutiveHash = hashCounter;
                            }
                            hashCounter = 0;
                        }
                    }
                }
                if (hashCounter > maximumConsecutiveHash) {
                    maximumConsecutiveHash = hashCounter;
                }
            }

            System.out.println(maximumConsecutiveHash);
        }
    }
}
