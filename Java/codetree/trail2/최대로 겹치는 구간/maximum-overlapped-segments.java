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

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [] block = new int [201]; // 0~100까지는 음수, 100~200까지는 양수
        for (int i =0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + 100;
            int x2 = Integer.parseInt(st.nextToken()) + 100;

            for (int j =x1;j<x2; j++){
                block[j]++;
            }

        }

        int max = 0;
        for(int i=0;i<201;i++){
            max = Math.max(max, block[i]);  // 개수가 아니라 최댓값
        }
        bw.write(String.valueOf(max));
        bw.close();

    }
}
