import java.util.*;

// 그리디 방식으로 A최소값으로 오름차순 정렬, B최대값으로 내림차순 정렬을 각각 곱하면 최쇠가 될듯?
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer =0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<A.length;i++){
            answer += A[i]*B[B.length-i-1];
        }
        

        return answer;
    }
}