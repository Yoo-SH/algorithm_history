import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        int n = numbers.length;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0}); // {현재 합, 사용한 숫자 개수}
        int count = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int sum = cur[0], depth = cur[1];

            if (depth == n) {
                if (sum == target) count++;
                continue;
            }
            queue.offer(new int[]{sum + numbers[depth], depth + 1});
            queue.offer(new int[]{sum - numbers[depth], depth + 1});
        }
        return count;
    }
}