import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

// 모든 입력값 <= 10^9
// 7!의 경우의 수로 3000ms 가능할것.
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_back": {
                    int number = Integer.parseInt(st.nextToken());
                    list.add(number);
                    break;
                }
                case "get": {
                    int number = Integer.parseInt(st.nextToken());
                    bw.write(String.valueOf(list.get(number - 1))+"\n");
                    bw.flush();
                    break;
                }
                case "size": {
                    bw.write(String.valueOf(list.size())+"\n");
                    bw.flush();
                    break;
                }
                case "pop_back": {
                    list.remove(list.size() - 1);
                    break;
                }
            }
        }

        bw.close();

    }
}