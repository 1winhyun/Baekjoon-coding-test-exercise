import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] cArray = new int[T];
        for (int i = 0; i < T; i++) {
            int C = sc.nextInt();
            cArray[i] = C;
        }

        int[] quarter = new int[T];
        int[] dime = new int[T];
        int[] nickel = new int[T];
        int[] penny = new int[T];

        for (int i = 0; i < T; i++) {
            quarter[i] = cArray[i] / 25;
            dime[i] = cArray[i] % 25 / 10;
            nickel[i] = cArray[i] % 25 % 10 / 5;
            penny[i] = cArray[i] % 25 % 10 % 5;
        }

        for (int i = 0; i < T; i++) {
            System.out.print(quarter[i] + " " + dime[i] + " " + nickel[i] + " " + penny[i]);
            System.out.print("\n");
        }
    }
}
