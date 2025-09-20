package abstractionDemo;

public class Test3 extends Test2 {

	
	public void t2() {
		System.out.println("I am t2 method");
		
	}

	@Override
	public void t1() {
		System.out.println("I am t1 method");
		
	}

	@Override
	public void t11() {
		System.out.println("I am t11 method");
		
	}

	public static void main(String[] agrs) {
	
		Test3 t3 = new Test3();
		t3.t1();
		t3.t11();
		t3.t2();
		
		System.out.println(t3.pi);

	}

	

}
