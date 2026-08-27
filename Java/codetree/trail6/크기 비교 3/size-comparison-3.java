import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int [] indegree = new int [n+1];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++)
            graph.add(new ArrayList<>());

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            indegree[b] +=1;
        }

        for(int i=1;i<=n;i++){
            if(indegree[i] == 0) queue.add(i);
        }

        while(!queue.isEmpty()){
            int x = queue.poll();

            sb.append(x).append(" ");

            for (int y : graph.get(x)) {      // graph.get(x)
            if (--indegree[y] == 0) queue.add(y);
        }

        }

        System.out.print(sb);

    }
}