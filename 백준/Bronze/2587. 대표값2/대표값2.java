import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += num[i];
		}
		System.out.println(sum/5);
		System.out.println(num[2]);
	}
}
