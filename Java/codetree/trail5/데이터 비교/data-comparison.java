import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        // arr1 초기화
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> hashSet1 = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            hashSet1.add(Integer.parseInt(st.nextToken()));
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(st.nextToken());
            sb.append(hashSet1.contains(n) ? 1 : 0).append(' ');
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}