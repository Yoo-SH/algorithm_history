
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
        StringTokenizer st = new StringTokenizer (br.readLine().trim());
        double a = Double.parseDouble(br.readLine().trim());
        double b = Double.parseDouble(br.readLine().trim());
        String c = st.nextToken();
        bw.write(String.format("%s\n%.2f\n%.2f",c,a,b));
        bw.close();
    }
}
