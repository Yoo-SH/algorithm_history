
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
        int [][]points = new int[N][2];
        int minArea = INT_MAX;

        // 초기화
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i][0] = x;
            points[i][1] = y;
        }

        // 완전 탐색으로 점 하나씩 빼며 사각형 만들기
        for(int i=0;i<N;i++){
            int targetX = points[i][0];
            int targetY = points[i][1];

            // 최대 최소 y,x 구하기
            int maxX =INT_MIN;
            int maxY =INT_MIN;
            int minX =INT_MAX;
            int minY =INT_MAX;

            for(int p=0;p<N;p++){
                int x = points[p][0];
                int y = points[p][1];
                if(x == targetX && y == targetY)
                    continue;
                maxY = Math.max(maxY,y);
                minY = Math.min(minY,y);
                maxX = Math.max(maxX,x);
                minX = Math.min(minX,x);
            }

            // 사각형 넓이 계산하기
            int area = (maxY - minY) * (maxX -minX);
            minArea = Math.min(minArea,area);
        }

        // 결과 출력
        bw.write(String.format("%d",minArea));
        bw.flush();
        bw.close();
    }
}