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
        String [] arr = new String[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            sb.append(arr[i] + "\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}

