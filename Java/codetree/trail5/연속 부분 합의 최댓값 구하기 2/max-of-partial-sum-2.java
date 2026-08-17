import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


// 제한 시간 3초, 1<=N<=10^5
// 그리디 방식으로 순회하면서 진행하면 O(N)방식으로 통과 가능
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int maxValue = Integer.MIN_VALUE;

        // 초기화
        int N = Integer.parseInt(br.readLine());
        int arr [ ] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 합을 누적하면서 값이 음수가 나오면 바로 새롭게 누적 시작
        // 순회
        int preSum =-1;
        for(int i=0;i<N;i++){
            preSum += arr[i];
            maxValue = Math.max(maxValue,preSum);

            if(preSum < 0) preSum =0;
        }

        bw.write(String.valueOf(maxValue));
        bw.flush();
        bw.close();
        br.close();

    }
}