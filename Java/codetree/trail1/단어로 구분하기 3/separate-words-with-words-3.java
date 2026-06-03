
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = st.countTokens();
        String [] strArr = new String [N];

        for(int i=0; i<N;i++){
            strArr[i] = st.nextToken();
        }
        
        for (int i=N-1;i>=0;i--){
            bw.write(strArr[i]+"\n");
        }

        bw.close();
    }
}
