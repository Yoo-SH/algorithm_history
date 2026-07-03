
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
    // 오아왼위
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] matrix = new int[N][M];
        int count =0;
        int dir = 0;
        int cy =0;
        int cx =0;

        // 매트릭스 초기화
        while(count < N*M){
            count++;
            matrix[cy][cx] = count;


            int ny = cy + dy[dir];
            int nx = cx + dx[dir];

            // 다음 방향이 범위를 벗어나거나 이미 지나간 경로라면 방향전환
            if(!(0<=ny && ny <N) || !(0<=nx && nx <M) || matrix[ny][nx] != 0) {
                dir = (dir +1) %4;
                ny = cy + dy[dir];
                nx = cx + dx[dir];
            }

            cy = ny;
            cx = nx;

        }

        StringBuilder sb = new StringBuilder();
        for (int y=0;y<N;y++){
            for(int x=0;x<M;x++){
                sb.append(matrix[y][x]).append(' ');
            }
            sb.append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}