import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

// N은 최대 100
// 비둘기 번호는 10

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int [] birds = new int[11]; // 비둘기 10마리 인데, 0번 비둘기는 없다고 가정
        int count =0;

        for(int i=0;i<11;i++){
            birds[i] = -1; //초기화를 -1로 진행
        }

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int birdNum = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());

            if(birds[birdNum] == -1) birds[birdNum] = pos; //첫 등장이면 위치 저장
            else{
                if(birds[birdNum] != pos){
                    count++;
                    birds[birdNum] = pos;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}