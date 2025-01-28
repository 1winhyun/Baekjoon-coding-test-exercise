import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());


        int[] numbers = new int[n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<String> pom = new ArrayList<>();

        int[] saveNumbers = new int[n];
        Stack<Integer> stack = new Stack<>();
        int count=0;
        for(int i=1;i<=n;i++){
            stack.push(i);
            pom.add("+");
            for(int j=count;j<n;j++){
                if(!stack.empty()&&stack.peek()==numbers[j]){
                    stack.pop();
                    pom.add("-");
                    saveNumbers[j]=numbers[j];
                    count++;
                }else{
                    break;
                }
            }
        }
        if(!stack.empty()){
            for(int l=count;l<n;l++){
                saveNumbers[l]=stack.pop();
            }
        }
        if(Arrays.equals(numbers, saveNumbers)){
            for(int i=0;i<pom.size();i++){
                System.out.println(pom.get(i));
            }
        }
        else{
            System.out.println("NO");
        }
    }
}