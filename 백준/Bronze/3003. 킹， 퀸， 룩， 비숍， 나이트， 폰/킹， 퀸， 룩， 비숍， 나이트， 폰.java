import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[6];
        for(int i=0;i<6;i++){
            number[i]=sc.nextInt();
        }

        int[] plus = new int[6];
        if(number[0]==1){
            plus[0]=0;
        }else{
            plus[0]=1-number[0];
        }

        if(number[1]==1){
            plus[1]=0;
        }else{
            plus[1]=1-number[1];
        }

        if(number[2]==2){
            plus[2]=0;
        }else{
            plus[2]=2-number[2];
        }

        if(number[3]==2){
            plus[3]=0;
        }else{
            plus[3]=2-number[3];
        }

        if(number[4]==2){
            plus[4]=0;
        }else{
            plus[4]=2-number[4];
        }

        if(number[5]==8){
            plus[5]=0;
        }else{
            plus[5]=8-number[5];
        }

        for(int i=0;i<6;i++){
            System.out.print(plus[i]+" ");
        }
    }
}