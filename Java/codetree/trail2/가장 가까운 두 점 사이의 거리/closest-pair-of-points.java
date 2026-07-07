
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final int  INT_MIN = Integer.MIN_VALUE;
    static final int  INT_MAX = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] points = new int[N][2]; // [x좌표, y좌표]
        int minDist = INT_MAX;

        // 포인터 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i][0] = x;
            points[i][1] = y;
        }

        //두 포인터간 거리의 제곱값 완전 탐색
        for (int a = 0; a < N; a++) {
            for (int b = 0; b < N; b++) {
                if (a != b) {
                    int aX = points[a][0];
                    int aY = points[a][1];
                    int bX = points[b][0];
                    int bY = points[b][1];

                    //포인터간 계산 거리
                    int dist = (int) (Math.pow((bY - aY), 2) + Math.pow((bX - aX), 2));
                    minDist = Math.min(minDist, dist);
                }
            }
        }

        bw.write(String.valueOf(minDist));
        bw.flush();
        bw.close();
    }
}