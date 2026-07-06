
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

    static final int  INT_MIN = Integer.MIN_VALUE;
    static final int  INT_MAX = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int maxSum = INT_MIN;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());;

        }


        // 연속하여 k개의 수를 골랐을 때 최대값. (투포인터)
        for(int i=0;i<N;i++){
            int sum =0;
            for(int j=i;j<i+K;j++){
                if(j < N) sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }

        bw.write(String.valueOf(maxSum));
        bw.flush();
        bw.close();


    }
}