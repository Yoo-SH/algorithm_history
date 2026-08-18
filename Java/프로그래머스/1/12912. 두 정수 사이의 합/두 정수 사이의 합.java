class Solution {
    public long solution(int a, int b) {
        long start = Math.min(a, b);
        long end = Math.max(a, b);
        long result = 0;
        for(long i=start;i<=end;i++){
            result +=i;
        }
        return result;
    }
}

