import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int M;
    static int [] a;


    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        a = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int idx1 = Integer.parseInt(st.nextToken());
            int idx2 = Integer.parseInt(st.nextToken());
            int sum =0;
            for(int j =idx1; j<=idx2; j++){
                sum += a[j-1];
            }
            bw.write(String.valueOf(sum) + "\n");
        }

        bw.close();
    }
}

