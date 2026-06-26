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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int totalTime =0;

        if (A < 11 || (A == 11 && B < 11) || ((A == 11 && B == 11 && C <11) )) totalTime = -1;
        else{
            totalTime += ((A * 24 * 60) + (B * 60) + (C)) - ((11)* 24 *60 + (11)* 60 + 11);
        }

        bw.write(String.valueOf(totalTime));
        bw.close();

    }
}
