import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;


// 제한 시간 1초,  2<=N<=20
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int [][] matrix = new int[N][N];
        int [][] marbleNow = new int[N][N]; // 현재 구슬의 위치를 저장하는 배열

        //상, 하, 좌, 우
        int [] dy = new int[]{-1,1,0,0};
        int [] dx = new int[]{0,0,-1,1};

        // matrix 초기화
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        //marbleNow 위치 초기화
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) -1, x = Integer.parseInt(st.nextToken()) -1;
            marbleNow[y][x] = 1;
        }

        //T턴 구슬 순회
        for(int t=0;t<T;t++){
            int [][] marbleNext =  new int[N][N]; // 다음 구슬의 위치를 저장하는 배열

            // marbleNow 순회
            for(int y=0;y<N;y++){
                for(int x=0;x<N;x++){
                    // 구슬 발견하면 상,하,좌,우 순회하여 최대값을 찾음
                    int maxValue = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxX = Integer.MIN_VALUE;
                    if (marbleNow[y][x] >= 1){
                        for(int i=0;i<4;i++){
                            int ny = y +dy[i], nx = x + dx[i];
                            // 유효한 범위이고 값이 크다면 값을 갱신
                            if(0<=ny && ny <N && 0 <= nx && nx <N && maxValue < matrix[ny][nx]){
                                maxValue = matrix[ny][nx];
                                maxY = ny;
                                maxX = nx;
                            }
                        }
                        // 이동한 값으로 위치 갱신
                        marbleNext[maxY][maxX] += marbleNow[y][x];
                    }
                }
            }
            // 충돌한 구슬 제거
            for (int y = 0; y < N; y++)
                for (int x = 0; x < N; x++)
                    if (marbleNext[y][x] >= 2) marbleNext[y][x] = 0;

            //턴이 끝나니 marbleNow를 갱신
            marbleNow = marbleNext;
        }

        int count =0;

        for(int y=0;y<N;y++){
            for(int x=0;x<N;x++){
                if (marbleNow[y][x] == 1) count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}