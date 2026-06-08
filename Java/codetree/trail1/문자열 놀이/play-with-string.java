
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
        StringTokenizer st = new StringTokenizer(br.readLine());

         String str = st.nextToken();
         int num = Integer.parseInt(st.nextToken());
         char [] arr = str.toCharArray();


        for (int i=0;i<num;i++){
             st = new StringTokenizer(br.readLine());
             int type = Integer.parseInt(st.nextToken());

             if (type == 1){

                 //a번째 문자와 b번째 문자를 교환한
                 int a = Integer.parseInt(st.nextToken());
                 int b = Integer.parseInt(st.nextToken());

                 char temp = arr[b-1];
                 arr[b-1] = arr[a-1];
                 arr[a-1] = temp;

                 bw.write(new String(arr) + "\n");

             } else if (type == 2){

                 // 문자 x를 전부 y로 변경하여
                 char x = st.nextToken().charAt(0);
                 char y = st.nextToken().charAt(0);

                 for(int j= 0;j<arr.length;j++){
                     if (arr[j] == x){
                         arr[j] = y;
                     }
                 }

                 bw.write(new String(arr) + "\n");
             }
         }


        bw.close();
    }
}
