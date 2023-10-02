package com.pidkui.geeks_for_geeks;

public class RunTimeBindingFact {

	public static void main(String[] args) {
		
		A a = new B();
		B b = new B();
		
		System.out.println(a.i);
		System.out.println(b.i);
		a.show();
		b.show();

	}

}

class A {
	
	public int i = 16;
	
	public void show() {
		System.out.println("In show A");
	}
}

class B extends A {
	
	public int i = 2;
	
	public void show() {
		System.out.println("In show B");
	}
}