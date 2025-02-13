import java.io.*;
import java.util.*;

public class Main {
    public static int[] n = {};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());

        n = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            n[i] = Integer.parseInt(st.nextToken());
        }

        radix_sort(n);

        for (int i = 0; i < N; i++) {
            bw.write(n[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static void radix_sort(int[] n) {
        int jari = 1;
        int count = 0;
        int[] output = new int[n.length];
        while (count != 5) {
            int[] bucket = new int[10];
            for (int i = 0; i < n.length; i++) {
                bucket[(n[i] / jari) % 10]++;
            }
            for (int i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            for(int i=n.length-1;i>=0;i--){
                output[bucket[(n[i]/jari)%10]-1]=n[i];
                bucket[(n[i]/jari)%10]--;
            }
            for(int i=0;i<n.length;i++){
                n[i]=output[i];
            }
            count++;
            jari *= 10;
        }
    }
}
