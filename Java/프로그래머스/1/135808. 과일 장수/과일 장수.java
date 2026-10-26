import java.util.*;

// 곱하기하므로 낮은것끼리, 높은것끼리 묵어야 최대 점수가 나옴
class Solution{
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score); // 오름차순

        int result = 0;
        // i는 상자의 시작 인덱스. [i, i+m-1]이 한 상자, 최저 점수는 score[i]
        for (int i = score.length - m; i >= 0; i -= m) {
            result += score[i] * m;
        }
        return result;
    }
}
