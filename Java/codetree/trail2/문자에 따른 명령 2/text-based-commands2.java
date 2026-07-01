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
    // 0:북, 1:동, 2:남, 3:서
    static int[] dy = {1, 0, -1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        int cy = 0;
        int cx = 0;
        String command = br.readLine();
        int dir = 0; //시작은 북쪽


        for(int i=0;i<command.length();i++){
            if (command.charAt(i) == 'L')
                dir = (dir + 3) % 4; //왼쪽 90도
            else if (command.charAt(i) == 'R')
                dir = (dir + 1) % 4; //오른족 90도
            else if (command.charAt(i) == 'F'){
                cy += dy[dir];
                cx += dx[dir];
            }

        }

        bw.write(cx + " " + cy);
        bw.close();
    }
}