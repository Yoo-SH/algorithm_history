import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        //그래프 초기화
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new int[]{v, w});
            graph[v].add(new int[]{u, w});
        }
        
        // A,B초기화
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());


        int dist [] = new int[n+1];
        int[] prev = new int[n + 1];         //  경로 추적용

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[A] = 0;

        PriorityQueue<int []>  pq = new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int[]{A,0});

        while(!pq.isEmpty()){
            int [] cur = pq.poll();
            int node = cur[0];
            int d = cur[1];

            if(d > dist[node]) continue;
            for(int [] e : graph[node]){
                int next = e[0], cost = d + e[1];
                
                if(cost < dist[next]){
                    dist[next] = cost;
                    prev[next] = node;       // next는 node를 거쳐서 왔다
                    pq.add(new int[]{next, cost});
                }
            }
        }

        sb.append(dist[B]).append('\n');   


        List<Integer> path = new ArrayList<>();
        for (int v = B; v != A; v = prev[v]) path.add(v);
        path.add(A);
        Collections.reverse(path);

        for (int v : path) sb.append(v).append(' ');
        System.out.println(sb.toString().trim());
    }
}