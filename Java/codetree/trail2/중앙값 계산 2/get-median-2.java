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
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [] arr = new int[N];

        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr,0,i+1);

            if (i % 2 ==0){
                int mid = (i+1)/2;
                sb.append(arr[mid]+" ");
            }

        }
        bw.write(sb.toString());
        bw.close();
    }
}

