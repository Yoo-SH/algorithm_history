import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        char[] a = br.readLine().trim().toCharArray();
        char[] b = br.readLine().trim().toCharArray();

        int count = 0;
        boolean flipped = false;   // 지금까지 누적된 반전 여부

        for (int i = n - 1; i >= 0; i--) {
            char cur = flipped ? (a[i] == 'G' ? 'H' : 'G') : a[i];
            if (cur != b[i]) {     // 이 칸은 i번을 누르는 수밖에 없음
                count++;
                flipped = !flipped;
            }
        }
        System.out.println(count);
    }
}