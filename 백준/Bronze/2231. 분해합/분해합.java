import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		ArrayList<Integer> results = new ArrayList<>();
		for(int i=0;i<1000000;i++){
			int result =i;
			String s = String.valueOf(i);
			String[] strings = new String[s.length()];

			for(int j=0;j<s.length();j++){
				strings[j]=String.valueOf(s.charAt(j));
			}

			for(int k=0;k<strings.length;k++){
				result+=Integer.parseInt(strings[k]);
			}

			if(result==N){
				results.add(i);
			}
		}
		if(results.isEmpty()){
			System.out.println(0);
		}else{
			System.out.println(results.get(0));
		}
	}
}
