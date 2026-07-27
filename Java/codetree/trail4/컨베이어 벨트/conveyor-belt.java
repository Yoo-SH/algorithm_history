import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;

// 제한 시간 1초, 1<=T<=100, 1<N<=200 이므로 완전 탐색 가능
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int [] lineTop = new int[N];
        int [] lineBottom = new int[N];

        //초기화
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            lineTop[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            lineBottom[i] = Integer.parseInt(st.nextToken());
        }

        // T번 변경 시뮬레이션
        for(int t=0;t<T;t++){
            // 각 줄의 마지막 원소를 temp에 빼둠
            int tempTop = lineTop[N-1];
            int tempBottom = lineBottom[N-1];

            // 두 줄 모두 오른쪽으로 한 칸씩 밀기
            for(int i=N-1;i>0;i--){
                lineTop[i] = lineTop[i-1];
                lineBottom[i] = lineBottom[i-1];
            }

            // 아랫줄 끝은 윗줄 앞으로, 윗줄 끝은 아랫줄 앞으로
            lineTop[0] = tempBottom;
            lineBottom[0] = tempTop;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(lineTop[i]);
            sb.append(i==N-1 ? "\n" : " ");
        }
        for(int i=0;i<N;i++){
            sb.append(lineBottom[i]);
            sb.append(i==N-1 ? "\n" : " ");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}