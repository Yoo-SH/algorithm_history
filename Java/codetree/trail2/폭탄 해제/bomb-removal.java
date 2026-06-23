

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
        String code = st.nextToken();
        String color = st.nextToken();
        int second = Integer.parseInt(st.nextToken());

        Bomb obj = new Bomb(code,color,second);
        bw.write(String.format("code : %s\ncolor : %s\nsecond : %d",obj.code,obj.color,obj.second));

        bw.close();

    }
}


class Bomb{
    String code;
    String color;
    int second;


    Bomb(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

