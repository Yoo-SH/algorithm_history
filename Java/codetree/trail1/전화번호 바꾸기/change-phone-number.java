
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String phoneNum1 = st.nextToken();
        String phoneNum2 = st.nextToken();
        String phoneNum3 = st.nextToken();
        bw.write(String.format("%s-%s-%s",phoneNum1,phoneNum3,phoneNum2));
        bw.close();
    }
}
