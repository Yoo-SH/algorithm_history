import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int idx = 0;
        while(st.hasMoreTokens()){
            String input = st.nextToken();
            if(idx % 2 == 0){
                bw.write(input+"\n");
            }
            idx++;
        }

        bw.close();
    }
}
