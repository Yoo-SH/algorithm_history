import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int calculNumRecursive(int n) throws IOException {
        if (n <10) return n*n;

        return calculNumRecursive(n / 10) + (n %10)*(n%10);

    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(calculNumRecursive(N)));
        bw.close();
    }
}

