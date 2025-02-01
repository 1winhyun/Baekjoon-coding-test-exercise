import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        char[] num = N.toCharArray();
        int[] number = new int[num.length];
        int[] number2 = new int[num.length];
        for(int i=0;i<num.length;i++){
            number[i] = Integer.parseInt(String.valueOf(num[i]));
            number2[i] = Integer.parseInt(String.valueOf(num[i]));
        }

        for(int i=0;i<number.length-1;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]<number2[j]){
                    number[i]=number2[j];
                    number[j]=number2[i];
                    number2[i]=number[i];
                    number2[j]=number[j];
                }
            }
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
}