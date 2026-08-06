import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> hashSet = new HashSet<>();

        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command  = st.nextToken();

            switch (command){
                case "add":{
                    int a  = Integer.parseInt(st.nextToken());
                    hashSet.add(a);
                    break;
                }
                case "remove":{
                    int a  = Integer.parseInt(st.nextToken());
                    hashSet.remove(a);
                    break;
                }
                case "find":{
                    int a  = Integer.parseInt(st.nextToken());
                    if(hashSet.contains(a)){
                        bw.write("true");
                    }
                    else{
                        bw.write("false");
                    }
                    bw.newLine();
                    break;
                }
            }
        }
        bw.close();
        bw.close();
        br.close();
    }
}