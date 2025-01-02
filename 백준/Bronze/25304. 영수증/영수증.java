import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();

        int[] pp=new int[N];
        int[] pn=new int[N];
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            pp[i]=a;
            int b=sc.nextInt();
            pn[i]=b;
        }
        int[] productPrice=new int[N];
        int totalPrice=0;
        for(int i=0;i<N;i++){
            productPrice[i]=pp[i]*pn[i];
            totalPrice=totalPrice+productPrice[i];
        }
        if(totalPrice==X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}