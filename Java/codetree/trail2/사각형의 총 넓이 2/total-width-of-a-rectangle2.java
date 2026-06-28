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
        int matrix [][] = new int[201][201]; // y행, x열
        int OFFSET = 100;
        int count =0;

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
            int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
            int y2 = Integer.parseInt(st.nextToken()) + OFFSET;

            for(int y= y1;y<y2;y++){
                for(int x=x1; x<x2;x++){
                    matrix[y][x]++;
                }
            }

        }

        for(int y=0;y<201;y++){
            for(int x=0;x<201;x++){
                if(matrix[y][x] >=1)
                    count++;
            }
        }


        bw.write(String.valueOf(count));
        bw.close();
    }
}
