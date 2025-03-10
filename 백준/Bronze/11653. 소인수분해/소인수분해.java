import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());


		int N = Integer.parseInt(st.nextToken());

		ArrayList<Integer> sosu = new ArrayList<>();
		for (int i = 2; i <= N; i++) {
			if (N % i == 0) {
				sosu.add(i);
			}
		}

		int[] sosuArray = new int[sosu.size()];
		for (int i = 0; i < sosu.size(); i++) {
			sosuArray[i] = sosu.get(i);
		}

		int result = N;
		int i = 0;
		while (result != 1) {
			if (result == -1) {
				System.out.println();
				break;
			}
			if (result % sosuArray[i] == 0) {
				result = result / sosuArray[i];
				System.out.println(sosuArray[i]);
			} else {
				while(result%sosuArray[i]!=0){
					i = i + 1;
				}
				result = result / sosuArray[i];
				System.out.println(sosuArray[i]);
			}
		}
	}
}
