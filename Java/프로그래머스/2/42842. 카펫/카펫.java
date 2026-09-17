import java.util.*;

// brown < 10^3 이고 yellow <= 10^6
// 아, 어차피 가로 세로는 최대 길이가, 10^3이니, 그거를 완탐해서 브라운이 격자 만들면, 그 안에 노랑색이 들어가는 수가 되는지만 확인하면 되겠구나 
// 2w + 2h - 4 = brown
// 2w + 2h     = brown + 4
// w +  h     = brown/2 + 2      

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown / 2 + 2;                 // w + h
        for (int h = 3; h <= sum / 2; h++) {     // 세로 ≤ 가로
            int w = sum - h;
            if ((w - 2) * (h - 2) == yellow) return new int[]{w, h};
        }
        return new int[]{-1, -1};
    }
}

