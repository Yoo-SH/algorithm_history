
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
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String T = st.nextToken();
        String [] arr = new String[N];
        int count =0;

        for (int i=0;i<N;i++){
            String input = br.readLine();

            if (input.startsWith(T)) {
                arr[count] = input;
                count++;
            }
        }

        Arrays.sort(arr,0,count);
        bw.write(arr[K-1]);

        bw.close();
    }
}

