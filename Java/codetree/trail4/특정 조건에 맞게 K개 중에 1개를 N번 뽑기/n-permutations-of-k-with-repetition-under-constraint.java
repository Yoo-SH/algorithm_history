import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;


// 제한 시간 6초,  N이 최대 8이라 완탐으로 하면 8반복문 됨
// 재귀적으로 백트래킹?
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int K;
    static int N;
    static int arr [];

    public static void backtracking(int depth){

        // 깊이가 N 보다 크다면
        if(depth == N){
            // 연속해서 같은 정수가 3번 이상 나오는 경우는 제외

            for(int i=1;i<N-1;i++){
                int prev = arr[i-1];
                int now  = arr[i];
                int next = arr[i+1];

                if( prev == now && now == next) return;
            }

            // sb에 값을 넣음
            for(int i=0;i<N;i++){
                sb.append(arr[i]);
                sb.append(i == N-1? "\n" : " ");
            }
            return;
        }

        for(int i=1;i<=K;i++){
            arr[depth] = i;
            backtracking(depth+1);
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        backtracking(0);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}