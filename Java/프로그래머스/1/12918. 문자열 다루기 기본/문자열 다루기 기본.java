

class Solution {
    public boolean solution(String s) {
        boolean isOk = true;
        
        for(int i=0;i<s.length();i++){
            if (!('0' <= s.charAt(i) && s.charAt(i) <= '9') ) {
                isOk = false;
                break;
            }
        }
        
        if(4 != s.length() && s.length() != 6) isOk = false;
    
        return isOk;
    }
}