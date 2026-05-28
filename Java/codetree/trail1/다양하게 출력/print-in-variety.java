import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        bw.write("Total days in Year\n");
        bw.write("365\n");
        bw.write("Circumference rate\n");
        bw.write("3.1415926535\n");
        bw.close();
    }
}
