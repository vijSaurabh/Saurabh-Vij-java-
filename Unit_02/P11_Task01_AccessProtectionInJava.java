package Unit_02;

/*
In Java, methods and data members can be encapsulated by the following four access specifiers.
The access specifiers are listed according to their restrictiveness order. 
1) private (accessible within the class where defined) 
2) default or package-private (when no access specifier is specified) 
3) protected (accessible only to classes that subclass your class directly
   within the current or different package)
4) public (accessible from any class) 
 
 */

public class P11_Task01_AccessProtectionInJava {
	public int a = 10;
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.showData();
		obj.accessData();

	}

}
class ParentClass {
	
	int a = 20;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData() {
		System.out.println("Inside Parent Class");
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}
}

class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
//		System.out.println("d = " + d);             //      Private Members cannot be accessed.
	}
}

class AnotherClass{
	void display() {
		
		ParentClass obj = new ParentClass();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
	}
}