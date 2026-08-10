import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

// 제한 시간 3초, 2<=N^5, K<=N 이므로 매번 완탐하면 시간초과
// 누적합 방식으로 캐싱
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        int arr [] = new int [N];

        // arr 초기화
        st = new StringTokenizer(br.readLine());
        for(int i=0;i <N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //preSum 초기화
        int preSum [] = new int[N]; //preSum[1]은 0부터 1까지의 합
        preSum[0] = arr[0];
        for(int i=1 ;i<N;i++){
            preSum[i] =  arr[i] + preSum[i-1];
        }

        // 연속하는 K개의 원소들의 합 중 가장 큰 값을 출력
        int maxValue = Integer.MIN_VALUE;
        for(int i=K;i<N;i++){
            maxValue= Math.max(maxValue,preSum[i]-preSum[i-K]);
        }

        bw.write(String.valueOf(maxValue));
        bw.flush();
        bw.close();
        br.close();
    }
}