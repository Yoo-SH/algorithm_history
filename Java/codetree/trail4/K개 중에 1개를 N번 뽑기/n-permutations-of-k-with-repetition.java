import java.io.*;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int K, N;
    static int[] arr;

    public static void backtracking(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]);
                if (i < N - 1) sb.append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= K; i++) {
            arr[depth] = i;
            backtracking(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];

        backtracking(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}