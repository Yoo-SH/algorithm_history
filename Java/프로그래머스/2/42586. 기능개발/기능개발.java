import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        if(speeds.length ==1) return new int[]{1};
        
        int len = progresses.length;
        int [] deploy = new int[len];
        
        for(int i=0;i<len;i++){
            int remainProgress = 100 - progresses[i];
            int speed = speeds[i];
            deploy[i] = (int) Math.ceil((double)remainProgress/speed);
        }
        
        int count =1;
        int prev = deploy[0];
        List<Integer> result = new ArrayList<>();
        
        for(int i=1;i<deploy.length;i++){
            if(deploy[i] <= prev) count++;
            else {
                prev = deploy[i];
                result.add(count);
                count = 1;
            }
            
            if(i== deploy.length - 1) result.add(count);
        }
        
    
        
        int answer [] = new int[result.size()];
        
        for(int i=0;i<result.size();i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}