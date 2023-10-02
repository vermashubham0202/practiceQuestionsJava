package com.pidkui.geeks_for_geeks;

public class StaticDemo {

	public static void main(String[] args) {
		
		//Accessing class variable
		System.out.println(X.i);
		
		/*
		 * If we access the static variable like the Instance variable (through an object),
		 * the compiler will show the warning message, which won’t halt the program.
		 * The compiler will replace the object name with the class name automatically.
		 */
		X obj = new X();
		System.out.println(obj.i);
		
		X.show();
	}

}

class X {
	static int i = 5;
	static public void show() {
		/*
		 * If we access the static variable without the class name,
		 * the compiler will automatically append the class name
		 */
		System.out.println(i);
	}
}