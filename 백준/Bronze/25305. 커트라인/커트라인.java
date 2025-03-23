import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int k = sc.nextInt();

		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);

		int[] reverse = new int[N];
		for(int i=0;i<N;i++){
			reverse[i] = num[N-i-1];
		}

		System.out.println(reverse[k-1]);
	}
}
