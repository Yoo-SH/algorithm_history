
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int a_temp = 5;
        int b_temp = 6;
        int c_temp = 7;
        int a = c_temp;
        int b = a_temp;
        int c = b_temp;

        bw.write(String.format("%d\n%d\n%d",a,b,c));
        bw.close();
    }
}