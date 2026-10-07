//이것도 그냥 BFS 탐색하면 되겠는데?
//board의 길이도 10^2이므로 o(V+E) -> o(100+100)이니까 시간안에는 무리 없을듯
// 어려운 부분은 이동하는 상하좌우의 길이가 동적이고, 벽을 만날 때까지 간다는 것
import java.util.*;

class Solution {
    static String[] matrix;
    static boolean [][]  visited;
    static int h;
    static int w;
    
    static int [] rightPos(int cy, int cx){
        
        int nx = cx;
        while(!(nx >= w || matrix[cy].charAt(nx) == 'D' )){
            nx++;
        }
        return new int[] {cy,nx-1};
        
    }
    
    static int [] leftPos(int cy,int cx){
        int nx = cx;
        while(!(nx <0 || matrix[cy].charAt(nx) == 'D' )){
            nx--;
        }
        return new int[] {cy,nx+1};
    }
    
    static int [] upPos(int cy,int cx){
        int ny = cy;
        while(!(ny >=h || matrix[ny].charAt(cx) == 'D')){
            ny++;
        }
        return new int[] {ny-1,cx};
        
        
    }
    
    static int [] downPos(int cy,int cx){
        
        int ny = cy;
        while(!( ny <0 || matrix[ny].charAt(cx) == 'D')){
            ny--;
        }
        return new int[] {ny+1,cx};
           
    }
    
    static boolean isValid(int cy,int cx){
        
        if(!((0<=cy && cy <h) && (0<=cx && cx <w))) return false;
        if(visited[cy][cx]) return false;
        
        return true;
        
    }
    
    public int solution(String[] matrix) {
        
        this.matrix = matrix;
        
        this.h = matrix.length;
        this.w = matrix[0].length();
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        visited = new boolean [h][w];
    
        for(int y = 0; y<h;y++){
            for(int x =0;x<w;x++){
                if(matrix[y].charAt(x) == 'R') {
                    queue.offer(new int[]{y,x,0}); //y,x,count
                    visited[y][x] = true;
                }
            }
        }
        
        while(!queue.isEmpty()){
            int cur [] = queue.poll();
            int cy = cur[0], cx = cur[1], count = cur[2];
            
            if(matrix[cy].charAt(cx) == 'G') return count;
            
            //상하좌우 이동
            int [] next = upPos(cy,cx);
            if(isValid(next[0],next[1])) {
                visited[next[0]][next[1]] = true;
                queue.offer(new int[]{next[0],next[1],count+1});
            }
            next = downPos(cy,cx);
            if(isValid(next[0],next[1])) {
                visited[next[0]][next[1]] = true;
                queue.offer(new int[]{next[0],next[1],count+1});
            }
            next = leftPos(cy,cx);
            if(isValid(next[0],next[1])) {
                visited[next[0]][next[1]] = true;
                queue.offer(new int[]{next[0],next[1],count+1});
            }
            next = rightPos(cy,cx);
            if(isValid(next[0],next[1])) {
                visited[next[0]][next[1]] = true;
                queue.offer(new int[]{next[0],next[1],count+1});
            }
            
        }
        
        
        return -1;
    }
}