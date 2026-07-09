import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

// 제한 시간 3초, a,b,N,M의 크기는 100이하
// 완전 탐색 가능
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int pointers [][] = new int[N+1][N+1];

        // 포인터 초기화
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            pointers[a][b]++;
            pointers[b][a]++;
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<pointers.length;i++){
            for(int j=0;j<pointers[i].length;j++){
                max = Math.max(max,pointers[i][j]);
            }
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
    }
}