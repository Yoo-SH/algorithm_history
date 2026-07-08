
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final int INT_MAX = Integer.MAX_VALUE;
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int arr [] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int minSum = INT_MAX;

        for(int i=0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 특정 수를 2배하고, 특정 수를 제거하는 경우 완전탐색
        for(int i=0;i<N;i++){ //i번쨰 수를 2배하고
            int arrCopy [] =  Arrays.copyOf(arr,arr.length);
            arrCopy[i] *=2;
            for(int j=0;j<N;j++){ //j번쨰 수를 제거하여 인접한 숫자간의 차의 합을 구함
                int sum =0;
                int prev = -1;

                for(int k=0;k<N;k++){
                    if(k==j) continue; //제거된 원소 패스
                    if(prev != -1){
                        sum += Math.abs(arrCopy[k]-arrCopy[prev]);
                    }
                    prev = k;
                }
                minSum = Math.min(minSum,sum);
            }

        }
        bw.write(String.valueOf(minSum));
        bw.flush();
        bw.close();

    }
}