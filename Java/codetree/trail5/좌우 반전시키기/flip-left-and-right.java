import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int count = 0;
        // i번 칸이 0이면 (i+1)번 칸을 누르는 수밖에 없다
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] == 0) {
                count++;
                arr[i]     ^= 1;
                arr[i + 1] ^= 1;
                if (i + 2 < N) arr[i + 2] ^= 1;   // 마지막 칸 누를 땐 오른쪽 없음
            }
        }
        System.out.println(arr[N - 1] == 1 ? count : -1);
    }
}