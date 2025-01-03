import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int[] bucket=new int[N];
        int[] bucket2=new int[N];

        for(int a=1;a<=N;a++){
            bucket[a-1]=a;
            bucket2[a-1]=a;
        }


        for(int b=1;b<=M;b++){
            int i=sc.nextInt();
            int j=sc.nextInt();

            bucket[i-1]=bucket2[j-1];
            bucket[j-1]=bucket2[i-1];
            bucket2[i-1]=bucket[i-1];
            bucket2[j-1]=bucket[j-1];
        }

        for(int d=1;d<=N;d++){
            System.out.print(bucket[d-1]+" ");
        }
    }
}
