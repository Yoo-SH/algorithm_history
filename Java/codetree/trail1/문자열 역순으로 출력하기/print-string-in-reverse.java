
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
        String [] strArr = new String [4];
        for (int i = 0; i<4;i++){
            strArr[i] = br.readLine();
        }

        for (int i=3 ; i>=0;i--){
            bw.write(strArr[i]+"\n");
        }

        bw.close();
    }
}
