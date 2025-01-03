import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A =new int[N];
        int[] B =new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            B[i]=A[i];
        }
        int max=max(A,N);
        int min=min(B,N);
        System.out.println(min+" "+max);

    }
    private static int max(int[] A, int N){
        for(int i=0;i<N-1;i++){
            if(A[i]>A[i+1]){
                A[i+1]=A[i];
            }
        }
        return A[N-1];
    }

    private static int min(int[] B, int N){
        for(int j=N-1;j>0;j--){
            if(B[j]<B[j-1]){
                B[j-1]=B[j];
            }
        }
        return B[0];
    }
}
