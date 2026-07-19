import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        // 초기화
        for(int i=1;i<N+1;i++){
            dq.addLast(i);
        }

        while(dq.size() != 1){
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }

        bw.write(String.valueOf(dq.pollFirst()));
        bw.flush();
        bw.close();
    }
}