import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numbers = new int[N];

		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}


		int resultCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			int yakCount = 0;
			for(int j=1;j<=numbers[i];j++){
				if(numbers[i]%j==0){
					yakCount++;
				}
			}
			if(yakCount==2){
				resultCount++;
			}
		}
		System.out.println(resultCount);
	}
}
