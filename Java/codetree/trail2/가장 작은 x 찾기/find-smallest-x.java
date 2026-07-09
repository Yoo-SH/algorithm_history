
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

// 제한 시간 3초, a, b의 범위가 최대 10,000, n은 최대 10
// 완전 탐색 가능
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final int INT_MAX = Integer.MAX_VALUE;
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [][] range  = new int[N][2]; // [a,b]가 N개
        int result = -1;

        // range 배열 초기화
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            range[i][0] = a;
            range[i][1] = b;
        }

        // 가능한 범위내의 x에 대해서 완전탐색
        for(int x=1;x<=10000;x++){
            boolean isOk = true;
            for(int n=0;n<N;n++){
                int a = range[n][0];
                int b = range[n][1];

                int c = x*(int)Math.pow(2,n+1);

                if(!(a <= c && c <= b)){
                    isOk =false;
                    break;
                }
            }

            if(isOk) {
                result = x;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}