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
        int hA = Integer.parseInt(st.nextToken());
        int mB = Integer.parseInt(st.nextToken());
        int hC = Integer.parseInt(st.nextToken());
        int mD = Integer.parseInt(st.nextToken());

        int mTotal = (hC -hA) * 60 + (mD -mB);

        bw.write(String.valueOf(mTotal));

        bw.close();

    }
}
