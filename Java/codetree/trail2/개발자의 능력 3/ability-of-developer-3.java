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

    static final int  INT_MIN = Integer.MIN_VALUE;
    static final int  INT_MAX = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int students [ ] = new int[6];
        int minResult = INT_MAX;
        int allSum = 0;

        // 초기화
        for(int i=0;i<6;i++){
            students[i] = Integer.parseInt(st.nextToken());
        }

        // 총합
        for(int i=0;i<6;i++){
            allSum += students[i];
        }

        //완전탐색(i,j,k)
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                for(int k=0;k<6;k++){
                    if(i != j && j != k && i != k){
                        int aSum = students[i] + students[j] + students[k];
                        int bSum = allSum - aSum;
                        minResult = Math.min(minResult, Math.abs(aSum -bSum));
                    }
                }
            }
        }

        bw.write(String.valueOf(minResult));
        bw.flush();
        bw.close();

    }
}