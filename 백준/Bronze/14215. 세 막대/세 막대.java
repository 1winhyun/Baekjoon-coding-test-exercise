import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int up = Math.max(a, b);
		int max = Math.max(up, c);

		int result;

		if (a + b <= c || b + c <= a || c + a <= b) {
			if (max == a) {
				result = (b + c) * 2 - 1;
			} else if (max == b) {
				result = (a + c) * 2 - 1;
			} else {
				result = (a + b) * 2 - 1;
			}
		} else {
			result = a + b + c;
		}
		System.out.println(result);
	}
}
