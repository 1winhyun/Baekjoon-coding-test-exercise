import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();


        List<Integer>result=new ArrayList<>();
        while(A!=0 && B!=0){
            result.add(A+B);
            A=sc.nextInt();
            B=sc.nextInt();
        }
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}