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
        String A = br.readLine();
        String B = br.readLine();

        char [] charsA = A.toCharArray();
        char [] charsB = B.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        if (Arrays.equals(charsA,charsB)) bw.write("Yes");
        else bw.write("No");

        bw.close();
    }
}

