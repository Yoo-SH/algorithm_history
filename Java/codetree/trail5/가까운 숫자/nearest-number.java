import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;
import java.util.TreeSet;

// 제한 시간 3초
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);

        long ans = Long.MAX_VALUE;   // 아직 점이 하나뿐 → 쌍이 없음

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());

            if (!set.add(x)) {              // 이미 있던 좌표 → 거리 0
                ans = 0;
            } else {
                Integer lo = set.lower(x);  // x보다 작은 값 중 최대
                Integer hi = set.higher(x); // x보다 큰 값 중 최소
                if (lo != null) ans = Math.min(ans, (long) x - lo);
                if (hi != null) ans = Math.min(ans, (long) hi - x);
            }

            sb.append(ans).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}