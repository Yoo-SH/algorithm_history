import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "add":{
                    int k = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
                    treeMap.put(k,v);
                    break;
                }
                case "remove":{
                    int k = Integer.parseInt(st.nextToken());
                        treeMap.remove(k);
                    break;
                }
                case "find":{
                    int k = Integer.parseInt(st.nextToken());
                    if(treeMap.containsKey(k)){
                        bw.write(String.valueOf(treeMap.get(k)));
                    }
                    else{
                        bw.write("None");
                    }
                    bw.newLine();
                    break;
                }
                case "print_list":{
                    if (treeMap.isEmpty()){
                        bw.write("None");
                        bw.newLine();
                    }
                    else{
                        for(Map.Entry<Integer, Integer> e : treeMap.entrySet()){
                            bw.write(String.valueOf(e.getValue())+" ");
                        }
                        bw.newLine();
                    }
                    break;
                }

            }

        }
        bw.flush();
        bw.close();
        br.close();

    }
}