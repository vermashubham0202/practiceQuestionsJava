package com.pidkui.geeks_for_geeks;

//Java program to demonstrate Autoboxing

import java.util.ArrayList;
public class AutoBoxing
{
	public static void main(String[] args)
	{
		char ch = 'a';

		// Auto-boxing - primitive to Character object conversion
		Character a = ch;

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Auto-boxing because ArrayList stores only objects
		arrayList.add(25);

		// printing the values from object
		System.out.println(arrayList.get(0));
	}
}
