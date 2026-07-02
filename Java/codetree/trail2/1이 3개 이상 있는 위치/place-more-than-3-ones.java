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
    // 0:위, 1:오, 2:아, 3:왼
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int matrix[][] = new int[N][N];
        int result =0;

        // matrix 초기화
        for(int y=0;y<N;y++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        //matrix 순회
        for(int cy=0;cy<N;cy++){
            for(int cx=0;cx<N;cx++){
                int count =0;
                // 인접칸 순회
                for(int d = 0;d<4;d++){
                    int ny = cy + dy[d];
                    int nx = cx + dx[d];
                    if((0<=ny && ny <N && 0<=nx && nx <N ) && matrix[ny][nx] == 1) count++;
                }
                //인접칸에 1이 3개 이상이면
                if (count >=3) result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}