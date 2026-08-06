import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.TreeMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String str = br.readLine().trim();
            treeMap.put(str,treeMap.getOrDefault(str,0) +1);
        }

        for(Map.Entry<String,Integer> e : treeMap.entrySet()){
            bw.write(String.format("%s %.4f",e.getKey(), (double) e.getValue()/N * 100));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}