
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
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int preferTemper [][] = new int[N][2];
        int maxTemper = INT_MIN;
        int minTemper = INT_MAX;
        int maxSum = INT_MIN;

        // 선호 온도 초기화
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine().trim());
            int TA = Integer.parseInt(st.nextToken());
            int TB = Integer.parseInt(st.nextToken());

            preferTemper[i][0] = TA;
            preferTemper[i][1] = TB;

            minTemper = Math.min(minTemper,TA);
            maxTemper = Math.max(maxTemper,TB);
        }

        // 온도를 완전 탐색
        for(int t=-1;t<=1001;t++){
            int sum = 0;

            for(int i=0;i<N;i++){
                if( t < preferTemper[i][0]) sum+= C;
                else if (t >= preferTemper[i][0] && t<= preferTemper[i][1]) sum += G;
                else sum += H;
            }
            maxSum = Math.max(maxSum,sum);
        }
        bw.write(String.valueOf(maxSum));
        bw.flush();
        bw.close();
    }
}