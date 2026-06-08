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
        int countEe = 0;
        int countEb = 0;

        for (int i =0; i<str.length()-1;i++){
            if (str.substring(i,i+2).equals("ee")){
                countEe +=1;
            } else if (str.substring(i,i+2).equals("eb")) {
                countEb +=1;
            }
        }

        bw.write(String.format("%d %d",countEe, countEb));
        bw.close();

    }
}
