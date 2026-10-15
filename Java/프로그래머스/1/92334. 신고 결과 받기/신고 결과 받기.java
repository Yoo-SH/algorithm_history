// id_list의 길이 최대 10^3, report의 길이 최대 10^5
// 시뮬레이션 방식으로 해도 될거같음 (시간초과를 고려하여 자료구조 선택이 중요할듯)
/***
HashMap<String,HashSet> hashMap = new HashMap<>();
        for(int i=0;i<len;i++){
            hashMap.put("")
        }
***/
//아 걍 id_list의 인덱스번호를 저장하면 개편하겠는데..?
import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        StringTokenizer st;
        int len= id_list.length;
        //id_list의 인덱스 번호를 저장하는 map설정
        HashMap<String, Integer> idxMap = new HashMap<>();   

        for(int i=0;i<len;i++){
            idxMap.put(id_list[i],i);
        }
        HashSet<String> fromToSet = new HashSet<>(Arrays.asList(report)); // 중복 신고 제거
        
        int[] reportedArr = new int[len];
        for (String s : fromToSet) {
            String reported = s.split(" ")[1];
            reportedArr[idxMap.get(reported)]++;          // 수정 2: get() 사용
        }
        
        
        int[] result = new int[len];
        for (String s : fromToSet) {
            String[] p = s.split(" ");
            // 수정 3: 자리 번호가 아니라 신고 횟수와 k를 비교
            if (reportedArr[idxMap.get(p[1])] >= k) result[idxMap.get(p[0])]++;
        }

        
       
        return result;
    }
}