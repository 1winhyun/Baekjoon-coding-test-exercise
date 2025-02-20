import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> results = new ArrayList<>();

		int first;
		int second;

		first = Integer.parseInt(st.nextToken());
		second = Integer.parseInt(st.nextToken());
		if (first < second && second % first == 0) {
			results.add("factor");
		} else if (first > second && first % second == 0) {
			results.add("multiple");
		} else {
			results.add("neither");
		}
		while (!(first == 0 && second == 0)) {
			st = new StringTokenizer(br.readLine());
			first = Integer.parseInt(st.nextToken());
			second = Integer.parseInt(st.nextToken());
			if (first < second && second % first == 0) {
				results.add("factor");
			} else if (first > second && first % second == 0) {
				results.add("multiple");
			} else {
				results.add("neither");
			}
		}
		for(int i=0;i<results.size()-1;i++){
			System.out.println(results.get(i));
		}
	}
}
