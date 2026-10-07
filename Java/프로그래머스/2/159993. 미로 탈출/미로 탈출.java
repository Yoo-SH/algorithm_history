// 레버와 목표지점을 항해 최단거리로 가야하므로 BFS
// 레버를 누르지 않으면 탈출할 수 없으니 타겟지점 가기전 레버는 필수조건
import java.util.*;

class Solution {
    
    //상하 좌우
    static int [] dy = new int[]{-1,1,0,0};
    static int [] dx = new int[]{0,0,-1,1};
    
    public int solution(String[] maps) {
        
        Deque<int[]> queue = new ArrayDeque();
        int h = maps.length;
        int w = maps[0].length();
        boolean [][] visited = new boolean[h][w];
        boolean find = false;

        
        // 레버까지 가는 최단거리 BFS
        for(int y=0;y<h;y++){
            for(int x=0;x<w;x++){
                if(maps[y].charAt(x) == 'S') {
                    queue.offer(new int[]{y,x,0}); //y,x,level
                    visited[y][x] = true;
                    break;
                }
            }
        }
        
        while(!queue.isEmpty() && !find){
            int [] cur = queue.poll();
            int cy = cur[0], cx = cur[1], level = cur[2];
            
            for(int i=0;i<4;i++){
                int ny = cy + dy[i], nx = cx + dx[i];
                
                if(!((0<=ny && ny <h) && (0<=nx && nx<w))) continue;
                if(visited[ny][nx]) continue;
                if(maps[ny].charAt(nx) == 'X') continue;
                
                
                visited[ny][nx] = true;
                if(maps[ny].charAt(nx) == 'L'){
                    queue.clear();
                    for(boolean [] row : visited){
                        Arrays.fill(row,false);
                    }
                    visited[ny][nx] = true;
                    queue.offer(new int[]{ny,nx,level+1});
                    find = true;
                    break;
                }
                queue.offer(new int[]{ny,nx,level+1});
            }
        }
        
        if(!find) return -1;
        
        // 레버에서 타겟 지점까지 가는 최단거리 BFS
        while(!queue.isEmpty()){
            int [] cur = queue.poll();
            int cy = cur[0], cx = cur[1], level = cur[2];
            
            for(int i=0;i<4;i++){
                int ny = cy + dy[i], nx = cx + dx[i];
                
                if(!((0<=ny && ny <h) && (0<=nx && nx<w))) continue;
                if(visited[ny][nx]) continue;
                if(maps[ny].charAt(nx) == 'X') continue;
                
                
                visited[ny][nx] = true;
                if(maps[ny].charAt(nx) == 'E'){
                    return level +1;
                }
                queue.offer(new int[]{ny,nx,level+1});
            }
        }
        return -1;
    }
}