
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int a = 3;
        int b = 5;
        int temp = a;
        a = b;
        b = temp;
        bw.write(String.format("%d\n%d",a,b));
        bw.close();
    }
}