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
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [] students = new int[N];
        int result =-1;

        for(int i=0; i<M;i++){
            int num = Integer.parseInt(br.readLine()) -1;
            students[num]++;

            if (students[num] ==K){
                result = num+1;
                break;
            }
        }


        bw.write(String.valueOf(result));
        bw.close();
    }
}