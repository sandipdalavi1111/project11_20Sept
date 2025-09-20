package inheritanceDemo;

public class D extends A{

	public void dmethod() {
		System.out.println("I am D class method");
	}
	public static void main(String[] args) {
		
		D obj3 = new D();
		obj3.amethod();
		obj3.dmethod();

	}

}
