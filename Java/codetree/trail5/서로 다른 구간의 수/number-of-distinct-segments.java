import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 10^9 <=주어지는 점의 위치 <= 10^9
class Segment{
    int x1, x2;

    public  Segment(int x1, int x2){
        this.x1 = x1;
        this.x2 = x2;
    }
}

class Point implements Comparable<Point>{
    int x,v, index;

    public Point(int x, int v, int index){
        this.x = x;
        this.v = v;
        this.index = index;
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
            points.add(new Point(x1 , 1, i));
            points.add(new Point(x2 , -1 ,i));

        }

        Collections.sort(points);

        HashSet<Integer> segs = new HashSet<>();

        int ans =-0;
        for(int i=0;i < 2 * N;i++){
            int x = points.get(i).x;
            int v = points.get(i).v;
            int index = points.get(i).index;

            if (v == 1){
                if (segs.size() == 0)
                    ans++;

                segs.add(index);
            }
            else if (v == -1) {
                segs.remove(index);
            }
        }


        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }
}