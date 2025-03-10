import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> yak = new ArrayList<>();

		for(int i=1;i<=N;i++){
			if(N%i==0){
				yak.add(i);
			}
		}
		if(yak.size()<K){
			System.out.println(0);
		}else{
			System.out.println(yak.get(K-1));
		}
	}
}
