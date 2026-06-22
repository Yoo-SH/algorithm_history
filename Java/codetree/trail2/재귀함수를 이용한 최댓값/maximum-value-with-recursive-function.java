import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    static int findMax(int[] arr, int idx) {
        // base case: 마지막 원소면 그 값이 곧 최댓값
        if (idx == arr.length - 1) return arr[idx];

        // 현재 원소 vs 나머지의 최댓값
        return Math.max(arr[idx], findMax(arr, idx + 1));
    }


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i= 0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(String.valueOf(findMax(arr, 0)));
        bw.close();
    }
}

