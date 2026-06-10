
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        char ch1 = st.nextToken().charAt(0);
        char ch2 = st.nextToken().charAt(0);
        int asc1 = (int)ch1;
        int asc2 = (int)ch2;

        bw.write(String.format("%d %d",asc1+asc2,Math.abs(asc1-asc2)));
        bw.close();
    }
}
