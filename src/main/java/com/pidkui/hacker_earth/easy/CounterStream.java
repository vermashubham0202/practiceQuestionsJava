package com.pidkui.hacker_earth.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterStream {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Samsung");
        myList.add("Nokia");

        AtomicInteger count = new AtomicInteger(0);
        myList.stream().forEach(str-> {
            System.out.println(str);
            count.getAndIncrement();
        });
        System.out.println("Counter " + count);
    }
}
