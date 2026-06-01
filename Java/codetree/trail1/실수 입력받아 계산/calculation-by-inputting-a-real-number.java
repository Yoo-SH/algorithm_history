
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
        Double a = Double.parseDouble(br.readLine().trim());
        Double b = Double.parseDouble(br.readLine().trim());
        bw.write(String.format("%.2f",a+b));
        bw.close();
    }
}
