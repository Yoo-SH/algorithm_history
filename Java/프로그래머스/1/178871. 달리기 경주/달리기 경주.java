// players의 길이는 최대 50,000 10
// 선수들의 랭킹이 정해져 있음.. 
// list방식이 낫지 않을까?

// calling 10^6
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        // 아 list로 하면 시간초과 하려나
        // List<String> rank = new LinkedList<>();
        // for(String player : players) rank.add(player);
        // for(String call : callings) {
        //     int idx = rank.indexOf(call);    
        // }
        
        TreeMap<String,Integer> rankMap = new TreeMap<>(); // 이름, 랭킹
        for(int i =0;i<players.length;i++){
            rankMap.put(players[i],i);
        }
        
        for(String call : callings){
            int rank = rankMap.get(call);
            
            String prev= players[rank -1];
            players[rank-1] = call;
            players[rank] = prev;
            
            rankMap.put(call,rank-1);
            rankMap.put(prev,rank);
        }
        
    
    
        return players;
    }
}