import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());

        int[]num = new int[x];
        for(int i=0;i<x;i++){
            st = new StringTokenizer(br.readLine());
            num[i]=Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first==second){
                return o1 - o2;
            }
            else{
                return first - second;
            }
        });
        for(int i=0;i<x;i++){
            if(num[i]!=0){
                priorityQueue.add(num[i]);
            }
            else if(num[i]==0 && priorityQueue.isEmpty()){
                System.out.println(0);
            }
            else if(num[i]==0 && !priorityQueue.isEmpty()){
                System.out.println(priorityQueue.poll());
            }
        }
    }
}