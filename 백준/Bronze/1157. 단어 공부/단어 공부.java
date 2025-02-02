import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toLowerCase();
        char[] wordSplit = word.toCharArray();

        int[] count = new int[26];
        for(int i=0;i<26;i++){
            count[i]=0;
        }

        for (char c : wordSplit) {
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }

        int max = count[0];
        for(int i=1;i<26;i++){
            max = Integer.max(max,count[i]);
        }

        int countResult = 0 ;
        char result = 0;
        for(int i = 0; i<26; i++){
            if(max==count[i]){
                countResult++;
                result = (char)(i+97);
            }
        }

        if(countResult==1){
            System.out.println(String.valueOf(result).toUpperCase());
        }else{
            System.out.println("?");
        }
    }
}