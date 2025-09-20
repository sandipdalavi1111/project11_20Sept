package Demo1;

public class Test10 {

	public static void main(String[] args) {
		System.out.println("Hello, Pune!");
		printStarPyramid(5);
	}

	public static void printStarPyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Print spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}