import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int[][] matrix = new int[N][N];
        int[][] dp = new int[N][N];

        for (int y = 0; y < N; y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int x = 0; x < N; x++) {
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = matrix[0][0];
        for (int y = 1; y < N; y++) dp[y][0] = dp[y-1][0] + matrix[y][0]; // 첫 열
        for (int x = 1; x < N; x++) dp[0][x] = dp[0][x-1] + matrix[0][x]; // 첫 행

        for (int y = 1; y < N; y++) {
            for (int x = 1; x < N; x++) {
                dp[y][x] = Math.max(dp[y-1][x], dp[y][x-1]) + matrix[y][x];
            }
        }

        System.out.println(dp[N-1][N-1]);
    }
}