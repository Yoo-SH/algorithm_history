
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int maxSum = INT_MIN;

        // n은 1부터 10000까지의 제한 조건
        for(int n=X;n<Y+1;n++){
            int num = n;
            int sum =0;
            while(num>0){
                sum += num % 10;
                num /= 10;
            }

            maxSum = Math.max(maxSum,sum);
        }

        bw.write(String.valueOf(maxSum));
        bw.flush();
        bw.close();
    }
}