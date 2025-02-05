import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] split = new char[5][];
        for(int i=0;i<5;i++){
            split[i] = sc.nextLine().toCharArray();
        }


        int length=0;
        for(int i=0;i<5;i++){
            if(length<split[i].length){
                length = split[i].length;
            }
        }

        String[][] word = new String[length][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<split[i].length;j++){
                word[j][i] = String.valueOf(split[i][j]);
            }
        }

        for(int i=0;i<length;i++){
            for(int j=0;j<5;j++){
                if(word[i][j]!=null){
                    System.out.print(word[i][j]);
                }
            }
        }
    }
}
