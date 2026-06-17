import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void function(int [] arr) {

        for(int i =0;i<arr.length;i++){
            arr[i] = Math.abs(arr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        function(arr);

        for(int i=0;i<n;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }

        bw.write(sb.toString());
        bw.close();
    }
}