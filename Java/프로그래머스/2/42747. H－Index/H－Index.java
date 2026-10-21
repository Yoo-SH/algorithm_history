// 정렬하고 완탐해도 될거같은데?
// 10^4 * 10^3 이니까 최악의 경우 10^7
// 그리고 이분 탐색하면 탐색 시간을 더 줄일 수 있을듯?
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        
        Arrays.sort(citations);
        
        
        for(int h=citations[citations.length-1]; h>=0;h--){
            int count =0;
            for(int i=0;i<citations.length;i++){
                if(citations[i] >=h) count++;
            }
            
            if(count >=h) return h;        
        }
        
        return 0;
    }
}