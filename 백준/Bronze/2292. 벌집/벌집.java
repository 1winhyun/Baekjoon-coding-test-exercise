import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int i = 2;
        int firstNumber = 2;

        while(i>=2){
            if (N == 1) {
                i = 1;
                break;
            }
            for(int j=firstNumber;j<firstNumber+6*(i-1);j++){
                if(N==j){
                    firstNumber = N;
                    break;
                }
            }
            if(firstNumber==N){
                break;
            }
            firstNumber = firstNumber+6*(i-1);
            i++;
        }
        System.out.println(i);
    }
}