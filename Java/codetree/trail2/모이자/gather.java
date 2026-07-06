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
        int N = Integer.parseInt(br.readLine());
        int [] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i]= Integer.parseInt(st.nextToken());
        }
        int minSum = INT_MAX;

        for(int i=0;i<N;i++){
            int dist = 0;
            for(int j=0;j<N;j++){
                dist += A[j] * Math.abs(i-j); //내 위치 * 거리
            }
            minSum = Math.min(minSum,dist);

        }


        bw.write(String.valueOf(minSum));
        bw.flush();
        bw.close();
    }
}