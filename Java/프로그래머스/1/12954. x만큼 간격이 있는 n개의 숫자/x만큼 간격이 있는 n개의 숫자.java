class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long prev =x;
        
        for(int i=0;i<n;i++){
            answer[i] = prev;
            prev += +x;
        }
        return answer;
    }
}