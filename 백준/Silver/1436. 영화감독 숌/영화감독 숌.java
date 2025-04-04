import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int count=1;
		long distinction = 666;

		while(count<=N){
			if(N==1){
				System.out.println(distinction);
				break;
			}
			distinction++;
			if(String.valueOf(distinction).contains("666")){
				count++;
			}

			if(count==N){
				System.out.println(distinction);
				break;
			}
		}
	}
}
