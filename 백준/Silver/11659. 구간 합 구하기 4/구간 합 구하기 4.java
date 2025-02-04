import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[]num=new int[N+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            num[i]=num[i-1]+Integer.parseInt(st.nextToken());
        }

        int[] sum=new int[M];
        for(int a=0;a<M;a++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            sum[a]=num[j]-num[i-1];
        }
        for(int b=0;b<M;b++){
            System.out.println(sum[b]);
        }
    }
}