import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;


// 제한 시간 1초, DFS탐색
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int [][] matrix = new int[N][M];
        Deque<int[]> stack = new ArrayDeque<>(); //DFS 탐색에 필요한 Stack
        boolean beGoal = false;
        boolean[][] visited = new boolean[N][M];

        stack.add(new int[]{0,0});
        visited[0][0] = true;

        // 오른쪽, 아래
        int [] dy = new int[]{0,1};
        int [] dx = new int[]{1,0};

        // matrix 초기화
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<M;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        //DFS 순회
        while(!stack.isEmpty() && !beGoal){
            int [] cur = stack.pop();
            int cy = cur[0], cx = cur[1];

            for(int i=0;i<2;i++){
                int ny = cy + dy[i], nx = cx + dx[i];

                if(ny == N-1 && nx == M-1){
                    beGoal = true;
                    break;
                }

                // 유효한 범위이고 뱀이 존재하지 않는다면
                if(0<=ny && ny<N && 0<= nx && nx <M && matrix[ny][nx] == 1 && !visited[ny][nx]){
                    visited[ny][nx] = true;
                    stack.add(new int[]{ny,nx});
                }
            }
        }

        bw.write(beGoal ? "1" : "0");
        bw.flush();
        bw.close();
    }
}