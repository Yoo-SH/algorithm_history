
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
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int matrix[][] = new int[N][N];
        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char D = st.nextToken().charAt(0);

        int cy = R-1;
        int cx =C-1;
        int dir = -1;

        //방향 정하기
        dir = "URDL".indexOf(D);

        for(int t = 0 ;t<T;t++){
            int ny = cy + dy[dir];
            int nx = cx + dx[dir];


            if(0<= ny && ny <N && 0<= nx && nx <N) //벽에 부딪히지 않았다면
            {
                cy = ny;
                cx = nx;
            }
            else // 벽에 부딪혔다면
            {
                dir = (dir +2) % 4;
            }
        }



        bw.write((cy +1) + " " + (cx+1));
        bw.close();
    }
}