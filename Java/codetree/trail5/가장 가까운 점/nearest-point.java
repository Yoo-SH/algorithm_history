import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.PriorityQueue;

class Point implements Comparable<Point>{
    int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x + this.y != p.x + p.y)
            return Integer.compare(this.x + this.y, p.x + p.y);
        if (this.x != p.x)
            return Integer.compare(this.x, p.x);
        return Integer.compare(this.y, p.y);
    }
}
// 제한 시간 3초
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

            pq.add(new Point(x,y));
        }


        for(int i=0;i<M;i++){
            Point p = pq.poll();
            int x = p.x +2;
            int y = p.y +2;

            pq.add(new Point(x,y));
        }

        Point p = pq.poll();
        bw.write(String.format("%d %d",p.x,p.y));
        bw.flush();
        bw.close();
        br.close();
    }
}