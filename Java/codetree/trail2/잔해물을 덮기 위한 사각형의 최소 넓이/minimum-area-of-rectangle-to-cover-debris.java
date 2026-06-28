
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
        int matrix[][] = new int[2001][2001];
        int OFFSET = 1000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y1 = Integer.parseInt(st.nextToken()) + OFFSET;
        int x2 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y2 = Integer.parseInt(st.nextToken()) + OFFSET;
        for(int y =y1;y<y2;y++){
            for(int x = x1; x<x2;x++){
                matrix[y][x]++;
            }
        }
        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y3 = Integer.parseInt(st.nextToken()) + OFFSET;
        int x4 = Integer.parseInt(st.nextToken()) + OFFSET;
        int y4 = Integer.parseInt(st.nextToken()) + OFFSET;
        for(int y =y3;y<y4;y++){
            for(int x = x3; x<x4;x++){
                matrix[y][x]--;
            }
        }

        // 최대 x길이, 최대 y길이를 구함

        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
        boolean exist = false;

        for(int y = 0; y < 2001; y++){
            for(int x = 0; x < 2001; x++){
                if(matrix[y][x] >= 1){
                    exist = true;
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
            }
        }

        if(!exist){
            bw.write("0");
        } else {
            long w = maxX - minX + 1;
            long h = maxY - minY + 1;
            bw.write(String.valueOf(w * h));
        }
        bw.close();
    }
}