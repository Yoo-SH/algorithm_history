import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void printNumRecursive(int n) throws IOException {
        if (n ==0) return;

        bw.write(String.format("%d ", n));
        printNumRecursive(n -1);
        bw.write(String.format("%d ", n));


    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        printNumRecursive(N);
        bw.close();
    }
}

