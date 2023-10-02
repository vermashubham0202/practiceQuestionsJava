package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String args[]) {

        boolean isPalindrome = true;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() < 1 || str.length() > 100) {
            System.exit(0);
        }

        int length = str.length();
        int halfLength = length / 2;

        if((length % 2) == 1) {
            if((int) str.charAt(halfLength) < 97 || (int) str.charAt(halfLength) > 122) {
                isPalindrome = false;
            }
        }

        for (int i = 0; i < halfLength; i++) {
            if ((str.charAt(i) != str.charAt(length - i - 1)) || !isPalindrome || (int) str.charAt(i) < 97 || (int) str.charAt(i) > 122) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
