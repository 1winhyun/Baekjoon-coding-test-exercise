import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		int yMin = Math.min(y,Math.abs(h-y));
		int xMin = Math.min(x,Math.abs(w-x));

		System.out.println(Math.min(xMin,yMin));
	}
}
