import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

//  1 <= N <= 100, -100<s<=100
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int A =0;
        int B =0;
        int result =0;
        int prevCase = 3;
        int nowCase =0;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());

            // 위치 갱신
            if (c == 'A') A += num;
            else B += num;


            if (A > B) { // case1: A가 B보다 높은 경우
                nowCase = 1;

                if(prevCase != nowCase) {
                    result++;
                    prevCase = 1;
                }
            }


            else if(B > A){ // case2:  B가 A보다 높은 경우
                nowCase = 2;

                if(prevCase != nowCase) {
                    result++;
                    prevCase = 2;
                }

            }

            else{ // case3: A와 B가 같은 경우
                nowCase = 3;

                if(prevCase != nowCase) {
                    result++;
                    prevCase = 3;
                }

            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();


    }
}