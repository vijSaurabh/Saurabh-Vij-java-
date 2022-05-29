package Unit_02;
/*
 * Overloading allows different methods having the same name in a class but with different 
 * signatures. Signature includes the number of parameters, the data type of parameters and 
 * the sequence of parameters passed in the method.
 * 
 * overriding is a feature that allows a subclass or child class to provide a specific
 *  implementation of a method that is already provided by one of its super classes or 
 *  parent classes
 * 
 */
public class P10_Task01_Overloading_andOverridingInJava{
	public static void main(String[] args) {
		
		OverloadingAndOverridingInJava obj = new OverloadingAndOverridingInJava();
		
		System.out.println("Add() with 2 parameters : ");
		System.out.println(obj.add(4, 6));
		
		System.out.println("Add() with 3 parameters : ");
		System.out.println(obj.add(4, 6, 10));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(3, 2));
		
	}
}


class OverloadingAndOverridingInJava {
	
	// Method Overloading - ??
	// Method Overloading can be done within the same class.
	
	int add(int a , int b) {
		
		System.out.println("Inside OverloadingAndOverridingInJava");
		return a+b;
		
	}
	
	int add(int a, int b, int c) {
		
		System.out.println("Inside OverloadingAndOverridingInJava");
		return a+b+c;
		
	}
	
}

// Overriding In Java - ??
class InheritFirstOne extends OverloadingAndOverridingInJava{
	int add(int a, int b) {
		
		System.out.println("Inside InheritFirstOne");
		return a+b;
		
	}
	
	int add(int a, int b, int c) {
		
		System.out.println("Inside InheritFirstOne");
		return a+b+c;
		
	}
}
