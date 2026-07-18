import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command){
                case "push":{
                    int n = Integer.parseInt(st.nextToken());
                    q.add(n);
                    break;
                }
                case "pop":{
                    bw.write(String.valueOf(q.poll())+"\n");
                    break;
                }
                case "front":{
                    bw.write(String.valueOf(q.peek())+"\n");
                    break;
                }
                case "size":{
                    bw.write(String.valueOf(q.size())+"\n");
                    break;
                }
                case "empty":{
                    if(q.isEmpty()) bw.write("1"+"\n");
                    else bw.write("0"+"\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}