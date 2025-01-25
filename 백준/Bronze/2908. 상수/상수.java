import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        char[] aa;
        char[] bb;

        aa = A.toCharArray();
        bb = B.toCharArray();

        char[] reverseA = new char[3];
        char[] reverseB = new char[3];

        for(int i=2;i>=0;i--){
            reverseA[i] = aa[2-i];
            reverseB[i] = bb[2-i];
        }

        int resultA = Integer.parseInt(String.valueOf(reverseA[0])+ reverseA[1] + reverseA[2]);
        int resultB = Integer.parseInt(reverseB[0] +String.valueOf(reverseB[1])+ reverseB[2]);

        if(resultA>resultB){
            System.out.println(resultA);
        }else{
            System.out.println(resultB);
        }
    }
}