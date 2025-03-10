import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int[] numbers = new int[N - M + 1];
		for (int i = 0; i < N - M + 1; i++) {
			numbers[i] = M + i;
		}

		ArrayList<Integer> sosu = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = 2; j < numbers[i]; j++) {
				if (numbers[i] % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				sosu.add(numbers[i]);
				if(sosu.contains(1)){
					sosu.remove(0);
				}
			}
		}

		int result = 0;
		if(sosu.isEmpty()){
			System.out.println(-1);
		}
		else{
			int[] numberArray = new int[sosu.size()];
			for (int i = 0; i < sosu.size(); i++) {
				numberArray[i] = sosu.get(i);
				result += numberArray[i];
			}
			Arrays.sort(numberArray);
			System.out.println(result);
			System.out.println(numberArray[0]);
		}
	}
}
