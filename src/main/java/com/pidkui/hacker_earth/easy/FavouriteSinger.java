package com.pidkui.hacker_earth.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FavouriteSinger {
    public static void main(String[] args) {

        int numberOfSongs;
        int favSingerCount = 0;
        int maximumValue = 0;

        Scanner scanner = new Scanner(System.in);
        numberOfSongs = scanner.nextInt();

        long[] arr = new long[numberOfSongs];

        // input
        for (int i = 0; i < numberOfSongs; i++) {
            arr[i] = scanner.nextLong();
        }

        Map<Long, Integer> singerMusicMap = new HashMap<>();

        // singer's songs count
        for (int i = 0; i < numberOfSongs; i++) {
            if (!singerMusicMap.containsKey(arr[i])) {
                singerMusicMap.put(arr[i], 1);
            } else {
                singerMusicMap.put(arr[i], singerMusicMap.get(arr[i]) + 1);
            }
        }

        // finding maximum value key in hashmap
        for (Map.Entry<Long, Integer> entry : singerMusicMap.entrySet()) {
            if (entry.getValue() > maximumValue) {
                maximumValue = entry.getValue();
                favSingerCount = 1;
            } else if (entry.getValue() == maximumValue) {
                favSingerCount++;
            }
        }

        System.out.println(favSingerCount);
    }
}
