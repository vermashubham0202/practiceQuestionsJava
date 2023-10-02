package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class CountDivisors {
    public static void main(String[] args) {

        int l;
        int r;
        int k;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        if (l < 1 || l > 1000) {
            System.exit(0);
        }

        r = scanner.nextInt();
        if (r < 1 || r > 1000 || r < l) {
            System.exit(0);
        }

        k = scanner.nextInt();
        if (k < 1 || k > 1000) {
            System.exit(0);
        }

        for (int i = l; i <= r; i++) {
            if (i % k == 0) {
                counter++;
            }
        }

        System.out.print(counter);
    }
}
