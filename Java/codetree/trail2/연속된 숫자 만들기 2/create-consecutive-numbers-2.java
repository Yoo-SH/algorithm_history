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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int arr [] = new int[]{a,b,c};

        // a, b, c 를 오름차순으로 정렬
        Arrays.sort(arr);


        int gap1 = arr[1] - arr[0];
        int gap2 = arr[2] - arr[1];

        int answer;
        if (gap1 == 1 && gap2 == 1) answer = 0;       // 이미 연속
        else if (gap1 == 2 || gap2 == 2) answer = 1;  // 1칸짜리 틈 존재
        else answer = 2;                               // 나머지 전부

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}