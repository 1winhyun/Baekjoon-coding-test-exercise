import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                array[i][j] = sc.nextInt();
            }
        }

        int[][] array2 = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                array2[i][j] = array[i][j];
            }
        }


        int[] max = new int[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
                if(array2[i][j]>array2[i][j+1]){
                    array2[i][j+1] = array2[i][j];
                    max[i] = array2[i][j+1];
                }
                max[i] = array2[i][j+1];
            }
        }
        int result = 0;
        for(int i=0;i<8;i++){
            if(max[i]>max[i+1]){
                max[i+1]=max[i];
            }
            result = max[i+1];
        }

        int resultI=0;
        int resultJ=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(array[i][j]==result){
                    resultI = i+1;
                    resultJ = j+1;
                }
            }
        }
        System.out.println(result);
        System.out.println(resultI+" "+resultJ);
    }
}