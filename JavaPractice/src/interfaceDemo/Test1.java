package interfaceDemo;

public class Test1 implements I1,I2 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.abc();
		t1.abcd();
		t1.pqr();
	}

	
	public void pqr() {
		System.out.println("I am pqr method");
		
	}

	
	public void abc() {
		System.out.println("I am abc method");
		
	}

	
	public void abcd() {
		System.out.println("I am abcd method");
		
	}

}
