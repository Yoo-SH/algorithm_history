import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        int S =0;

        for(int i=0;i<q;i++){
            st = new StringTokenizer(br.readLine());
            String c = st.nextToken();
            switch(c){
                case "add":{
                    int x = Integer.parseInt(st.nextToken());
                    S |= (1 << x);
                    break;
                }
                case "delete":{
                    int x = Integer.parseInt(st.nextToken());
                    S &= ~(1 << x);
                    break;
                }
                case "print":{
                    int x = Integer.parseInt(st.nextToken());
                    System.out.printf("%d\n", (S >> x) & 1);
                    break;
                }
                case "toggle":{
                    int x = Integer.parseInt(st.nextToken());
                    S ^= (1 << x);
                    break;
                }
                case "clear":{
                    S = 0;
                    break;
                }
            }
        }
        // Please write your code here.
    }
}