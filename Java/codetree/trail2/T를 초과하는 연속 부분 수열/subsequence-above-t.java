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
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int countMax = 0;
        int count = 0;

        for (int i=0;i<n;i++){
            if (arr[i] > t) count++;
            else count =0;

            countMax = Math.max(countMax,count);
        }

        bw.write(String.valueOf(countMax));
        bw.close();
    }
}
