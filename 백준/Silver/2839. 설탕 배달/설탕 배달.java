import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int countFirst = 2000;
		int countNext = 2000;
		for (int a = 0; a <= 2000; a++) {
			for (int b = 0; b <= 1000; b++) {
				if (3 * a + 5 * b == N) {
					countNext = a + b;
				}
				if (countFirst > countNext) {
					countFirst = countNext;
				}
			}
		}
		if(countFirst==2000){
			System.out.println(-1);
		}else{
			System.out.println(countFirst);
		}
	}
}
