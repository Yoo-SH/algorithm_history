import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int time [][] = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(st.nextToken());
            time[i][1] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(time, (a,b) -> Integer.compare(a[1],b[1]));

        int count =0;
        int endTime =-1;
        for(int i=0;i<N;i++){
            if(endTime <= time[i][0]) {
                count++;
                endTime = time[i][1];
            }
        }
    
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}