import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t=0;t<T;t++){
            int K = Integer.parseInt(br.readLine());
            TreeSet<Integer> treeSet = new TreeSet<>();
            for(int k=0;k<K;k++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                String command = st.nextToken();
                int n = Integer.parseInt(st.nextToken());

                if (command.equals("I")) treeSet.add(n); // 정수 n을 큐에 삽입
                else if (command.equals("D") && n == 1 && !treeSet.isEmpty()) treeSet.remove(treeSet.last()); // 큐에서 최댓값 삭제
                else if (command.equals("D") && n == -1 && !treeSet.isEmpty()) treeSet.remove(treeSet.first()); // 큐에서 최솟값 삭제
            }

            if (treeSet.isEmpty()) sb.append("EMPTY").append("\n");
            else sb.append(treeSet.last()).append(" ").append(treeSet.first()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}