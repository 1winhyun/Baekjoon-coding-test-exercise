import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        int Dot = 2;
        for (int i = 0; i < count; i++) {
            Dot = 2 * Dot - 1;
        }

        System.out.println(Dot*Dot);
    }
}
