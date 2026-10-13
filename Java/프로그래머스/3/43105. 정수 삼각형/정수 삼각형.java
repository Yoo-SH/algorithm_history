// 거쳐간 숫자의 최댓값이니, 현재 값은 이전 값들에 영향을 받음
// 현재 칸은 이전 값들의 최대 합에 현재값을 더한것
// 그리디 방식은 성립하지 않음 + 완전탐색은 시간 초과
import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;

        // 현재 행의 최대 누적 점수
        int dp[][] = new int[h][];
        for(int i=0;i<h;i++){
            dp[i] = new int[i+1];
        }
        dp[0][0] = triangle[0][0]; 
        
    
        // 현재행은 
        for(int y=1;y<h;y++){
            for(int x=0;x<triangle[y].length;x++){
                if(x == 0){
                    dp[y][x] = triangle[y][x] + dp[y-1][x];
                }
                else if(x == triangle[y].length -1){
                    dp[y][x] = triangle[y][x] + dp[y-1][x-1];
                }
                else{
                    dp[y][x] = triangle[y][x] + Math.max( dp[y-1][x], dp[y-1][x-1]);
                }
            }
        }
        
        int result = 0;
        for (int v : dp[h-1]) result = Math.max(result, v);
        return result;
    }
}