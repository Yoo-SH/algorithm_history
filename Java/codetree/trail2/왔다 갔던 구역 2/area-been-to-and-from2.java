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
        int arr [ ] = new int[2001]; //음수로 넘어가는 것을 고려
        int idx =1000;

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String move = st.nextToken();

            if (move.equals("R")){
                while (num>0){
                    arr[idx]++;
                    idx++;
                    num--;
                }
            }
            else {
                while (num>0){
                    idx--;
                    arr[idx]++;
                    num--;
                }
            }

        }

        int count =0;
        for(int i=0;i<2001;i++){
            if(arr[i] >=2) count++;
        }


        bw.write(String.valueOf(count));
        bw.close();

    }
}
