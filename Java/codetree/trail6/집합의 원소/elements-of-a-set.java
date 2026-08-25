import java.util.*;
import java.io.*;

public class Main {

    public static int[] uf;

    public static int find(int x) {
        if (uf[x] == x) return x;
        return uf[x] = find(uf[x]);
    }

    public static void union(int a, int b) {
        int c = find(a);
        int d = find(b);
        if (c == d) return;
        uf[d] = c;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        uf = new int[n + 1];
        for (int i = 1; i <= n; i++) uf[i] = i;   // 초기화

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int qType = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (qType == 0) {
                union(a, b);
            } else {
                sb.append(find(a) == find(b) ? 1 : 0).append('\n');
            }
        }

        System.out.print(sb);
    }
}