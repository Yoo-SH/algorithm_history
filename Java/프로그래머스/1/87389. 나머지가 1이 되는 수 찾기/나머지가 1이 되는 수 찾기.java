class Solution {
    public int solution(int n) {

        for(int x=2;x<=1000000;x++){
            if(n % x == 1) return x;
        }
    
        return 3;
    }
}