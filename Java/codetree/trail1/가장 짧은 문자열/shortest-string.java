
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
        String st1 = br.readLine();
        String st2 = br.readLine();
        String st3 = br.readLine();

        int maxNum = Math.max(st1.length(),Math.max(st2.length(),st3.length()));
        int minNum = Math.min(st1.length(),Math.min(st2.length(),st3.length()));
        bw.write(String.format("%d",Math.abs(maxNum-minNum)));
        bw.close();
    }
}
