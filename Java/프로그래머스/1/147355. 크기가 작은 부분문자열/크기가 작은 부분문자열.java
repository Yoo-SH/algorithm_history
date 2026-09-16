import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int count =0;
        
        for(int i=0;i<t.length()-p.length()+1;i++){
            if (t.substring(i, i + p.length()).compareTo(p) <= 0) count++;
        }
        

        return count;
    }
}