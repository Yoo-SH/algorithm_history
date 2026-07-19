import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command){
                case "push_back":{
                    int n = Integer.parseInt(st.nextToken());
                    dq.addLast(n);
                    break;
                }
                case "push_front":{
                    int n = Integer.parseInt(st.nextToken());
                    dq.addFirst(n);
                    break;
                }
                case "pop_front":{
                    bw.write(String.valueOf(dq.pollFirst())+"\n");
                    break;
                }
                case "pop_back":{
                    bw.write(String.valueOf(dq.pollLast())+"\n");
                    break;
                }
                case "front":{
                    bw.write(String.valueOf(dq.peekFirst())+"\n");
                    break;
                }
                case "back":{
                    bw.write(String.valueOf(dq.peekLast())+"\n");
                    break;
                }
                case "size":{
                    bw.write(String.valueOf(dq.size())+"\n");
                    break;
                }
                case "empty":{
                    if(dq.isEmpty()) bw.write(String.valueOf(1)+"\n");
                    else bw.write(String.valueOf(0)+"\n");
                    break;
                }

            }
        }
        bw.flush();
        bw.close();
    }
}