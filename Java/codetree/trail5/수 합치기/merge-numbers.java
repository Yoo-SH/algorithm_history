import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();   // 최소 힙
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }

        long result = 0;                                     // int 아님!
        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll();                 // 항상 최솟값 2개
            result += sum;
            pq.add(sum);                                     // 다시 제자리에 삽입
        }

        System.out.println(result);
    }
}