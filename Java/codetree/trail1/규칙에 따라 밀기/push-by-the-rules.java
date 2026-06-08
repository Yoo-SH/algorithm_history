
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
        String command = br.readLine();
        char [] commandArr = command.toCharArray();
        int strLen = str.length();

        for (int i =0; i<commandArr.length;i++){
            if (commandArr[i] == 'L'){
                str =  str.substring(1) + str.substring(0,1);
            } else if (commandArr[i] == 'R') {
                str = str.substring(strLen-1,strLen) + str.substring(0,strLen-1) ;
            }

        }
        bw.write(str);
        bw.close();
    }
}
