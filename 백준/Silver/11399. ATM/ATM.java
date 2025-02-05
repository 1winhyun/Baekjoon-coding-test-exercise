import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] p = new int[N];
        for(int i=0;i<N;i++){
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);

        int onePersonSum = 0;
        int allPersonSum = 0;
        for(int i=0;i<N;i++){
            onePersonSum+=p[i];
            allPersonSum+=onePersonSum;
        }
        System.out.println(allPersonSum);
    }
}
