import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] sorted, A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        A = new int[N];
        sorted = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(A, 0, N - 1);
        for(int i=0;i<N;i++){
            System.out.println(A[i]);
        }
    }

    public static void merge_sort(int[] A, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            merge_sort(A, start, mid);
            merge_sort(A, mid + 1, end);
            merge(A, start, mid, end);
        }
    }

    public static void merge(int[] A, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = start;
        while (i <= mid && j <= end) {
            if (A[i] > A[j]) {
                sorted[k++] = A[j++];
            } else {
                sorted[k++] = A[i++];
            }
        }
        if (i > mid) {
            for (int l = j; l <= end; l++) {
                sorted[k++] = A[l];
            }
        } else {
            for (int l = i; l <= mid; l++) {
                sorted[k++] = A[l];
            }
        }
        for (int l = start; l <= end; l++) {
            A[l] = sorted[l];
        }
    }
}
