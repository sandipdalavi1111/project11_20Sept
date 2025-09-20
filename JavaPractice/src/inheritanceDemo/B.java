package inheritanceDemo;

public class B extends A{

	public void bmethod() {
		System.out.println("I am B class method");
	}
	public static void main(String[] args) {
		
		B obj1 = new B();
		obj1.amethod();
		obj1.bmethod();
		
	}

}
