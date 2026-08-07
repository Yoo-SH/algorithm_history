import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashSet;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> treeSet = new TreeSet<>();


        for(int i =0; i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "add":{
                    int n = Integer.parseInt(st.nextToken());
                    treeSet.add(n);
                    break;
                }
                case "remove":{
                    int n = Integer.parseInt(st.nextToken());
                    treeSet.remove(n);
                    break;
                }
                case "find": {
                    int n = Integer.parseInt(st.nextToken());
                    sb.append(treeSet.contains(n) ? "true" : "false").append("\n");
                    break;
                }
                case "lower_bound": {
                    int n = Integer.parseInt(st.nextToken());
                    Integer res = treeSet.ceiling(n);   // x 이상 최초
                    sb.append(res == null ? "None" : res).append("\n");
                    break;
                }
                case "upper_bound": {
                    int n = Integer.parseInt(st.nextToken());
                    Integer res = treeSet.higher(n);    // x 초과 최초
                    sb.append(res == null ? "None" : res).append("\n");
                    break;
                }
                case "largest": {
                    sb.append(treeSet.isEmpty() ? "None" : treeSet.last()).append("\n");
                    break;
                }
                case "smallest": {
                    sb.append(treeSet.isEmpty() ? "None" : treeSet.first()).append("\n");
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}