import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        char[] first=new char[T];
        char[] end=new char[T];
        for(int i=0;i<T;i++){
            String s=sc.next();
            char[] ss= s.toCharArray();
            int length=ss.length;
            first[i]=ss[0];
            end[i]=ss[length-1];
        }
        for(int i=0;i<T;i++){
            System.out.print(first[i]);
            System.out.println(end[i]);
        }
    }
}