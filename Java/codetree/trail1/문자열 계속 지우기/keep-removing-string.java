
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
        String A = br.readLine();
        String B = br.readLine();

        while (true){
            int idx = A.indexOf(B);

            // A에 B 문자가 없다면
            if (idx == -1){
                break;
            }

            A = A.substring(0,idx) +  A.substring(idx+B.length());

        }

        bw.write(A);
        bw.close();
    }
}
