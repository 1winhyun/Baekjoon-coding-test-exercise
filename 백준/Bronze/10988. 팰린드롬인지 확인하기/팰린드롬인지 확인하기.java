import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken();

        char[] wordSplit = word.toCharArray();

        char[] copyWord = new char[wordSplit.length];

        for(int i=0;i<wordSplit.length;i++){
            copyWord[i] = wordSplit[wordSplit.length-i-1];
        }

        if(Arrays.equals(wordSplit, copyWord)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}