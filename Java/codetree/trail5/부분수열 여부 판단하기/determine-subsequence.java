import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        //초기화
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int allArr [] = new int[N];
        int partArr [] = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            allArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            partArr[i] = Integer.parseInt(st.nextToken());
        }

        int a =0; // all의 idx
        int b =0; // part의 idx

        while(a <N && b <M){
            if (allArr[a] == partArr[b])
            {
                a++;
                b++;
            }
            else
            {
              a++;
            }
        }

        bw.write(b == M ? "Yes" : "No");
        bw.flush();
        bw.close();
        br.close();
    }
}