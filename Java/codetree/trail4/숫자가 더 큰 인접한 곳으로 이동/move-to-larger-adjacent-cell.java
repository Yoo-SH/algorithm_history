import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken()) - 1;
        int x = Integer.parseInt(st.nextToken()) - 1;

        int[][] a = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 상, 하, 좌, 우
        int[] dy = {-1, 1, 0, 0};
        int[] dx = {0, 0, -1, 1};

        StringBuilder sb = new StringBuilder();
        sb.append(a[y][x]);   // 시작 칸부터 출력

        while (true) {
            boolean moved = false;
            for (int d = 0; d < 4; d++) {
                int ny = y + dy[d], nx = x + dx[d];
                if (ny < 0 || ny >= N || nx < 0 || nx >= N) continue;
                if (a[ny][nx] > a[y][x]) {
                    y = ny;
                    x = nx;
                    sb.append(' ').append(a[y][x]);
                    moved = true;
                    break;  // 우선순위 높은 방향 하나만 선택
                }
            }
            if (!moved) break;
        }

        System.out.println(sb);
    }
}