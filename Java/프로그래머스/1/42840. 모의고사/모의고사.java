//수포자가 3명이고, answer은 10,000이니 완전 탐색 진행
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int [] P1 = new int[]{1,2,3,4,5};
        int [] P2 = new int[]{2,1,2,3,2,4,2,5};
        int [] P3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        int countP1 = 0, countP2 = 0, countP3 =0;
        int idxP1 = 0, idxP2 = 0, idxP3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (P1[i % P1.length] == answers[i]) countP1++;
            if (P2[i % P2.length] == answers[i]) countP2++;
            if (P3[i % P3.length] == answers[i]) countP3++;
        }
        
        int maxCount = Math.max(countP3, Math.max(countP1,countP2));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        if(maxCount == countP1) pq.offer(1);
        if(maxCount == countP2) pq.offer(2);
        if(maxCount == countP3) pq.offer(3);
        
        int[] result = new int[pq.size()];
        for (int i = 0; i < result.length; i++)
                result[i] = pq.poll();

        return result;
    }
}