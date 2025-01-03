import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int[] student=new int[28];

        int[] all=new int[30];
        for(int number=1;number<=30;number++){
            all[number-1]=number;
        }

        for(int i=0;i<28;i++){
            n=sc.nextInt();
            student[i]=n;
        }

        for(int j=0;j<30;j++){
            for(int k=0;k<28;k++){
                if(all[j]==student[k]){
                    all[j]=0;
                    break;
                }
            }
        }

        List<Integer>results=new ArrayList<>();
        for(int l=0;l<30;l++){
            if(all[l]!=0){
                results.add(all[l]);
            }
        }
        if(results.get(0)>results.get(1)){
            System.out.println(results.get(1));
            System.out.println(results.get(0));
        }else{

            System.out.println(results.get(0));
            System.out.println(results.get(1));
        }
    }
}
