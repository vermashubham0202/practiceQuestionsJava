package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class SplitHouses2 {
    public static void main(String[] args) {

        int totalGrids;
        String village;

        Scanner scanner = new Scanner(System.in);
        totalGrids = scanner.nextInt();
        village = scanner.next();

        if(totalGrids < 1 || totalGrids > 20) {
            System.exit(0);
        }

        if(!(totalGrids == village.length())) {
            System.exit(0);
        }

        if(village.contains("HH")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(village.replace(".", "B"));
        }
    }
}
