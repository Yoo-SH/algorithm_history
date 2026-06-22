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
        Integer N = Integer.parseInt(br.readLine());
        Integer [] arr = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for (int i =0; i<N;i++){
            sb.append(arr[i] + " ");
        }
        sb.append('\n');

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            sb.append(arr[i] + " ");
        }

        bw.write(sb.toString());
        bw.close();
    }
}

