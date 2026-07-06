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
        int matrix [][ ] = new int[N][N];

        // matrix 초기화
        for(int y =0;y<N;y++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x =0;x<N;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCount = INT_MIN;
        // matrix 완전 탐색
        for(int y=0;y<N;y++){
            for(int x=0;x<N-2;x++){
                int count = 0;
                count = matrix[y][x] + matrix[y][x+1] + matrix[y][x+2];
                maxCount = Math.max(maxCount,count);
            }
        }
        bw.write(String.valueOf(maxCount));
        bw.flush();
        bw.close();
    }
}