import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static int fuction(String N, String M){
        return N.indexOf(M);
    }

    public static void main(String[] args) throws IOException {
        String N = br.readLine();
        String M  = br.readLine();

        bw.write(String.valueOf(fuction(N,M)));
        bw.close();
    }
}

