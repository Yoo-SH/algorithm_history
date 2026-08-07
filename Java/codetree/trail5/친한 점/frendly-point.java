import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Point implements Comparable<Point>{
    int x, y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point p){
        if(this.x != p.x) return Integer.compare(this.x, p.x); // x를 기준으로 오름차순 정렬
        return Integer.compare(this.y, p.y); // x가 같다면 y를 기준으로 오름차순 정렬
    }

}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        TreeSet<Point> treeSet = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

        // 포인터 객체 초기화
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            treeSet.add(new Point(x,y));
        }

        //인접한 포인트 객체 출력
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());  // 이게 빠짐
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
            Point p = treeSet.ceiling(new Point(x, y));
            if (p == null) sb.append("-1 -1").append("\n");
            else sb.append(p.x).append(" ").append(p.y).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}

