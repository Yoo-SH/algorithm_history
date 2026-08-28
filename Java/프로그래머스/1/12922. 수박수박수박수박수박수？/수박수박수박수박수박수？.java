import java.util.*;

class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int count =0;
    
        while(n>count){
            if(count % 2 != 0) sb.append('박');
            else sb.append('수');
            count++;
        }
        

        return sb.toString();
    }
}