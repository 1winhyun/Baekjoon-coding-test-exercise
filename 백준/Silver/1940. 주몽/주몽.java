import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] nn=new int[N];

        for(int i=0;i<N;i++){
            nn[i]=sc.nextInt();
        }

        int count=0;

        int s;
        int e;
        for(s=0;s<=N-2;s++){
            for(e=s+1;e<=N-1;e++){
                if(nn[s]+nn[e]==M){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}