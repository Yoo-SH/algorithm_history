// sticker의 길이는 10^6 이므로 완탐은 시간 초과
// 높은 숫자만큼 뺴는 그리디 방식으로는 더 큰 수를 뽑지 못하는 경우가 발생하기 떄문에 그리디 x
// 최고값을 구할 때 이전 최고값에서 현재값을 더한 DP방식인거 같음
class Solution {
    public int solution(int sticker[]) {
        int len = sticker.length;

        // 엣지 케이스: dp[1] 접근 전에 처리
        if (len == 1) return sticker[0];

        // 경우 1: 첫 번째 스티커를 뜯음 → 마지막 스티커는 사용 불가
        int[] dp1 = new int[len];
        dp1[0] = sticker[0];
        dp1[1] = sticker[0];
        for (int i = 2; i < len - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + sticker[i]);
        }

        // 경우 2: 첫 번째 스티커를 안 뜯음 → 마지막 스티커까지 사용 가능
        int[] dp2 = new int[len];
        dp2[0] = 0;
        dp2[1] = sticker[1];
        for (int i = 2; i < len; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + sticker[i]);
        }

        return Math.max(dp1[len - 2], dp2[len - 1]);
    }
}