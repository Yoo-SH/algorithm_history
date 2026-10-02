//걍 BFS로 탐색하면 될듯? 제한 시간 무리 없음.
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        
        // 그래프 초기화
        ArrayDeque<Integer>[] graph = new ArrayDeque[n+1];
        for(int i=1;i<n+1;i++){
            graph[i] = new ArrayDeque<>();
        }
        //그래프 선 연결
        for(int y=0;y<computers.length;y++){
            for(int x=0;x<computers[y].length;x++){
                if(computers[y][x] == 1 && y != x){
                    int from = y+1, to =x+1;
                    graph[from].add(to);
                }
            }
        }
        
        //BFS탐색
        boolean visited [] = new boolean[n+1];
        Queue<Integer> queue = new ArrayDeque<>();
        int count =0;
        
        for(int start = 1; start<n+1;start++){
            if(visited[start]) continue;
            
            queue.offer(start);
            visited[start] = true;
            
            while(!queue.isEmpty()){
                int cur = queue.poll();
                
                for(int next : graph[cur]){
                    if(visited[next]) continue;
                    
                    visited[next] = true;
                    queue.offer(next);
                }
            }
            count++;
        }
        

        return count; 
    }
    
}
    