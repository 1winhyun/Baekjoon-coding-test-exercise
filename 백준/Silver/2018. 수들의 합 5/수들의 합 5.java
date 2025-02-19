import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 1;
        int sum = 1;
        int start_index=1;
        int end_index=1;

        while(end_index!=N){
            if(sum<N){
                end_index++;
                sum+=end_index;
            }
            else if(sum>N){
                sum-=start_index;
                start_index++;
            }
            if(sum==N){
                count++;
                end_index++;
                sum+=end_index;
            }
        }
        System.out.println(count);
    }
}