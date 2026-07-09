
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

// 제한 시간 3초, N은 최소 2, 최대 20
// 완전 탐색 가능
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final int INT_MAX = Integer.MAX_VALUE;
    static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int arr [] = new int[N];
        int maxDist = INT_MIN;

        String str = br.readLine();

        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i) -'0';
        }


        //비어있는 좌석에 사람을 모두 추가해보는 완전탐색
        for(int i=0;i<N;i++){
            int prevIdx = -1;
            int minDist = INT_MAX;

            if(arr[i] == 1) continue;
            else arr[i] = 1; //해당 좌석에 사람을 넣어봄

            // 좌석간의 최소 거리를 구함
            for(int j=0;j<N;j++){
                if (arr[j] == 1 && prevIdx != -1) {
                    int dist = j - prevIdx;
                    minDist = Math.min(minDist,dist);
                    prevIdx = j;
                } else if (arr[j] == 1 && prevIdx == -1){ //첫 1이 나왔을 때는 거리 계산 안함.
                    prevIdx = j;
                }
            }

            //최소한의 거리 중 최대의 거리를 구해야함.
            maxDist = Math.max(maxDist,minDist);
            // 다시 복구
            arr[i] =0;
        }


        bw.write(String.valueOf(maxDist));
        bw.flush();
        bw.close();

    }
}