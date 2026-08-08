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
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push":{
                    int n = Integer.parseInt(st.nextToken());
                    pq.add(-n);
                    break;
                }
                case "pop":{
                    sb.append(-pq.poll()).append("\n");
                    break;
                }
                case "size":{
                    sb.append(pq.size()).append("\n");
                    break;
                }
                case "empty":{
                    sb.append(pq.isEmpty() ? "1" : "0").append("\n");
                    break;
                }
                case "top":{
                    sb.append(-pq.peek()).append("\n");
                    break;
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}