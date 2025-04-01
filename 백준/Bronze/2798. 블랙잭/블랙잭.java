import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		ArrayList<Integer> results = new ArrayList<>();
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					results.add(num[i] + num[j] + num[k]);
				}
			}
		}

		Collections.sort(results);
		Collections.reverse(results);
		for (int i = 0; i < results.size(); i++) {
			if (results.get(i) <= M) {
				System.out.println(results.get(i));
				break;
			}
		}
	}
}
