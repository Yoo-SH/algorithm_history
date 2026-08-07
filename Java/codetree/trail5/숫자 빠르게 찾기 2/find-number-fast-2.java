import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        // treeSet 초기화
        st = new StringTokenizer(br.readLine());
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<N;i++){
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0;i<M;i++){
            int m = Integer.parseInt(br.readLine());
            sb.append(treeSet.ceiling(m) == null ? "-1" :treeSet.ceiling(m)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}