import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String N;
    static String M;



    public static int fuction(){
        return N.indexOf(M);
    }

    public static void main(String[] args) throws IOException {
        N = br.readLine();
        M  = br.readLine();

        bw.write(String.valueOf(fuction()));
        bw.close();
    }
}

