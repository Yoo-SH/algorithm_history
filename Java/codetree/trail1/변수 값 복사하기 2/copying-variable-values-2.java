
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int a = 5;
        int b = 6;
        int c = 7;
        a = b = c;

        bw.write(String.format("%d %d %d",a,b,c));
        bw.close();
    }
}
