// DFS로 탐색하면서 갈 수 있는 무인도 카운팅 및 계ㅅ산
import java.util.*;
import java.io.*;

class Solution {
    
    // 상하좌우 탐색
    static int [] dy = new int[]{-1,1,0,0};
    static int [] dx = new int[]{0,0,-1,1};
    static Deque<int[]> stack = new ArrayDeque<>();
    static boolean [][] visited;
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    
    public int[] solution(String[] maps) {
        
        // string map을 int map으로 전처리
        int w = maps[0].length();
        int h = maps.length;
        int [][] matrix = new int[h][w];
        for(int y=0;y<h;y++){
            for(int x=0;x<w;x++){
                if(maps[y].charAt(x) == 'X') matrix[y][x] = 0;
                else matrix[y][x] = maps[y].charAt(x) - '0';
            }
        }
        
        // visited 초기화
        visited = new boolean[h][w];
        
        // 시작 지점이 섬인 곳에서 DFS 탐색
        for(int y=0;y<h;y++){
            for(int x=0;x<w;x++){
                if(matrix[y][x] != 0 && !visited[y][x]){
                    
                    // DFS 탐색을 위한 시작 지점 처리
                    stack.push(new int[]{y,x});
                    visited[y][x] = true;
                    int sum = matrix[y][x];
                    
                    //DFS 탐색
                    while(!stack.isEmpty()){
                        int [] pos = stack.pop();
                        int cy = pos[0], cx = pos[1];
                        
                        // 상하좌우 탐색
                        for(int i=0;i<4;i++){
                            int ny = cy + dy[i], nx = cx + dx[i];
                           
                            // 비탐색 조건
                            if(!((0<=ny && ny <h) && (0<=nx && nx<w))) continue; 
                            if(visited[ny][nx] || matrix[ny][nx] == 0) continue;
                            
                            visited[ny][nx] = true;
                            sum += matrix[ny][nx];
                            stack.push(new int[]{ny,nx});
                        }
                    }
                    
                    pq.add(sum);
                }
            }
        }
                
        
        if(pq.isEmpty()){
            return new int[]{-1};
        }
        else{
            int len =pq.size();
            int[] answer = new int[len];
            
            for(int i=0;i<len;i++){
                answer[i] = pq.poll();
            }
            
            return answer;
        }
    }
}