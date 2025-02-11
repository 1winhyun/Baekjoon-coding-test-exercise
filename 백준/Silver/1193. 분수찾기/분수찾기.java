import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());

        int count = 0;
        int ja = 1;
        int mo = 1;
        int numberCount = 1;
        int n = 1;

        while (count >= 0) {
            if (X == count + 1) {
                System.out.println(ja + "/" + mo);
                break;
            }
            if (numberCount == n && n % 2 == 0) {
                count++;
                numberCount = 1;
                n++;
                ja = n;
                mo = 1;
            } else if (numberCount == n && n % 2 != 0) {
                count++;
                numberCount = 1;
                n++;
                ja = 1;
                mo = n;
            } else if (numberCount != n && n % 2 == 0) {
                count++;
                numberCount++;
                ja++;
                mo--;
            } else if (numberCount != n && n % 2 != 0) {
                count++;
                numberCount++;
                ja--;
                mo++;
            }
        }
    }
}
