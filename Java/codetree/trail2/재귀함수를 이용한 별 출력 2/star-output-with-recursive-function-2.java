import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void printStarRecursive(int n) throws IOException {
        if (n ==0) return;

        for (int i=0;i<n;i++){
            bw.write("* ");
        }
        bw.write("\n");

        printStarRecursive(n -1);

        for (int i=0;i<n;i++){
            bw.write("* ");
        }
        bw.write("\n");

    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        printStarRecursive(N);
        bw.close();
    }
}