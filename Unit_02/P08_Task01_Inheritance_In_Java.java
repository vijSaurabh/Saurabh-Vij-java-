package Unit_02;
/*
 * the capability of a class to derive properties and characteristics from another class is
 * called INHERITANCE
 * 
 * In java a class that is inherited is called a SUPERCLASS AND The class that does inheriting 
 * is called SUBCLASS
 * 
 *  To inherit a class we use extends keyword
 *  
 *  SYNTAX :-  class Derived_class_name extends parent_class_name
 *             {
 *                //methods and fields
 *                }
 * types of inheritance:-
 * 1.SINGLE INHERITANCE :- Creating subclasses from a single base class is called single inheritance
 * 2.MULTIPLE INHERITANCE :- It is not available in java  to avoid diamond problem
 * 3.MULTI-LEVEL INHERITANCE :-A class extends to another class which is already derived from another class
 * 4.HIERARCHICAL INHERITANCE :-when more than one child extends from a single parent class
 * 5.HYBRID INHERITANCE:-JAVA DOES NOT SUPPORTED IN JAVA 
 * 
 * CONSTRUCTOR(it is a method which has same name as that of the class and it is invoked when an object is created) FLOW
 * IN A CLASS HIERARCHY ,CONSTRUCTOR ARE CALLED IN THE ORDER OF DERIVATION,FROM SUPERCLASS TO SUBCLASS
 *    
 * DEFAULT CONSTRUCTOR
 * PARAMETERIZED CONSTRUCTOR
 * 
 * 
 */
public class P08_Task01_Inheritance_In_Java {

	public static void main(String[] args) {
		
		Three  g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodThree();
		
		
		
		Two two = new Two(5);
        D obj = new D(2);
        obj.methodFour();
	}

}

class One
{
	int a;
	
	One(int x){
		System.out.println("One constructor");
		System.out.println(x);
	}
	
	public void methodOne(){
		System.out.println("FirstMethod!");
	}	
}

class Two extends One {
	int b;
	
	Two(int x){
		super(3);//it is used to superclass constructor
		b = x;
		System.out.println("TWo");
	}
	public void methodTwo(){
		System.out.println("SecondMethod!");
	}
}

class Three extends Two{
	int c;
	
	Three(){
		super(1);
		System.out.println("Three Constructor!");
	}
	Three(int x){
		super(1);
		c=x;
		System.out.println(c);
	}
	public void methodThree() {
		System.out.println("SecondMethod!");
	}
}

class A{
	int a;
	
	A(int a1){
		a = a1;
	}
	public void methodOne() {
		System.out.println(a);
	}
}

class B extends A {
	int b;
	B(int x){
		super(10);
		b = x;
	}
		public void methodTwo() {
			System.out.println(b);
		}
	}

class C extends A {
	int c;
	
	C(){
		super(10);
		c = 10;
	}
}
class D extends A{
	int d;
	
	D(int d1){
		super(d1);
		d = d1;
	}
	public void methodFour( ) {
		System.out.println(d);
	}
}
















