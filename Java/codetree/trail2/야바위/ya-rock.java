
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

    static final int INT_MAX = Integer.MAX_VALUE;
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int maxScore = INT_MIN;
        int [][] commands = new int[N][3];

        // a,b,c 입력 저장
        for (int t = 0; t < N; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            commands[t][0] = Integer.parseInt(st.nextToken()) - 1; // 0-index 변환
            commands[t][1] = Integer.parseInt(st.nextToken()) - 1;
            commands[t][2] = Integer.parseInt(st.nextToken()) - 1;
        }

        //돌이 처음에 존재하는 경우를 모두 완전 탐색
        for(int i=0;i<3;i++){
            int [] stone = new int[3];
            stone[i] = 1; // 돌이 존재하는 경우 1, 없는 경우 0
            int score = 0;

            for(int t=0;t<N;t++){
                int a = commands[t][0];
                int b = commands[t][1];
                int c = commands[t][2];

                // a,b 종이컵 위치 교환
                int temp = stone[a];
                stone[a] = stone[b];
                stone[b] = temp;

                // c 종이컵 들어올림
                if(stone[c] == 1) score++;

            }


            //최대 점수를 넘었으면 갱신
            maxScore = Math.max(maxScore,score);
        }

        bw.write(String.valueOf(maxScore));
        bw.flush();
        bw.close();
    }
}