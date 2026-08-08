import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.PriorityQueue;

// 제한 시간 3초
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int n = Integer.parseInt(br.readLine().trim());
            if(n==0) sb.append(pq.isEmpty()? 0: pq.poll()).append("\n");
            else pq.add(n);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}