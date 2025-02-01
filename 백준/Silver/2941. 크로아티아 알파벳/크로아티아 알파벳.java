import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String string = st.nextToken();

        char[] word = string.toCharArray();
        ArrayList<String> result = new ArrayList<>();
        int i;
        for(i=0; i<word.length;){
            if(word[i]=='c' && i+1<word.length && (word[i+1]=='=' || word[i+1]=='-')){
                result.add(String.valueOf(word[i]+word[i+1]));
                i+=2;
            }
            else if(word[i]=='d'&& i+1<word.length && i+2<word.length && word[i+1]=='z' && word[i+2]=='='){
                result.add(String.valueOf(word[i]+word[i+1]+word[i+2]));
                i+=3;
            }
            else if(word[i]=='d' && i+1<word.length && word[i+1]=='-'){
                result.add(String.valueOf(word[i]+word[i+1]));
                i+=2;
            }
            else if( i+1<word.length && word[i+1]=='j' && (word[i]=='l' || word[i]=='n')){
                result.add(String.valueOf(word[i]+word[i+1]));
                i+=2;
            }
            else if(i+1<word.length && word[i+1]=='=' && (word[i]=='s' || word[i]=='z')){
                result.add(String.valueOf(word[i]+word[i+1]));
                i+=2;
            }
            else{
                result.add(String.valueOf(word[i]));
                i+=1;
            }
        }
        System.out.println(result.size());
    }
}