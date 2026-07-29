import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;


// 제한 시간 5.5초,  N이 최대 8이라 완탐으로 하면 8반복문 됨
// 재귀적으로 백트래킹?
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int arr [];
    static boolean isVisited [];

    public static void backtracking(int depth){

        // 깊이가 M 보다 크다면
        if(depth == N){
            // sb에 값을 넣음
            for(int i=0;i<N;i++){
                sb.append(arr[i]).append(i == N-1? "\n" : " ");;
            }
            return;
        }

        //수를 하나씩만 사용하는 순열
        for(int i=1;i<=N;i++){
            if (isVisited[i-1]) continue;

            arr[depth] = i;
            isVisited[i-1] = true;
            backtracking(depth+1);
            isVisited[i-1] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        isVisited = new boolean[N];
        backtracking(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}