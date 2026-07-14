import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

//  1 <= N <= 10^4, 1<블럭의 수 <=10^4
// 그리디 방식으로 접근.
/// 평균값을 구하고, 해당 평균보다 크면 빼서 평균보다 작은 값에 배분

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        long sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine().trim());   // Inter → Integer 오타
            sum += arr[i];
        }

        int avg = (int) (sum / N);   // 문제에서 항상 가능하다 했으니 딱 나눠떨어짐

        long result = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > avg) {
                result += arr[i] - avg;   // 초과분만 누적
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}