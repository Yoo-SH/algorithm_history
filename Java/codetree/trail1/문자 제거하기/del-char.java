
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
        int strLen = str.length();

        for (int i =0;i<strLen-1;i++){
            int idx = Integer.parseInt(br.readLine());
            if (idx >= str.length()-1){
                str =  str.substring(0,str.length()-1);
            } else if (idx == 0) {
                str = str.substring(1);
            } else{
                str = str.substring(0,idx) + str.substring(idx+1);
            }
            bw.write(str+"\n");
        }

        bw.close();
    }
}
