import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> nums = new ArrayList<>();

		int number = sc.nextInt();
		nums.add(number);
		while (number != -1) {
			number = sc.nextInt();
			if (number == -1) {
				break;
			}
			nums.add(number);
		}

		for (int i = 0; i < nums.size(); i++) {
			ArrayList<Integer> yak = new ArrayList<>();
			int test = nums.get(i);
			int sum = 0;
			for (int j = 1; j < test; j++) {
				if (test % j == 0) {
					yak.add(j);
					sum += j;
				}
			}
			if (sum == test) {
				System.out.print(test + " = "+ yak.get(0));
				for (int k = 1; k < yak.size(); k++) {
					System.out.print(" + "+yak.get(k));

				}
				System.out.print("\n");
			} else {
				System.out.println(test + " is NOT perfect.");
			}
		}
	}
}
