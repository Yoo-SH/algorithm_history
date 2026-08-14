import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 1<=N<=10^5, 1<=S<=10^9, 1<=원소값<=10^4
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int result = Integer.MAX_VALUE;

        // 초기화
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //투 포인터
        int r = 0;          // 루프 밖에서 선언
        long sumVal = 0;
        for (int l = 0; l < N; l++) {
            while (r < N && sumVal < S) sumVal += arr[r++];
            if (sumVal >= S) result = Math.min(result, r - l);
            sumVal -= arr[l];   // l을 한 칸 옮기며 빼줌
        }

        bw.write(result == Integer.MAX_VALUE ? "-1" : String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }
}