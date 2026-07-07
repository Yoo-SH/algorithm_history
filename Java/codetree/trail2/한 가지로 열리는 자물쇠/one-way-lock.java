
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
        int arr [ ] = new int[3];
        int count =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 초기화
        for(int i=0;i<3;i++){
            int n  = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        // 완전 탐색 (i,j,k)
        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                for(int k=1;k<N+1;k++){
                    if(Math.abs(arr[0] - i) <=2 || Math.abs(arr[1] - j) <=2 || Math.abs(arr[2] - k) <=2 ) count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}