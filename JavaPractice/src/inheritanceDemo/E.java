package inheritanceDemo;

public class E extends B,C,D{

	public void emethod() {
		System.out.println("I am E class method");
	}
	public static void main(String[] args) {
		
		E obj4 = new E();
		obj4.bmethod();
		obj4.emethod();
	}

}
