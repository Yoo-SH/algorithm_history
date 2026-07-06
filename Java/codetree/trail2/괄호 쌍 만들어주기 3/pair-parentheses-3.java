import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static final int  INT_MIN = Integer.MIN_VALUE;
    static final int  INT_MAX = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        String A = br.readLine();
        int count =0;
        for(int i=0;i<A.length();i++){
            for(int j=i;j<A.length();j++)
                if(A.charAt(i) == '(' && A.charAt(j) == ')') {
                    count++;
                }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}