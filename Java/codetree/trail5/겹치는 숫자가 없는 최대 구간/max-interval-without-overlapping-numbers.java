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
        int result = Integer.MIN_VALUE;

        // 초기화
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //투포인터
        int[] count = new int[100001];
        int r = 0;
        for (int l = 0; l < N; l++) {
            // arr[r]이 아직 윈도우에 없으면 확장
            while (r < N && count[arr[r]] == 0) {
                count[arr[r]]++;
                r++;
            }
            result = Math.max(result, r - l);
            count[arr[l]]--; // l 전진 전에 왼쪽 원소 제거
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();

    }
}