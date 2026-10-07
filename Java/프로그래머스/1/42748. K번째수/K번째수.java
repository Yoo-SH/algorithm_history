import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int[] command : commands) {
            int i = command[0], j = command[1], k = command[2];
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (int n = i - 1; n < j; n++) {
                pq.add(array[n]);
            }

            int result = 0;
            for (int n = 0; n < k; n++) {
                result = pq.poll();
            }
            list.add(result);
}
        
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}