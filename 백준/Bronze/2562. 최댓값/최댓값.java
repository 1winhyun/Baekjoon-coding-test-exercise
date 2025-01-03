import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A =new int[9];
        int[] B =new int[9];

        int max;

        for(int i=0;i<9;i++){
            A[i]=sc.nextInt();
            B[i]=A[i];
        }

        max=max(B);
        System.out.println(max);

        int count;
        for(int i=0;i<9;i++){
            if(A[i]==max){
                count=i;
                System.out.println(count+1);
            }
        }

    }
    private static int max(int[] B){
        for(int i=0;i<8;i++){
            if(B[i]>B[i+1]){
                B[i+1]=B[i];
            }
        }
        return B[8];
    }
}