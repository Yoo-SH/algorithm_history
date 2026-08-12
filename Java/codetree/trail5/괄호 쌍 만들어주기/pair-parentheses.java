import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 1<= A <= 10^5
// 완탐은 시간 초과 발생 -> 누적 카운팅으로 O(N)
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine().trim();

        long answer = 0;      // 정답 (최대 약 25억이므로 long)
        long openPairCnt = 0; // 지금까지 등장한 "((" 의 개수

        for (int i = 0; i + 1 < A.length(); i++) {
            char cur = A.charAt(i);
            char next = A.charAt(i + 1);

            if (cur == ')' && next == ')') {
                // 앞쪽에 있는 모든 "(("와 짝을 이룰 수 있다
                answer += openPairCnt;
            } else if (cur == '(' && next == '(') {
                openPairCnt++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}