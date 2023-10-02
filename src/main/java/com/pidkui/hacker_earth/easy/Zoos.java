package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {
        int zCounter = 0;
        int oCounter = 0;

        boolean flagNoZsAfterOs = false;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() < 20) {
            // length is less than or equals to 20
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'z' && !flagNoZsAfterOs) {
                    zCounter++;
                } else if (str.charAt(i) == 'o') {
                    flagNoZsAfterOs = true;
                    oCounter++;
                } else {
                    flagNoZsAfterOs = false;
                    break;
                }
            }

            if ((2 * zCounter) == oCounter && flagNoZsAfterOs) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } else {
            // length is greater than 20
            System.out.println("No");
        }
    }
}
