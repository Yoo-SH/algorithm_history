
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int a = 1;
        int b = 2;
        int c = 3;
        int sum  = a+b+c;
        a = b = c = sum;

        bw.write(String.format("%d %d %d",a,b,c));
        bw.close();
    }
}