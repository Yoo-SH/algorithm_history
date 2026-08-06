import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.HashMap;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            String command = st.nextToken();

            switch(command){
                case "add":{
                    int k = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
                    hashMap.put(k,v);
                    break;
                }
                case "remove":{
                    int k = Integer.parseInt(st.nextToken());
                    hashMap.remove(k);
                    break;
                }
                case "find":{
                    int k = Integer.parseInt(st.nextToken());

                    if(hashMap.containsKey(k)) bw.write(String.valueOf(hashMap.get(k)));
                    else bw.write("None");
                    bw.newLine();
                    bw.flush();
                    break;
                }
            }

        }



   }
}