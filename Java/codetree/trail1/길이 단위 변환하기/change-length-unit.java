import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        bw.write(String.format("%.1fft = %.1fcm%n", 9.2, 9.2 * 30.48));
        bw.write(String.format("%.1fmi = %.1fcm",   1.3, 1.3 * 160934));
        bw.close();
    }
}
