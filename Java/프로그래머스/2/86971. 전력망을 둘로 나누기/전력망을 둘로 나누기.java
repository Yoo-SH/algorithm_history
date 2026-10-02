// 일단은 탐색은 BFS 아니면 DFS로 갑니다.
// 중요한 것은 연결을 하나씩 끊어서 개수 차이가 가장 적은 것을 선 한개 잘라야함
// 자르고 탐색하며 카운팅하기에는 너무 비용 소모가 많이 들거같은데, 좋은 방법 없나? 
// 모든 경우의 수는 n-1번. 99변 BFS 탐색 가자..

import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int minResult = Integer.MAX_VALUE;
        
        //하나씩 커팅함.
        for(int[] cutWire : wires){
            List<Integer>[] graph = new ArrayList[n+1];
            Queue<Integer> queue = new ArrayDeque<>();
            boolean [] visited = new boolean[n+1];
            
            for(int i=1;i<n+1;i++){
                graph[i] = new ArrayList<>();
            }
        
            //커팅된 선을 제외한 그래프 초기화
            for(int i=0;i<wires.length;i++){
                if(wires[i] == cutWire) continue;
                int from = wires[i][0];
                int to = wires[i][1];
                
                graph[from].add(to);
                graph[to].add(from);
            }

            //BFS탐색(노드 2개를 기준으로 분리되어있음)
            int node1 = cutWire[0];
            int node2 = cutWire[1];
            
            // 첫번쨰 탐색
            queue.offer(node1);
            visited[node1] = true;
            int count1 = 1;
            while(!queue.isEmpty()){
                int cur = queue.poll();
                
                for(int next : graph[cur]){
                    if(visited[next]) continue;
                    visited[next] = true;
                    count1++;
                    queue.offer(next);
                }
            }
            
            // 두번째 탐색
            int count2 = 1;
            queue.offer(node2);
            visited[node2] = true;
            while(!queue.isEmpty()){
                int cur = queue.poll();
                
                for(int next : graph[cur]){
                    if(visited[next]) continue;
                    visited[next] = true;
                    count2++;
                    queue.offer(next);
                }
            }
            
            minResult = Math.min(minResult, Math.abs(count1-count2));    
        }
        
        
        return minResult;
    }
}