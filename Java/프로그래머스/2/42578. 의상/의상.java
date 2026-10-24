import java.util.*;
// 가능한 의상의 조합수
// 조합 -> 백트래킹을 통해 적어도 1개 이상 구하면 
// 아 근데 이거는 차라리 모든 경우의 수에서 아무것도 안 뽑는 경우만 뺴면 쉽게 구할거 같은데
// 전체 경우의 수는 종류별로 개수를 구하면 쉽지 않을까? 
class Solution {
    public int solution(String[][] clothes) {
        
        HashMap<String,Integer> map = new HashMap<>(); // type = 개수

        for(String [] cloth : clothes){
            String type = cloth[1];
            int typeNum = map.getOrDefault(type,0);
            map.put(type,typeNum + 1);
        }
        
        int result =1;
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            int typeNum = entry.getValue();
            result *= (typeNum+1);
            System.out.println(typeNum + " " + result);
        }
        
        return result -1;
    }
}