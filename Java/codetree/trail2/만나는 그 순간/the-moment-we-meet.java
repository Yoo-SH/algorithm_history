
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
        int [] A = new int[1000001];
        int [] B = new int[1000001];
        int ATime =0;
        int BTime =0;


        for(int i =0 ; i<N;i++){
            st = new StringTokenizer(br.readLine());
            char d =  st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            if (d == 'L') {
                for(int j = ATime + 1; j<=ATime + t;j++){
                    A[j] = A[j-1] - 1;
                }
            }
            else if (d =='R') {
                for(int j = ATime + 1; j<=ATime + t;j++){
                    A[j] = A[j-1] + 1;
                }
            }
            ATime += t;

        }


        for(int i =0 ; i<M;i++){
            st = new StringTokenizer(br.readLine());
            char d =  st.nextToken().charAt(0);
            int t = Integer.parseInt(st.nextToken());

            if (d == 'L') {
                for(int j = BTime + 1; j<=BTime + t;j++){
                    B[j] = B[j-1] - 1;
                }
            }
            else if (d =='R') {
                for(int j = BTime + 1; j<=BTime + t;j++){
                    B[j] = B[j-1] + 1;
                }
            }
            BTime += t;

        }

        // 움직임이 끝난 뒤에는 마지막 위치에 머무름
        for(int i = ATime + 1; i < 1000001; i++){
            A[i] = A[ATime];
        }
        for(int i = BTime + 1; i < 1000001; i++){
            B[i] = B[BTime];
        }


        int result =-1;
        for(int i=1;i<1000001;i++){
            if (A[i] == B[i]) {
                result = i;
                break;
            }

        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}