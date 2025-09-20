package polymorphism;

public class Test2 extends Test1{
	
	public void abc() {
		System.out.println("22");
	}

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		t2.abc();
		
		Test1 t1 = new Test1();
		t1.abc();
	}

}
