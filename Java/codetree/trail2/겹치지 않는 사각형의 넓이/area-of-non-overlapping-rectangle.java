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
        int matrix [][] = new int[2001][2001];
        int OFFSET = 1000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1A = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1A = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2A = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2A = Integer.parseInt(st.nextToken()) + OFFSET;
        for(int y= y1A;y<y2A;y++){
            for(int x= x1A;x<x2A;x++){
                matrix[y][x]++;
            }
        }
        st = new StringTokenizer(br.readLine());
        int x1B = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1B = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2B = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2B = Integer.parseInt(st.nextToken()) + OFFSET;
        for(int y= y1B;y<y2B;y++){
            for(int x= x1B;x<x2B;x++){
                matrix[y][x]++;
            }
        }
        st = new StringTokenizer(br.readLine());
        int x1M = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1M = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2M = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2M = Integer.parseInt(st.nextToken()) + OFFSET;
        for(int y= y1M;y<y2M;y++){
            for(int x= x1M;x<x2M;x++){
                matrix[y][x]--;
            }
        }

        int count =0;
        for(int y=0;y<2001;y++){
            for(int x=0;x<2001;x++){
                if( matrix[y][x] >= 1) count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
