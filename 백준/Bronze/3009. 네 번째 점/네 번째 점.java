import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] xs = new int[3];
		int[] ys = new int[3];
		for (int i = 0; i < 3; i++) {
			xs[i] = sc.nextInt();
			ys[i] = sc.nextInt();
		}

		int x;
		int y;

		if (xs[0] == xs[1]) {
			x = xs[2];
		} else if (xs[1] == xs[2]) {
			x = xs[0];
		} else {
			x = xs[1];
		}

		if (ys[0] == ys[1]) {
			y = ys[2];
		} else if (ys[1] == ys[2]) {
			y = ys[0];
		} else {
			y = ys[1];
		}

		System.out.println(x + " " + y);
	}
}
