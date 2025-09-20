package superDemo;

public class A {

	A(char b) {
		
		System.out.println("I am A class constructor");
	}
}

class B extends A{
	
	B(float a) {
		super('d');
		System.out.println("I am B class Constructor");
	}
}
class Test{
	public static void main(String args[]) {
		
		B obj1 = new B(17.3f);
		
	}
}