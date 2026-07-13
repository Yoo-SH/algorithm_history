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
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int minDist = Integer.MAX_VALUE;


        // A에서 B로 그냥 걸어가는 거리
        int dist = Math.abs(B-A);
        minDist = Math.min(minDist, dist);

        // A에서 x->y로 가서 b로 걸어가는 거리
        dist = Math.abs(x-A) + Math.abs(B-y);
        minDist = Math.min(minDist, dist);

        // A에서 y->x로 가서 B로 걸어가는 거리
        dist = Math.abs(y-A) + Math.abs(B-x);
        minDist = Math.min(minDist,dist);

        bw.write(String.format("%d", minDist));
        bw.flush();
        bw.close();
    }
}