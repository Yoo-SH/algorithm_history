import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M  = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        // 배열 초기화
        st = new StringTokenizer(br.readLine().trim());
         for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(st.nextToken());
            hashMap.put(v, hashMap.getOrDefault(v, 0) + 1);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
           int target = Integer.parseInt(st.nextToken());
            bw.write(hashMap.getOrDefault(target, 0) + " ");
        }       
        bw.flush();
        bw.close();



    }
}