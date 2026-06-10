import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        for (char c: input.toCharArray()){
            if (Character.isLetter(c)) sb.append(Character.toLowerCase(c));
            else if (Character.isDigit(c)) sb.append(c);
        }

        bw.write(sb.toString());
        bw.close();
    }
}