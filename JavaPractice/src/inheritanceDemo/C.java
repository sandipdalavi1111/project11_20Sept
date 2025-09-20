package inheritanceDemo;

public class C extends A{

	public void cmethod() {
		System.out.println("I am C class method");
	}
	public static void main(String[] args) {
		
		C obj2 = new C();
		obj2.amethod();
		
		obj2.cmethod();

	}

}
