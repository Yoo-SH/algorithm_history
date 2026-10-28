import java.util.*;
// 시물레이션 방식으로 하면 될듯?
class Solution {
    
    public int convertT(String time){
        return Integer.parseInt(time.split(":")[0]) * 60 + Integer.parseInt(time.split(":")[1]);   
    }
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        int p = convertT(pos);
        int len = convertT(video_len);
        int opS = convertT(op_start);
        int opE = convertT(op_end);
        
        for(String command : commands){
            // 오프닝 구간이라면 
            if(opS <= p && p < opE) p = opE; //자동으로 끝나는 위치로 이동
            
            if(command.equals("next")) p = (p + 10 > len) ? len : p + 10;       
            else if(command.equals("prev")) p = (p - 10 < 0) ? 0 : p -10;
            
            // 오프닝 구간이라면 
            if(opS <= p && p < opE) p = opE; //자동으로 끝나는 위치로 이동

            //System.out.println(p);
                            
        }
        
        String h = String.valueOf(p / 60);
        String m = String.valueOf(p % 60);
        
        if(h.length() == 1) h = "0"+h;
        if(m.length() == 1) m = "0"+m;
        return h+":"+m;
    }
}