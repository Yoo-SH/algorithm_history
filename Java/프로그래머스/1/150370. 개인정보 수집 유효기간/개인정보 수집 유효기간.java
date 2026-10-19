import java.util.*;

// 적절한 자료구조를 활용하여 푸는 시물레이션 문제
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        //모든 개월이 28일 이므로, 최소 단위인 '일'로 쪼개서 유효기간 지났는지 검사만 하면 될듯
        List<Integer> list = new ArrayList<>();
        int tYear = Integer.parseInt(today.split("\\.")[0]);
        int tMonth = Integer.parseInt(today.split("\\.")[1]);
        int tDay = Integer.parseInt(today.split("\\.")[2]);
        int tSum = tYear * 12 * 28 + tMonth * 28 + tDay;
        
        //약관 타입별로 만료일 기간 저장
        HashMap<String,Integer> map = new HashMap<>();
        for(String term : terms){
            String type = term.split(" ")[0];
            int date = Integer.parseInt(term.split(" ")[1]);
            map.put(type,date);
        }
        
        

        for(int i=0;i<privacies.length;i++){
            
            String privacy = privacies[i];
            String time = privacy.split(" ")[0];
            String type = privacy.split(" ")[1];
            
            int year = Integer.parseInt(time.split("\\.")[0]);
            int month = Integer.parseInt(time.split("\\.")[1]);
            int day = Integer.parseInt(time.split("\\.")[2]);
            int sum = year * 12 * 28 + month * 28 + day + map.get(type) * 28;
        
            if(sum <= tSum) list.add(i+1);
        }
        
        int len = list.size();
        int [] result = new int[len];
        for(int i=0;i<len;i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}