
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
        int N = Integer.parseInt(br.readLine());
        int len =0;
        int aCount =0;

        for(int i=0;i<N;i++){
            String input = br.readLine().trim();
            if(input.charAt(0) == 'a'){
                aCount +=1;
            }
            len += input.length();
        }

        bw.write(String.format("%d %d",len,aCount));
        bw.close();
    }
}
