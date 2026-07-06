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
        int arr [ ] = new int[10001];

        //초기화
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int pos = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            int score = 0;
            if (c == 'G') score = 1;
            else if (c == 'H') score = 2;

            arr[pos] = score;
        }

        int maxSum = INT_MIN;
        for(int i=1;i<10001-K;i++){
            int sum =0;
            for(int j=i;j<=i+K;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }

        bw.write(String.valueOf(maxSum));
        bw.flush();
        bw.close();


    }
}