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
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        String N = br.readLine().trim();
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A진수 N을 B진수로 변환하여 출력

        ///1. A진수 -> 10진수
        int temp = Integer.parseInt(N,A);

        ///2. 10진수 -> B진수
        StringBuilder sb = new StringBuilder();
        if (temp == 0){
            sb.append('0');
        } else{
            while(temp >0){
                sb.append(temp % B);
                temp /= B;
            }
            sb.reverse();
        }


        bw.write(sb.toString());
        bw.close();

    }
}
