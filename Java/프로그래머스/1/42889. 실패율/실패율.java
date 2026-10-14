// stages의 길이는 최대 2 * 10^5 
// priorityQueue와 Map을 이용하면 편하게 계산가능할듯

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<double[]> result = new ArrayList<>(); // [level,실패율]
        
        for(int i=0;i<stages.length;i++){
            pq.add(stages[i]);
        }
        
        //레벨별로 실패율을 저장함.
        int remains = stages.length;
        for(int level = 1;level<=N;level++){
            int count =0;
            while(!pq.isEmpty() && pq.peek() == level){
                int num = pq.poll();
                count++;
            }
            if(remains == 0) {
                result.add(new double[]{level,(0)});
            }
            else{
                result.add(new double[]{level,((double) count/remains)});
            };   
            remains-=count;
        }
        
        
        result.sort((a,b) -> Double.compare(b[1],a[1]));
        int [] answer = new int[N];
        for (int i = 0; i < N; i++) answer[i] = (int) result.get(i)[0];
        
        
        return answer;
    }
}