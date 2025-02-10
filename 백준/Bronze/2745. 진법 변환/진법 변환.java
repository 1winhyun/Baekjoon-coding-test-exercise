import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int jin = sc.nextInt();

        char[] wordSplit = word.toCharArray();
        String[]words = new String[wordSplit.length];
        for(int i=0;i<words.length;i++){
            words[i] = String.valueOf(wordSplit[i]);
            for(int j=10;j<=35;j++)
                if(wordSplit[i]-55==j){
                    words[i] = String.valueOf(j);
                }
        }

        int[] number  = new int[words.length];
        for(int i=0;i<words.length;i++){
            number[i] = Integer.parseInt(words[i]);
        }

        int sum =0;
        int jinsu = 1;
        for(int i=0;i<number.length;i++){
            for(int j=0;j<=i;j++){
                if(j!=0){
                    jinsu = jinsu * jin;
                }
                if(j==0){
                    jinsu = 1;
                }
            }
            sum = sum + (jinsu * number[number.length-1-i]);
        }
        System.out.println(sum);
    }
}
