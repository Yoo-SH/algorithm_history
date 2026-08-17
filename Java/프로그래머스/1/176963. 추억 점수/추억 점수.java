import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        // 이름과 가치를 매핑함
        HashMap<String,Integer> hashMap = new HashMap<>();
        for(int i=0;i<name.length;i++){
            hashMap.put(name[i],yearning[i]);
        }
        
        //
        int [] result = new int [photo.length];
        
        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++)
            {
                result[i] += hashMap.getOrDefault(photo[i][j],0);
            }
        }
            

        return result;
    }
}