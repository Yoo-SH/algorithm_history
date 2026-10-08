import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 두 배열에 흩어져 있는 그리움 점수를 map에 저장
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0;i<name.length;i++){
            hashMap.put(name[i],yearning[i]);
        }
        
        int [] result = new int[photo.length];
        // photo 점수 계산
        for(int i=0;i<photo.length;i++){
            String [] p = photo[i];
            for(int j=0;j<p.length;j++){
                result[i] += hashMap.getOrDefault(p[j],0);
            }
        }
            
     
        return result;
    }
}