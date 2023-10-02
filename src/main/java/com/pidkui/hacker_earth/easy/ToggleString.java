package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class ToggleString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuffer newStr = new StringBuffer(inputString);

        if (inputString.length() < 1 || inputString.length() > 100) {
            System.exit(0);
        }

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLowerCase(inputString.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(inputString.charAt(i)));
            } else {
                newStr.setCharAt(i, Character.toLowerCase(inputString.charAt(i)));
            }
        }
        System.out.println(newStr);
    }
}
