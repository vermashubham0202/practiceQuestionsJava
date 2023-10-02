package com.pidkui.geeks_for_geeks;

/*
 * it will run!
 * See the program carefully, inner loop will terminate before the outer loop variable is declared.
 * So the inner loop variable is destroyed first and then the new variable of same name has been created.
 */
public class ScopeDemo3 {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}
