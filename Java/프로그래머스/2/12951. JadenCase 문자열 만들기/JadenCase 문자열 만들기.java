import java.util.*;

class Solution {
    public String solution(String input) {
        StringBuilder sb = new StringBuilder();
        String [] str = input.split(" ",-1);
        
        //첫 글자는 대문자로, 나머지는 소문자로
        for(String s : str){
            if(!s.isEmpty()){
                sb.append(Character.toUpperCase(s.charAt(0)));
                sb.append(s.substring(1,s.length()).toLowerCase());
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        
        
        return sb.toString();
    }
}