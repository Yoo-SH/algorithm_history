import sys
from collections import deque
input = sys.stdin.readline

# 제한시간 1초, 2<= N,M <=100
## 감염이며, 감염의 최소일수를 구하려함
### bfs로 감염의 최소 레벨을 구한다
def main():
    M, N, H = map(int, input().split())
    grid = []
    for _ in range(H):
        grid.append([list(map(int, input().split())) for _ in range(N)])
    
    queue = deque()
    vector = [(-1,0,0), (1,0,0), (0,1,0), (0,-1,0), (0,0,1), (0,0,-1)]
    last_day = -float('inf')
    cook_tomato_count = 0
    wall_count = 0

    
    # 익은 토마토를 탐색
    for h, matrix in enumerate(grid):
        for y ,row in enumerate(matrix):
            for x, value in enumerate(row):
                if value == 1:
                    queue.append((h,y,x,0))
                    cook_tomato_count +=1
                elif value == -1: 
                    wall_count +=1

    # 모든 토마토가 익어있는 경우
    if cook_tomato_count == N *M:        
        print(0)
        return 
                
    # bfs 탐색
    while queue:
        ch, cy, cx, day = queue.popleft()
        last_day = max(day,last_day)
        for dh, dy,dx in vector:
            nh, ny, nx = ch + dh, cy + dy, cx + dx
            if 0<= nh < H  and 0 <= ny < N and 0 <= nx < M and (ny,nx) and grid[nh][ny][nx] not in [-1,1]:
                grid[nh][ny][nx] = 1
                queue.append((nh, ny,nx,day+1))

    # 익지 않은 토마토가 있는지 확인
    for h, matrix in enumerate(grid):
        for y ,row in enumerate(matrix):
            for x, value in enumerate(row):
                if value == 0:
                    print(-1)
                    return

    ## 최소 날짜. 
    print(last_day)


if __name__ == "__main__":
    main()