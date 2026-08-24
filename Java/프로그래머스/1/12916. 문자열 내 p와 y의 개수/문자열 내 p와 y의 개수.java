class Solution {
    boolean solution(String s) {
        int yCount =0;
        int pCount =0;
        
        char [] arr = s.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 'y' || arr[i] == 'Y') yCount++;
            if(arr[i] == 'p' || arr[i] == 'P') pCount++;
        }
        

        return yCount == pCount;
    }
}