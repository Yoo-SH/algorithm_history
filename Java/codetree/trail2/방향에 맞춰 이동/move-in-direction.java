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
        int cy =0;
        int cx =0;
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char d = st.nextToken().charAt(0);
            int n = Integer.parseInt(st.nextToken());

            if (d == 'N') cy += n;
            else if (d == 'S') cy -= n;
            else if (d == 'W') cx -= n;
            else if (d == 'E') cx += n;
        }


        bw.write(String.format("%d %d",cx,cy));
        bw.close();
    }
}