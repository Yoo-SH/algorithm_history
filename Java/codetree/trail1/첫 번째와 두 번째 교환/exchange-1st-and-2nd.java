
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
        char[] arr = str.toCharArray();

        char token1 = arr[0];
        char token2 = arr[1];

        for(int i =0;i<arr.length;i++){
            if (arr[i] == token1){
                arr[i] = token2;
            } else if (arr[i] == token2) {
                arr[i] = token1;
            }
        }

        bw.write(new String(arr));
        bw.close();
    }
}
