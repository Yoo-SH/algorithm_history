
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

// 제한 시간 3초, 1<= N <= 100, 0<K<= 100
// 완전 탐색 가능
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int x3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        boolean isIntersection = (x1 <= x4 && x3 <= x2);
        // 두 선분의 교차 여부를 판단(경계값 포함)

        if(isIntersection)bw.write("intersecting");
        else bw.write("nonintersecting");

        bw.flush();
        bw.close();



    }
}