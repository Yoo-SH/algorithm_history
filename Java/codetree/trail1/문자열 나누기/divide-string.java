
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "";
        for (int i = 0; i < N; i++) {
            str += st.nextToken();
        }

        for (int i = 0; i < str.length(); i++) {
            if (i != 0 && i % 5 == 0) {
                bw.write("\n");
            }
            bw.write(str.charAt(i));


        }
        bw.close();

    }
}
