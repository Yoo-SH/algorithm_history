// 무인도 사람은 최대 5*10^4
// 몸무게 최대 240
// 무게 제한 240

// 완전탐색하면 최악의 경우, 시간초과 날거같음
// 정렬해서 작은 순으로 뽑아가면서 하면 되지 않을까? -> 최대 2명만 탈 수 있음.
// 그러면 최대한 뽕 뽑으려면 limit와 가까운 사람 2개 조합으로 가야할텐데.?
// 그러면 가장 작은사람과 무거운 사람 2명 뽑고 이게 다 가능하다면 다 뽑을 수 있고, 아니라면 무게를 줄여보는 식으로 한 다음에, 무게가 무거운 사람만 따로 보내야겠네. 
// 아 그러면 이거는 투 포인터네
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        
        Arrays.sort(people);
        int left = 0, right = people.length - 1;
        int count = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            count++;
        }
        
        return count;
    }
}