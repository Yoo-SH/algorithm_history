import java.util.*;

// s의길이는 10^4
// 완전 탐색을 하면 시간 초과 발생할듯
// 탐색하면서 map에 최신 인덱스 위치를 저장하고 차이를 결과 배열에 저장
class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int idx = map.get(c);
                result[i] = i-idx;
            }else{
                result[i] = -1;
            }
            map.put(c,i);
        }
        
        
        
        return result;
    }
}