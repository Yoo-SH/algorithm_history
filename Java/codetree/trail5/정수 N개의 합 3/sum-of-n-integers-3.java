import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

// 누적합 방식으로 캐싱, 완탐도 될거같긴한데..
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        int matrix [][] = new int[N][N];

        // matrix 초기화
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }


        //누적합
        int[][] pre = new int[N + 1][N + 1];
        for (int y = 1; y <= N; y++)
            for (int x = 1; x <= N; x++)
                pre[y][x] = pre[y - 1][x] + pre[y][x - 1] - pre[y - 1][x - 1] + matrix[y - 1][x - 1];

        int maxValue = Integer.MIN_VALUE;
        for (int y = K; y <= N; y++)
            for (int x = K; x <= N; x++) {
                int sum = pre[y][x] - pre[y - K][x] - pre[y][x - K] + pre[y - K][x - K];
                maxValue = Math.max(maxValue, sum);
            }

        bw.write(String.valueOf(maxValue));
        bw.flush();
        bw.close();
        br.close();

    }
}