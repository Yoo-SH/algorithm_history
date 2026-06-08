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
        String str = st.nextToken();
        String target = st.nextToken();
        int idx = str.indexOf(target);
        if (idx == -1){
            bw.write("No");
        } else{
            bw.write(String.format("%d",idx));
        }

        bw.close();

    }
}
