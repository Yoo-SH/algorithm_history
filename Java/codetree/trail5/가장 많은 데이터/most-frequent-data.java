import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.Map;
import java.util.StringTokenizer;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String,Integer> hashMap = new HashMap<>();

        // hashMap에 횟수를 저장
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String k = br.readLine().trim();
            hashMap.put(k,hashMap.getOrDefault(k,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> e : hashMap.entrySet()){
            int value = e.getValue();
            if(value > max) max = value;
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}