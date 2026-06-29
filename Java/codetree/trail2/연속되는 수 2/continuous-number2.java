
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
        int n = Integer.parseInt(br.readLine());
        int arr [] = new int[n];

        //초기화
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 연속하여 동일한 숫자가 나오는 횟수를 구함
        int countMax =1;
        int count =1;
        for (int i=0;i<n;i++){
            if(i ==0 || arr[i-1] != arr[i]) count =1;
            else count++;

            countMax = Math.max(countMax,count);
        }


        bw.write(String.valueOf(countMax));
        bw.close();
    }
}
