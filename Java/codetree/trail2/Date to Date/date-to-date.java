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
    static int[] numOfDays = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        int totalDay =0;
        for (int m=m1;m<=m2;m++){
            if (m1 == m2) {
                bw.write(String.valueOf(d2-d1+1));
                bw.close();
                return;
            }
            if (m==m1) totalDay += numOfDays[m1] - d1 +1;
            else if (m==m2) totalDay += d2;
            else totalDay += numOfDays[m];
        }

        bw.write(String.valueOf(totalDay));

        bw.close();

    }
}
