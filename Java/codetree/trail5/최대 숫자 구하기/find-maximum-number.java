import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        TreeSet<Integer> treeSet = new TreeSet<>();

        // treeSet 초기화
        for(int i =1;i<=M;i++){
            treeSet.add(i);
        }

        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int m = Integer.parseInt(st.nextToken());
            if(treeSet.contains(m)) treeSet.remove(m);
            if(treeSet.last() != null ) sb.append(treeSet.last()).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();





    }
}

