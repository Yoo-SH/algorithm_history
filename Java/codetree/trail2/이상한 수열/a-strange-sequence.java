import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count = 0;

    static int calculRecursive(int n) throws IOException {
        if (n ==1 ) return 1;
        if (n== 2) return 2;

        else return calculRecursive((int)Math.ceil(n/3)) + calculRecursive(n-1);
    }


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(calculRecursive(N)));
        bw.close();
    }
}

