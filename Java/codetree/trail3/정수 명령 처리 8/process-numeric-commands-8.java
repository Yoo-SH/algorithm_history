import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> l = new LinkedList<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch(str){
                case "push_back":{
                    int n = Integer.parseInt(st.nextToken());
                    l.addLast(n);
                    break;
                }
                case "push_front":{
                    int n = Integer.parseInt(st.nextToken());
                    l.addFirst(n);
                    break;
                }
                case "pop_front":{
                    bw.write(String.valueOf(l.pollFirst()+"\n"));
                    bw.flush();
                    break;
                }
                case "pop_back":{
                    bw.write(String.valueOf(l.pollLast()+"\n"));
                    bw.flush();
                    break;
                }
                case "front":{
                    bw.write(String.valueOf(l.peekFirst()+"\n"));
                    bw.flush();
                    break;
                }
                case "back":{
                    bw.write(String.valueOf(l.peekLast()+"\n"));
                    bw.flush();
                    break;
                }
                case "size":{
                    bw.write(String.valueOf(l.size()+"\n"));
                    bw.flush();
                    break;
                }
                case "empty":{
                    int result;
                    if(l.isEmpty()) result =1;
                    else result =0;
                    bw.write(String.valueOf(result+"\n"));
                    bw.flush();
                    break;
                }
            }

        }
        bw.close();
    }
}