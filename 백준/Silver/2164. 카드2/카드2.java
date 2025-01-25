import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            q.add(i);
        }

        while(q.size()!=1){
            q.remove();
            int moveNum = q.remove();
            q.add(moveNum);
        }
        System.out.println(q.peek());
    }
}