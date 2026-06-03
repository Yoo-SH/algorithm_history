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
        String [] fruit = {"apple", "banana", "grape", "blueberry", "orange"};
        char s = br.readLine().charAt(0);
        int count = 0;

        for (int i=0 ; i<5;i++){
            {
                if (fruit[i].charAt(2) == s || fruit[i].charAt(3) == s){
                    bw.write(fruit[i]+"\n");
                    count+=1;
                }
            }
        }
        bw.write(String.format("%d",count));
        bw.close();
    }
}
