// 음 그냥 이거는 시물레이션 방식으로 하면 될거같은데
// 여벌옷 가진사람이 뒤,앞을 순차적으로 탐색하며 없는 사람에게 주면 될듯(그리디하게)

import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //lost 정렬
        Arrays.sort(lost);
        
        // 결과값은 걍 전체 n에서 lost의 길이를 빼는게 편할듯
        HashSet<Integer> reserveSet = new HashSet<>();
        for(int r : reserve) reserveSet.add(r);
        List<Integer> lostList = new ArrayList<>();
        for(int l : lost) lostList.add(l);
        
        
        // 여벌옷 있는 사람이 도난 당하면 빌려줄 수 없으니 먼저 배분
        for(int l : lost){
            // 나에게 여벌 옷이 있다면
            if(reserveSet.contains(l)) {
                reserveSet.remove(l);
                lostList.remove(Integer.valueOf(l));
            }
        }
        
        
        // 나에게 여벌옷이 없다면 앞 뒤 사람에게 빌림
        int lostCount = lostList.size();
        for(int l : lostList){
            
            //뒷 사람에게 여벌 옷이 있다면
            if(reserveSet.contains(l-1)){
                reserveSet.remove(l-1);
                lostCount--;
                continue;
            }
            
            // 앞 사람에게 여벌 옷이 있다면
            if(reserveSet.contains(l+1)){
                reserveSet.remove(l+1);
                lostCount--;
                continue;
            }
        }
        
        return n-lostCount;
    }
}