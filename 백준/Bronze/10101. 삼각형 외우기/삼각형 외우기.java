import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] x = new int[3];

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
		}

		int sum = x[0] + x[1] + x[2];
		if (x[0] == x[1] && x[1] == x[2] && x[0] == 60) {
			System.out.println("Equilateral");
		} else if (sum == 180 && ((x[0] == x[1] && x[1] != x[2]) || (x[0] != x[1] && x[1] == x[2]) || (x[0] == x[2]
			&& x[1] != x[2]))) {
			System.out.println("Isosceles");
		} else if (sum == 180 && x[0] != x[1]) {
			System.out.println("Scalene");
		} else if (sum != 180) {
			System.out.println("Error");
		}
	}
}
