// 선수 최대 10^6
// 완탐하면 시간 초과

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String,Integer> map = new HashMap<>();
        for(String p : participant){
            if(map.containsKey(p)){
                int num = map.get(p);
                map.put(p,num+1);
            }
            else{
                map.put(p,1);
            }
        }
        
        for(String p : completion){
            if(map.getOrDefault(p,0) >= 1){ //한번이라도 참여했다면
                map.put(p,map.get(p)-1); // 참여 횟수 한번 뺴줌
            }
        }
        
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) return entry.getKey();
        }
        
        return " ";
    }
}