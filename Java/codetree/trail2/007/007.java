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

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = st.nextToken();
        String a = st.nextToken();
        int t = Integer.parseInt(st.nextToken());
        Object ob = new Object(s,a,t);

        sb.append(String.format("secret code : %s\n",ob.secreteCode)).append(String.format("meeting point : %s\n",ob.area)).append(String.format("time : %d\n",ob.time));
        bw.write(sb.toString());
        bw.close();
    }
}

class Object{
    String secreteCode;
    String area;
    int time;

    Object(String s, String a, int t){
        this.secreteCode = s;
        this.area = a;
        this.time = t;
    }
}

