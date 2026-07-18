import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final int MAX_NUM = 100000;

    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch(command){
                case "push":{
                    int n = Integer.parseInt(st.nextToken());
                    stack.push(n);
                    break;
                }
                case "pop":{
                    bw.write(String.valueOf(stack.pop())+"\n");
                    break;
                }
                case "top":{
                    bw.write(String.valueOf(stack.peek()+"\n"));
                    break;
                }
                case "size":{
                    bw.write(String.valueOf(stack.size())+"\n");
                    break;
                }
                case "empty":{
                    if(stack.isEmpty()) bw.write("1"+"\n");
                    else bw.write("0"+"\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}