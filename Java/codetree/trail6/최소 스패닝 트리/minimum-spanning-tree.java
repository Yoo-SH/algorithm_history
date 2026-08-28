import java.util.*;
import java.io.*;

public class Main {

    static int [] parent;

    static int find(int x){
        if(parent[x] == x) return x;

        return parent[x] = find(parent[x]);
    }

    static boolean union(int a, int b){
        a = find(a);
        b = find(b);

        if(a == b) return false;

        parent[b] = a;
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        parent = new int[n+1];
        int[][] edges = new int[m][3];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            edges[i][0] = Integer.parseInt(st.nextToken());
            edges[i][1] = Integer.parseInt(st.nextToken());
            edges[i][2] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=n;i++){
            parent[i] = i;
        }

        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));  
        
        int answer =0;
        int count =0;

        for(int i=0;i<m;i++){

            if(!union(edges[i][0], edges[i][1])) continue;

            answer += edges[i][2];
            count++;

            if(count == m -1) break;
        }

        System.out.println(answer);
    }
}