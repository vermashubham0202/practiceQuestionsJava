package com.pidkui.hacker_earth.easy;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        // create a HashMap object
        HashMap<String, Integer> map = new HashMap<>();

        // add key-value pairs to the map
        map.put("Alice", 25);
        map.put("alice", 30);
        map.put("Charlie", 35);

        // iterate over keys and values
        for (String key : map.keySet()) {
            System.out.println(key + " is " + map.get(key) + " years old.");
        }
    }
}
