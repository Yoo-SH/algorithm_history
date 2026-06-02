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
        StringTokenizer st = new StringTokenizer(br.readLine());
        String st1 = st.nextToken();
        String st2 = st.nextToken();

        if (st1.length() > st2.length()){
            bw.write(String.format("%s %d",st1, st1.length()));
        } else if (st1.length() < st2.length()){
            bw.write(String.format("%s %d",st2, st2.length()));
        } else{
            bw.write("same");
        }
        bw.close();
    }
}
