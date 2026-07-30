import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;


// 제한 시간 1초, DFS탐색
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<List<Integer>> graph = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.add(1);
        boolean [] isVisited = new boolean[N+1];
        isVisited[1] = true;
        int count =0;

        //정점 수만큼 리스트 초기화
        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        //간선 추가
        for(int i=0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            //무방향 그래프 이므로 양쪽 다 추가
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        // DFS를 이용한 노드 순회
        while (!stack.isEmpty()){
            int cur = stack.pop();

            if(cur != 1) count++;

            //다음 노드 순회
            for(int next : graph.get(cur)){

                //방문 한적 없는 노드라면
                if(!isVisited[next]){
                    isVisited[next] = true;
                    stack.add(next);
                }

            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();

    }
}