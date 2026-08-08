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

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        // 우선순위큐 초기화
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            pq.add(-Integer.parseInt(st.nextToken()));
        }

        for(int i=0;i<M;i++){
            pq.add(pq.poll()+1);
        }

        bw.write(String.valueOf(-pq.poll()));
        bw.flush();
        bw.close();
        br.close();


    }
}