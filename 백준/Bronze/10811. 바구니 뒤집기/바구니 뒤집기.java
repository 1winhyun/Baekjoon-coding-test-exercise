import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();

        int[] bucket=new int[N];
        int[] bucket2=new int[N];
        int[] bucket3=new int[N];

        for(int a=0;a<N;a++){
            bucket[a]=a+1;
            bucket2[a]=bucket[a];
            bucket3[a]=bucket[a];
        }


        for(int b=0;b<M;b++){
            int i=sc.nextInt();
            int j=sc.nextInt();

            for(int c=i;c<=j;c++){
                int d=j-(c-i);
                bucket3[c-1]=bucket2[d-1];
            }
            for(int e=i;e<=j;e++){
                int f=j-(e-i);
                bucket2[e-1]=bucket[f-1];
            }
            for(int g=i;g<=j;g++){
                bucket[g-1]=bucket3[g-1];
            }
        }
        for(int h=0;h<N;h++){
            System.out.print(bucket3[h]+" ");
        }
    }
}