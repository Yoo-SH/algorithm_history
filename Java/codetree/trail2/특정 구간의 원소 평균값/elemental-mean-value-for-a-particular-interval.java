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
        int arr [] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 초기화
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int count =0;
        // 탐색 범위 설정
        for(int w =0; w<N; w++){

            //완전탐색
            for(int i=0;i<N-w;i++){
                int sum =0;
                // 탐색 범위의 평균값을 구함
                for(int j=i;j<=i+w;j++){
                    sum += arr[j];
                }
                int len = w + 1;

                //탐색 범위에 수가 있다면 카운트
                for(int j=i;j<=i+w;j++){
                    if (sum == arr[j] * len) {
                        count++;
                        break;
                    }

                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}