# 제한 시간 2초
## 미로 탐색인데, 목적지까지 최소의 칸수이므로 BFS를 사용
from collections import deque
def solution():
    N, M = map(int,input().split())
    matrix = [list(map(int,input())) for _ in range(N)]
    vector = [(-1,0), (1,0), (0,-1), (0,1)]
    is_visited = set()
    queue = deque() # (y,x,level)
    queue.append((0, 0, 1))
    is_visited.add((0,0))
    target = (N-1,M-1)

    while queue:
        cy,cx, level = queue.popleft()

        if (cy,cx) == target:
            print(level)
            break

        for dy,dx in vector:
            ny,nx = cy+dy , cx +dx

            if 0<=ny<N and 0<= nx <M and matrix[ny][nx] != 0 and (ny,nx) not in is_visited:
                is_visited.add((ny,nx))
                queue.append((ny,nx,level+1))


    return 

solution()

