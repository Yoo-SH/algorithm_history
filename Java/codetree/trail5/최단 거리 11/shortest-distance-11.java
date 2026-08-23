import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            graph[x].add(new int[]{y, z});
            graph[y].add(new int[]{x, z});   // 양방향
        }

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        final int INF = Integer.MAX_VALUE;
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[B] = 0;                          // B에서 출발

        PriorityQueue<int[]> pq = new PriorityQueue<>((p, q) -> p[1] - q[1]);
        pq.add(new int[]{B, 0});
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            int node = c[0], d = c[1];
            if (d > dist[node]) continue;
            for (int[] e : graph[node]) {
                int next = e[0], cost = d + e[1];
                if (cost < dist[next]) {
                    dist[next] = cost;
                    pq.add(new int[]{next, cost});
                }
            }
        }

        for (int i = 1; i <= n; i++) graph[i].sort((p, q) -> p[0] - q[0]); // 번호 오름차순

        sb.append(dist[A]).append('\n');
        int cur = A;
        sb.append(cur);
        while (cur != B) {
            for (int[] e : graph[cur]) {      // 번호 작은 순으로 첫 매칭 채택
                if (dist[e[0]] != INF && dist[e[0]] + e[1] == dist[cur]) {
                    cur = e[0];
                    sb.append(' ').append(cur);
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}