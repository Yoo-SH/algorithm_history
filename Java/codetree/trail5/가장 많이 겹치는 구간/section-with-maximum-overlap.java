import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Collections;

// 10^9 <=주어지는 점의 위치 <= 10^9
class Segment{
    int x1, x2;

    public  Segment(int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
    }
}

class Point implements Comparable<Point>{
    int x,v;

    public Point(int x, int v){
        this.x = x;
        this.v = v;
    }
    @Override
    public int compareTo(Point p){
        return Integer.compare(this.x, p.x);
    }


}
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<>();
        Segment[] segments = new Segment[N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()), x2 = Integer.parseInt(st.nextToken());
            segments[i] = new Segment(x1,x2);
            points.add(new Point(x1 , 1));
            points.add(new Point(x2 , -1));

        }

        Collections.sort(points);

        int maxSumVal =0;
        int sumVal =0;
        for(int i=0;i < 2 * N;i++){
            int x = points.get(i).x;
            int v = points.get(i).v;

            sumVal += v;
            maxSumVal = Math.max(maxSumVal,sumVal);
        }


        bw.write(String.valueOf(maxSumVal));
        bw.flush();
        bw.close();
        br.close();

    }
}