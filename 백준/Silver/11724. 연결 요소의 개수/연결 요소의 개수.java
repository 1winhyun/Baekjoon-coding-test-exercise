import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer>[] A;
	public static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int M = sc.nextInt();
		A = new ArrayList[n+1];
		visited = new boolean[n+1];
		for(int i=1;i<n+1;i++){
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<M;i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			A[u].add(v);
			A[v].add(u);
		}
		int count = 0;
		for(int i=1;i<n+1;i++){
			if(!visited[i]){
				count++;
				DFS(i);
			}
		}
		System.out.println(count);
	}

	public static void DFS(int v){
		if(visited[v]){
			return;
		}
		visited[v]=true;
		for (int i = 0; i < A[v].size(); i++) {
			int a = A[v].get(i);
			DFS(a);
		}
	}
}
