package com.pidkui.geeks_for_geeks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		/* Getting hold of Class
           object created by JVM. */
		Class c1 = s1.getClass();
		
		// Printing type of object using c1.
		System.out.println(c1.getName());
		
		// getting all constructors in an array
		Constructor[] con = c1.getDeclaredConstructors();
		for(Constructor c : con) {
			System.out.println(c);
		}
		
		// getting all fields in an array
		Field[] f = c1.getDeclaredFields();
		for(Field field : f) {
			System.out.println(field);
		}
		
		// getting all methods in an array
		Method[] m = c1.getDeclaredMethods();
		for(Object mm : m) {
			System.out.println(mm);
		}
		

	}

}

/*A sample class whose information
  is fetched above using its Class object.*/
class Student {
	int rollNumber;
	String name;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}