import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        List<Integer>result=new ArrayList<>();
        result.add(A+B);
        while(sc.hasNextInt()){
            A=sc.nextInt();
            B=sc.nextInt();
            result.add(A+B);
        }
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}