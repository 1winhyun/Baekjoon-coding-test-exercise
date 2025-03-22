import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a1 = sc.nextInt();
		long a2 = sc.nextInt();
		long c = sc.nextInt();
		long n0 = sc.nextInt();

		if (a1 * n0 + a2 <= c * n0 && a1 <= c) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
