// phone_book의 길이가 최대 10^6이므로 완탐은 시간초과 발생
//A가 B의 접두사라면 A로 시작하는 문자열들은 사전순에서 B 바로 뒤에 연속으로 몰림
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book); //사전 순 정렬
        for(int i=1;i<phone_book.length;i++){
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }
        
        
        
    
        return true;
    }
}