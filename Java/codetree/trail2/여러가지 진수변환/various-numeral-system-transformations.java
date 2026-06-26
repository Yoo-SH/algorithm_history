import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N  = Integer.parseInt(st.nextToken());
        int M =  Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if(N == 0){{
            sb.append('0');
        }} else{
            while(N>0){
                sb.append(N%M);
                N /= M;
            }
            sb.reverse();
        }

        bw.write(sb.toString());
        bw.close();

    }
}
