import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.Queue;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;


// 제한 시간 1초, BFS탐색
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] matrix = new int[N][M];
        boolean [][] isVisited = new boolean[N][M];
        Queue<int []> queue = new ArrayDeque<>();
        queue.offer(new int[]{0,0,0}); //y,x,level
        boolean isCanOff = false;
        int result =0;

        // 상, 하, 좌, 우
        int [] dy = new int[]{1,-1,0,0};
        int [] dx = new int[]{0,0,-1,1};

        // matrix 초기화
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<M;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        while (!queue.isEmpty()){
            int []cur = queue.poll();
            int cy = cur[0], cx = cur[1], level = cur[2];

            if(cy == N-1 && cx == M-1) {
                isCanOff =true;
                result = level;
                break;
            }

            for(int i =0;i<4;i++){
                int ny = cy +dy[i], nx = cx + dx[i];

                // 유효한 범위인 경우
                if(0<=ny && ny <N && 0<= nx && nx <M && matrix[ny][nx] ==1 && !isVisited[ny][nx]){
                    isVisited[ny][nx] = true;
                    queue.offer(new int[]{ny,nx,level+1});
                }

            }
        }

        bw.write(isCanOff ? String.valueOf(result) : "-1");
        bw.flush();
        bw.close();
    }
}