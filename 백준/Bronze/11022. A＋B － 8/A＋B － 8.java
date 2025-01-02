import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(bf.readLine());
        int[] result=new int[T];
        int[] aa=new int[T];
        int[] bb=new int[T];
        for(int i=0;i<T;i++){
            String N=bf.readLine();
            StringTokenizer st=new StringTokenizer(N);
            int a=Integer.parseInt(st.nextToken());
            aa[i]=a;
            int b=Integer.parseInt(st.nextToken());
            bb[i]=b;
            result[i]=a+b;
        }
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<T;i++){
            bw.write("Case #"+(i+1)+": "+aa[i]+" + "+bb[i]+" = "+result[i]+"\n");
        }
        bw.flush();
        bw.close();

    }
}