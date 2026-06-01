
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int a = 3;
        int b = 4;
        b = a;
        bw.write(String.format("%d %d\n%d",a,b,a*b));
        bw.close();
    }
}
