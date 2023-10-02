package com.pidkui.geeks_for_geeks;

/*
 * Testing what happen when we shift bitwise a negative number.
 */
public class ShiftTest {
    public static void main(String[] args) {

        int i = -10;        // 1 0 1 0
        int k = i << 2;        // 1 0 1 0 0 0
        System.out.println(k);    // -40

        int j = -10;        // 1 0 1 0
        int l = j >> 2;        // 	   1 0
        System.out.println(l);    // -2
    }
}
