import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int price;
        if(A==B && B==C){
            price=10000+(A*1000);
            System.out.println(price);
        }
        else if(A==B && B!=C){
            price=1000+(A*100);
            System.out.println(price);
        }
        else if(A!=B && B==C){
            price=1000+(B*100);
            System.out.println(price);
        }
        else if(A==C && A!=B){
            price=1000+(A*100);
            System.out.println(price);
        }
        else {
            if(A>B && A>C){
                price=100*A;
                System.out.println(price);
            }
            else if(B>A && B>C){
                price=100*B;
                System.out.println(price);
            }
            else {
                price=100*C;
                System.out.println(price);
            }
        }
    }
}