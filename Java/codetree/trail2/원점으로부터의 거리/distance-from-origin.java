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
        Pos [] arrPos = new Pos[N];

        for(int i =0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = i+1;
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arrPos[i] = new Pos(id, x,y);
        }

        //정렬
        Arrays.sort(arrPos, (a,b) -> {
            if ((Math.abs(a.x)+ Math.abs(a.y)) != (Math.abs(b.x)+ Math.abs(b.y))) return Integer.compare((Math.abs(a.x)+ Math.abs(a.y)), (Math.abs(b.x)+ Math.abs(b.y)));
            return Integer.compare(a.id,b.id);

        });


        for(int i=0;i<N;i++){
            bw.write(String.valueOf(arrPos[i].id) + "\n");
        }
        bw.close();

    }
}


class Pos{
    int id;
    int x;
    int y;

    Pos(int id, int x, int y){
        this.id = id;
        this.x = x;
        this.y = y;
    }
}