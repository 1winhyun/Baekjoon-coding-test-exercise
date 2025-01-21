import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        String num=sc.next();
        int sum=0;
        char[] string=num.toCharArray();
        for(int i=0;i<N;i++){
            sum+=Integer.parseInt(String.valueOf(string[i]));
        }
        System.out.println(sum);
    }
}