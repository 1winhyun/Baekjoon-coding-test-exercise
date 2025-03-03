import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		ArrayList<Integer> remains= new ArrayList<>();
		for(int i=0;i<10;i++){
			if(!remains.contains(array[i]%42)){
				remains.add(array[i]%42);
			}
		}
		System.out.println(remains.size());
	}
}
