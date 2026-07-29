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
    static int N;
    static int M;
    static int arr [];

    public static void backtracking(int depth, int start){

        // 깊이가 M 보다 크다면
        if(depth == M){
            // sb에 값을 넣음
            for(int i=0;i<M;i++){
                sb.append(arr[i]).append(i == M-1? "\n" : " ");;
            }
            return;
        }
        //순열로 만들기 위해 start 변수를 활용
        for(int i=start;i<=N;i++){
            arr[depth] = i;
            backtracking(depth+1,i+1);
        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        backtracking(0,1);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}