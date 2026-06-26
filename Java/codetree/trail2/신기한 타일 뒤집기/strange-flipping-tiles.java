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
        char arr [ ] = new char[20001]; //음수로 넘어가는 것을 고려, false는 흰색, true가 검정색
        int whiteNum = 0;
        int blackNum = 0;
        int idx =10000; //중앙에서 시작

        for (int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String move = st.nextToken();

            if (move.equals("R")){
                while(num>0){
                    arr[idx] = 'B';
                    idx++;
                    num--;
                }
                idx--; // 마지막으로 뒤집은 칸으로 복귀
            }else{
                while (num>0){
                    arr[idx] = 'W';
                    idx--;
                    num--;
                }
                idx++; // 마지막으로 뒤집은 칸으로 복귀
            }
        }

        for(int i=0;i<20001;i++){
            if (arr[i] == 'B' ) blackNum++;
            else if (arr[i] == 'W') whiteNum++;
        }

        bw.write(String.format("%d %d",whiteNum,blackNum));
        bw.close();
    }
}
