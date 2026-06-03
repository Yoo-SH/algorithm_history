
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        String [] arr = new String[10];
        int count = 0;

        for (int i=0; i<10;i++){
            arr[i] = br.readLine().trim();
        }

        char ch = br.readLine().trim().charAt(0);

        for (int i=0; i<10;i++){
            if (arr[i].charAt(arr[i].length()-1) == ch){
                bw.write(arr[i]+"\n");
                count +=1;
            }
        }

        if (count ==0){
            bw.write("None");
        }

        bw.close();
    }
}
