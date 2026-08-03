import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// 제한 시간 1초, 1<=N<=10^2 1<= M <=10^5
// 완탐하면 시간초과
// dp?

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) coins[i] = Integer.parseInt(st.nextToken());

        final int INF = M + 1;          // 오버플로 걱정 없는 '불가능' 값
        int[] dp = new int[M + 1];
        java.util.Arrays.fill(dp, INF);
        dp[0] = 0;                       // 0원은 동전 0개

        for (int i = 1; i <= M; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] + 1 < dp[i]) {
                    dp[i] = dp[i - coin] + 1;
                }
            }
        }

        bw.write(String.valueOf(dp[M] >= INF ? -1: dp[M]));
        bw.flush();
        bw.close();
   }
}