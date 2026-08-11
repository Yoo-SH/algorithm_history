import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());

        int[] pos = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pos[i] = Integer.parseInt(st.nextToken());
        }

        // 1) 정렬해서 각 점의 "순서"를 확정
        Arrays.sort(pos);

        // 2) 좌표값 -> 정렬된 인덱스 (좌표 범위가 크므로 배열 대신 해시맵)
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hashmap.put(pos[i], i);
        }

        // 3) 질의 처리: index(b) - index(a) + 1
        for (int q = 0; q < Q; q++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(hashmap.get(b) - hashmap.get(a) + 1).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}