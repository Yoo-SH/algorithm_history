import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

// 제한 시간 1초, 3<=N<=20 이므로 완전 탐색 가능
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int N = (Integer.parseInt(br.readLine()));
        int [][] matrix = new int[N][N];
        int countMax = Integer.MIN_VALUE;

        // matrix 초기화
        for(int y=0;y<N;y++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                matrix[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        // 3 * 3 완전 탐색
        int range [][] = new int[][] {
                {0,0}, {0,1}, {0,2},
                {1,0}, {1,1}, {1,2},
                {2,0}, {2,1}, {2,2}
        };

        for(int y=0;y<N;y++){
            for(int x=0;x<N;x++){
                int count =0;
                for(int[] p : range){
                    int cy = p[0];
                    int cx = p[1];

                    int ny = cy + y;
                    int nx = cx + x;

                    if(0<=ny && ny<N && 0<= nx && nx<N && matrix[ny][nx] == 1){
                        count++;
                    }
                }

                countMax = Math.max(countMax,count);
            }
        }

        bw.write(String.valueOf(countMax));
        bw.flush();
        bw.close();
    }
}