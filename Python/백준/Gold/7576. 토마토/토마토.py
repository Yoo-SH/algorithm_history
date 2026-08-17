import sys
from collections import deque
input = sys.stdin.readline

# 제한시간 1초, 2<= N,M <=1000
## 감염이며, 감염의 최소일수를 구하려함
### bfs로 감염의 최소 레벨을 구한다
def main():
    M, N = map(int, input().split())
    matrix = [list(map(int, input().split())) for _ in range(N)]
    queue = deque()
    is_visited = set()
    vector = [(1,0), (-1,0), (0,1), (0,-1)]
    last_day = -float('inf')
    cook_tomato_count = 0
    wall_count = 0
    

    # 익은 토마토를 탐색
    for y ,row in enumerate(matrix):
        for x, value in enumerate(row):
            if value == 1:
                is_visited.add((y,x))
                queue.append((y,x,0))
                cook_tomato_count +=1
            elif value == -1: 
                wall_count +=1

    # 모든 토마토가 익어있는 경우
    if cook_tomato_count == N *M:        
        print(0)
        return
                
    # bfs 탐색
    while queue:
        cy, cx, day = queue.popleft()
        last_day = max(day,last_day)
        for dy,dx in vector:
            ny, nx = cy + dy, cx + dx
            if 0 <= ny < N and 0 <= nx < M and (ny,nx) not in is_visited and matrix[ny][nx] != -1:
                is_visited.add((ny,nx))
                matrix[ny][nx] = 1
                queue.append((ny,nx,day+1))

    # 익지 않은 토마토가 있는지 확인
    for y ,row in enumerate(matrix):
        for x, value in enumerate(row):
            if value == 0:
                print(-1)
                return

    ## 최소 날짜. 
    print(last_day)



  
if __name__ == "__main__":
    main()