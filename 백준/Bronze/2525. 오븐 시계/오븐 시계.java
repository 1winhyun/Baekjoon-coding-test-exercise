import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();

        int CH=C/60;
        int CM=C%60;

        if(A+CH>23){
            int H=A+CH-24;
            if(B+CM>=60){
                H=H+1;
                int M=B+CM-60;
                System.out.print(H+" ");
                System.out.print(M);
            }
            else if(B+CM<60){
                int M=B+CM;
                System.out.print(H+" ");
                System.out.print(M);
            }
        }
        else if(A+CH<=23){
            int H=A+CH;
            if(B+CM>=60){
                if(H==23){
                    H=0;
                    int M=B+CM-60;
                    System.out.print(H+" ");
                    System.out.print(M);
                }
                else{
                    H=H+1;
                    int M=B+CM-60;
                    System.out.print(H+" ");
                    System.out.print(M);
                }
            }
            else if(B+CM<60){
                int M=B+CM;
                System.out.print(H+" ");
                System.out.print(M);
            }
        }
    }
}