
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char [] result = str.toCharArray();
        char token1 = result[0];
        char token2 = result[1];

        for (int i =0;i<result.length;i++){
            if (result[i] == token2){
                result[i] = token1;
            }
        }

        bw.write(result);
        bw.close();
    }
}
