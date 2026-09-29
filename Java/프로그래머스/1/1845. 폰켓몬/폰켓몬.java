// nums.length가 최대 10^4, 선택하는 개수는 최대 2*10^3, num의 원소는 최대 10^5
// 어차피 중복된 숫자는 인정 안 해주니까 set으로 중복 날려서 뽑을 수 있는 경우의 수 카운트 하면 될듯?
// 그리고 중복 제거된 Set()의 크기가 선택하는 개수보다 크게나 작은지에 따라 결과가 달라질 듯.
import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        
        HashSet<Integer> hashSet = new HashSet<>();
        int selectNum = nums.length/2; // nums.length는 항상 짝수
        
        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(nums[i])) hashSet.add(nums[i]);
        }
        
        if(selectNum <= hashSet.size()){
            return selectNum;
        }
        else{
            return hashSet.size();
        }
        
        
    }
}

