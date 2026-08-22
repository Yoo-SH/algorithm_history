import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[][] graph = new int[n + 1][n + 1];
        boolean[] isVisited = new boolean[n + 1];
        int[] dist = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            if (graph[u][v] == 0 || graph[u][v] > w) graph[u][v] = w; // 단방향
        }

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        for (int i = 1; i <= n; i++) {
            int minIndex = -1;
            for (int j = 1; j <= n; j++) {
                if (isVisited[j]) continue;
                if (minIndex == -1 || dist[j] < dist[minIndex]) minIndex = j;
            }
            if (dist[minIndex] == Integer.MAX_VALUE) break; // 나머지는 도달 불가
            isVisited[minIndex] = true;

            for (int j = 1; j <= n; j++) {
                if (graph[minIndex][j] == 0) continue;
                dist[j] = Math.min(dist[j], dist[minIndex] + graph[minIndex][j]);
            }
        }

        for (int i = 2; i <= n; i++) {
            sb.append(dist[i] == Integer.MAX_VALUE ? -1 : dist[i]).append('\n');
        }
        System.out.print(sb);
    }
}