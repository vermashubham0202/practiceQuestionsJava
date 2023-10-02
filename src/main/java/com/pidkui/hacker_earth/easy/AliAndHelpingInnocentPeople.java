package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class AliAndHelpingInnocentPeople {
    public static void main(String[] args) {

        String tag;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        tag = scanner.nextLine();

        if((Character.getNumericValue(tag.charAt(0)) + Character.getNumericValue(tag.charAt(1))) % 2 != 0) {
            flag = false;
        }
        if(tag.charAt(2) == 'A' || tag.charAt(2) == 'E' || tag.charAt(2) == 'I' || tag.charAt(2) == 'O' || tag.charAt(2) == 'U' || tag.charAt(2) == 'Y') {
            flag = false;
        }
        if((Character.getNumericValue(tag.charAt(3)) + Character.getNumericValue(tag.charAt(4))) % 2 != 0) {
            flag = false;
        }
        if((Character.getNumericValue(tag.charAt(4)) + Character.getNumericValue(tag.charAt(5))) % 2 != 0) {
            flag = false;
        }
        if((Character.getNumericValue(tag.charAt(7)) + Character.getNumericValue(tag.charAt(8))) % 2 != 0) {
            flag = false;
        }

        if(flag) {
            System.out.print("valid");
        } else {
            System.out.print("invalid");
        }
    }
}
