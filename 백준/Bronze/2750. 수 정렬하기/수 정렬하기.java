import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[]num = new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            num[i]=Integer.parseInt(st.nextToken());
        }

        sort(num);
        for(int i=0;i<N;i++){
            System.out.println(num[i]);
        }
    }
}