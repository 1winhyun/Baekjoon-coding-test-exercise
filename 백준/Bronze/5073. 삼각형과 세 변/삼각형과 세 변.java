import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		while (a != 0 && b != 0 && c != 0) {
			int up = Math.max(a, b);
			int max = Math.max(up, c);

			if (max == a) {
				if (max >= b + c) {
					System.out.println("Invalid");
				} else if (a == b && b == c) {
					System.out.println("Equilateral");
				} else if (a == b || a == c || b == c) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			} else if (max == b) {
				if (max >= a + c) {
					System.out.println("Invalid");
				} else if (a == c || b == c) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			} else {
				if (max >= a + b) {
					System.out.println("Invalid");
				} else if (a == b) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			}

			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
	}
}
