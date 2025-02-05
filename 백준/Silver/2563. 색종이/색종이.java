import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[111][111];
        for(int i=0;i<111;i++){
            for(int j=0;j<111;j++){
                paper[i][j] = 0;
            }
        }

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int left = sc.nextInt();
            int low = sc.nextInt();
            for(int a=left+1;a<=left+10;a++){
                for(int b=low+1;b<=low+10;b++){
                    paper[a][b]++;
                }
            }
        }
        int count = 0;
        for(int i=0;i<=100;i++){
            for(int j=0;j<=100;j++){
                if(paper[i][j]!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
