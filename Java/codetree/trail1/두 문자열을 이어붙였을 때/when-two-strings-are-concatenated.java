
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String A = br.readLine();
        String B = br.readLine();
        String AB = A+B;
        String BA = B+A;


        if (AB.equals(BA)){
            bw.write("true");
        }else{
            bw.write("false");
        }


        bw.close();

    }
}
