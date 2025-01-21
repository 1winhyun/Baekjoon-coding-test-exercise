import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        String S = st.nextToken();
        char[] ss=S.toCharArray();

        String alphabet="abcdefghijklmnopqrstuvwxyz";
        char[] alp=alphabet.toCharArray();

        int[] result=new int[alp.length];
        for(int i=0;i<alp.length;i++){
            result[i]=-1;
        }

        for(int i=ss.length-1;i>=0;i--){
            for(int j=0;j<alp.length;j++){
                if(ss[i]==alp[j]){
                    result[j]=i;
                }
            }
        }

        for(int i=0;i<alp.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}