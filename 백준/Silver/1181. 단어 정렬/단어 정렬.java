import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());

		ArrayList<String> arr = new ArrayList<>();
		for(int i=0;i<N;i++){
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(!arr.contains(s)){
				arr.add(s);
			}
		}
		Collections.sort(arr);

		String[] ss = new String[arr.size()];

		for(int i=0;i<arr.size();i++){
			ss[i]=arr.get(i);
		}

		Arrays.sort(ss,(e1,e2)->{
			return e1.length()-e2.length();
		});


		for(int i=0;i<ss.length;i++){
			System.out.println(ss[i]);
		}
	}
}
