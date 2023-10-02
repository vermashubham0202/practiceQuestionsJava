package com.pidkui.hacker_earth.easy;

import java.util.Scanner;

public class RoyAndProfilePicture {
    public static void main(String[] args) {
        int length;
        int numberOfPhotos;
        int width;
        int height;

        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();

        if (length < 1 || length > 10000) {
            System.exit(0);
        }

        numberOfPhotos = sc.nextInt();
        if (numberOfPhotos < 1 || numberOfPhotos > 1000) {
            System.exit(0);
        }

        for (int i = 0; i < numberOfPhotos; i++) {
            width = sc.nextInt();
            if (width < 1 || width > 10000) {
                System.exit(0);
            }

            height = sc.nextInt();
            if (height < 1 || height > 10000) {
                System.exit(0);
            }

            if (width < length || height < length) {
                System.out.println("UPLOAD ANOTHER");
            } else {
                if (width == height) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}
