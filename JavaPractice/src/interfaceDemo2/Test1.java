package interfaceDemo2;

public class Test1 implements I1,I2{

	

	
	public void b1() {
		System.out.println("I am b1 method");
		
	}

	
	public void b2() {
		System.out.println("I am b2 method");
		
	}

	
	public void a1() {
		System.out.println("I am a1 method");
		
	}

	
	public void a2() {
		System.out.println("I am a2 method");
		
	}
	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.a1();
		t1.a2();
		t1.b1();
		t1.b2();
	}

}
