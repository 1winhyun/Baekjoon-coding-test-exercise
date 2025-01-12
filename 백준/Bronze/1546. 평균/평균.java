import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double[] score =new double[N];
        double[] scoreForMax =new double[N];

        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            score[i]=num;
            scoreForMax[i]=score[i];
        }

        double max=0;
        if(N==1){
            max=scoreForMax[0];
        }else{
            for(int j=0;j<N-1;j++){
                if(scoreForMax[j]>scoreForMax[j+1]){
                    scoreForMax[j+1]=scoreForMax[j];
                }
            }
            max=scoreForMax[N-1];
        }

        double sum=0;
        for(int k=0;k<N;k++){
            score[k]=(score[k]/max)*100;
            sum+=score[k];
        }

        double avg=sum/N;
        System.out.println(avg);
    }
}