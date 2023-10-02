package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class SplitHouses {
    public static void main(String[] args) {

        int totalGrids;
        String village;
        String newVillage = "";
        boolean houseOccur = false;

        Scanner scanner = new Scanner(System.in);
        totalGrids = scanner.nextInt();
        village = scanner.next();

        for (int i = 0; i < village.length(); i++) {
            if (village.charAt(i) == 'H' && !houseOccur) {
                newVillage += "H";
                houseOccur = true;
            } else if (village.charAt(i) == 'H' && houseOccur) {
                break;
            } else {
                newVillage += "B";
                houseOccur = false;
            }
        }

        if (newVillage.length() == village.length()) {
            System.out.println("YES");
            System.out.println(newVillage);
        } else {
            System.out.println("NO");
        }
    }
}
