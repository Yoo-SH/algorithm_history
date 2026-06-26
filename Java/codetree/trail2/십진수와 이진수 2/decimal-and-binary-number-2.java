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
        String N = br.readLine().trim();
        int tenN = Integer.parseInt(N,2);
        String bin = Integer.toBinaryString(tenN * 17);

        bw.write(bin);
        bw.close();

    }
}
