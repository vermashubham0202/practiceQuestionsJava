package com.pidkui.hacker_rank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution13 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
//        Locale inLocale = new Locale.Builder().setLanguageTag("en").setRegion("IN").build();
//        System.out.println(inLocale);
//        System.out.println(inLocale.getDisplayCountry());
        
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String france= NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
	
}
