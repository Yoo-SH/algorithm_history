import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int memo [];

    static int fibonachi(int n){
        if(memo[n] != 0) return memo[n];
        if(n<=2) return 1;
        return memo[n] = fibonachi(n - 1) + fibonachi(n - 2);
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        memo = new int[N+1];
        bw.write(String.valueOf(fibonachi(N)));
        bw.flush();
        bw.close();

    }
}