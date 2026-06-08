
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
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int num  = Integer.parseInt(st.nextToken());
        int strLen = str.length();

        for(int i =0; i<num;i++){
            char commandNum = br.readLine().charAt(0);

            if (commandNum == '1'){
                str = str.substring(1) + str.substring(0,1);
                bw.write(str + "\n");
            } else if (commandNum == '2') {
                str = str.substring(strLen-1) + str.substring(0,strLen-1);
                bw.write(str + "\n");
            } else if (commandNum == '3'){
                str = new StringBuilder(str).reverse().toString();
                bw.write(str + "\n");
            }
        }

        bw.close();
    }
}