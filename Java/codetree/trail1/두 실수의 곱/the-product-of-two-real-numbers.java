
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        double a = 5.26;
        double b = 8.27;
        bw.write(String.format("%.3f",a*b));
        bw.close();
    }
}
