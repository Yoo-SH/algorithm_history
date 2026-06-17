import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isTwoMoreAlpha(String str) throws IOException{
        char c = str.charAt(0);

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != c) return true;
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        String input = br.readLine();

        if(isTwoMoreAlpha(input)) bw.write("Yes");
        else bw.write("No");

        bw.close();
    }
}

