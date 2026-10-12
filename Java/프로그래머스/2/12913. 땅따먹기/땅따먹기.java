// 그리디 방식이 최고점을 보장하지 않음, 완탐은 N이 10^6이므로 시간초과
// 현재 칸은 이전 칸에 영향을 받음현재의 최고점은, 이전 행칸을 제외한 최고점
import java.util.*;

class Solution {
    int solution(int[][] land) {
        
        int h = land.length;
        
        // 해당 열을 제외한 행의 누적 최고 점수
        int dp[][] = new int[h][4];
        
        //dp 초기화
        for(int i=0;i<4;i++){
            dp[0][i] = land[0][i];
        }
            
        
        for(int y=1;y<h;y++){
            dp[y][0] += land[y][0] + Math.max(dp[y-1][1], Math.max(dp[y-1][2],dp[y-1][3]) );
            dp[y][1] += land[y][1] + Math.max(dp[y-1][0], Math.max(dp[y-1][2],dp[y-1][3]) );
            dp[y][2] += land[y][2] + Math.max(dp[y-1][0], Math.max(dp[y-1][1],dp[y-1][3]) );
            dp[y][3] += land[y][3] + Math.max(dp[y-1][0], Math.max(dp[y-1][1],dp[y-1][2]) );
        }
        

        int answer = Math.max(dp[h-1][0], Math.max(dp[h-1][1], Math.max(dp[h-1][2],dp[h-1][3])));

        return answer;
    }
}