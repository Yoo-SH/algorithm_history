import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int dist [][] = new int[n+1][n+1];

        //최대값 설정
        for(int i=1;i<=n;i++){
            Arrays.fill(dist[i],1_000_000_000);
            dist[i][i] = 0;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            dist[u][v] = Math.min(dist[u][v], w);
        }


        //플로이드워셜
        for(int k=1; k<=n;k++){
            for(int i=1;i <=n;i++){
                for(int j=1;j<=n;j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for(int i=1;i <=n;i++){
                for(int j=1;j<=n;j++){
                    if (dist[i][j] == 1_000_000_000) sb.append(-1).append(" ");
                    else sb.append(dist[i][j]).append(" ");
                    
                }
                sb.append("\n");
            }

        System.out.println(sb.toString());
    }
}