import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H= sc.nextInt();
        int M= sc.nextInt();

        if(H>=1&&(M>=45&&M<=59)){
            System.out.print(H+" ");
            System.out.print(M-45);
        }
        else if(H>=1&&(M<=44&&M>=0)){
            System.out.print(H-1+" ");
            System.out.print(M+60-45);
        }
        else if(H==0&&(M>=45&&M<=59)){
            System.out.print(H+" ");
            System.out.print(M-45);
        }
        else if(H==0&&(M<=44&&M>=0)){
            System.out.print(23+" ");
            System.out.print(M+60-45);
        }
    }
}