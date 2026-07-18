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


    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        boolean isOk = true;

        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty()) {   // 1번 수정
                    isOk = false;
                    break;
                }
                stack.pop();
            }
        }

        if (isOk && stack.isEmpty()) bw.write("Yes");
        else bw.write("No");
        bw.flush();
        bw.close();
    }
}