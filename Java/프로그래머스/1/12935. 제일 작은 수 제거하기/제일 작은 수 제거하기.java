import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};

        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int a : arr) {
            list.add(a);
            min = Math.min(min, a);
        }

        list.remove(Integer.valueOf(min));

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}