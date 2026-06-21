
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int count =0;

    static int divideNumRecursive(int n) throws IOException {
        if (n==1) return count;

        count ++;

        if (n % 2 ==0) return divideNumRecursive(n / 2);
        else return divideNumRecursive(n /3);

    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        divideNumRecursive(N);
        bw.write(String.valueOf(count));
        bw.close();
    }
}

