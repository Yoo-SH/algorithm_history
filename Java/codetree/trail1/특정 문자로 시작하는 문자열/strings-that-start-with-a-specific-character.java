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
        int N = Integer.parseInt(br.readLine());
        String [] arr = new String[N];

        for(int i =0; i<N; i++){
            arr[i] = br.readLine();
        }

        char ch = br.readLine().charAt(0);
        int count = 0;
        int sum = 0;

        for(int i =0; i<N; i++){
                if (arr[i].charAt(0) == ch){
                    count +=1;
                    sum += arr[i].length();
                }
            }

        bw.write(String.format("%d %.2f",count, (double)sum/count));

        bw.close();
    }
}
