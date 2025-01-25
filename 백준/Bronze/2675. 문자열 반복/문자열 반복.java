import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int T = Integer.parseInt(st.nextToken());
        String[] ss = new String[T];
        int[] rr = new int[T];
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            rr[i] = R;

            String s = st.nextToken();
            ss[i] = s;
        }
        char[] change = {};
        for(int i=0;i<T;i++){
            change = ss[i].toCharArray();
            for(int j=0;j<change.length;j++){
                for(int k=0;k<rr[i];k++){
                    System.out.print(change[j]);
                }
            }
            System.out.println(" ");
        }
    }
}