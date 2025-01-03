import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int M= sc.nextInt();

        int[] bucket=new int[N];

        for(int a=0;a<N;a++){
            bucket[a]=0;
        }


        for(int b=1;b<=M;b++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();

            for(int c=i;c<=j;c++){
                bucket[c-1]=k;
            }
        }

        for(int d=1;d<=N;d++){
            System.out.print(bucket[d-1]+" ");
        }
    }
}
