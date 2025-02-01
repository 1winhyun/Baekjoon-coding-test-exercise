import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int groupWordCount = N;

        String[] words = new String[N];
        for(int a=0;a<N;a++){
            words[a] = sc.next();
            char[] wordSplit = words[a].toCharArray();

            boolean groupWords = true;
            for(int i=0;i<wordSplit.length;i++){
                for(int j=i;j<wordSplit.length;j++){
                    if (j+1<wordSplit.length
                            && j+2<wordSplit.length
                            && wordSplit[i] == wordSplit[j+2]
                            && wordSplit[i] != wordSplit[j+1]) {
                        groupWords = false;
                        break;
                    }
                }
            }
            if(!groupWords){
                groupWordCount=groupWordCount-1;
            }
        }
        System.out.println(groupWordCount);
    }
}
