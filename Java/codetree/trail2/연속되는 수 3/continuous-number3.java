
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
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int countMax = 1;
        int count = 1;

        for (int i=0;i<n;i++){
            if (i == 0 || Integer.signum(arr[i-1])  != Integer.signum(arr[i])) count =1; //같은 부호가 아니라면
            else count++;

            countMax = Math.max(countMax,count);
        }

        bw.write(String.valueOf(countMax));
        bw.close();
    }
}
