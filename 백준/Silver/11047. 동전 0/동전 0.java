import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		long K = Integer.parseInt(st.nextToken());

		int[] coin = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			coin[i] = Integer.parseInt(st.nextToken());
		}

		int coinCount;
		int totalCount = 0;
		long remainPrice = K;

		for (int i = coin.length - 1; i >= 0; i--) {
			if (remainPrice / coin[i] > 0) {
				coinCount = (int)(remainPrice / coin[i]);
				totalCount+=coinCount;
				remainPrice = remainPrice - (long)coinCount *coin[i];
			}
			if(remainPrice==0){
				System.out.println(totalCount);
				break;
			}
		}
	}
}
