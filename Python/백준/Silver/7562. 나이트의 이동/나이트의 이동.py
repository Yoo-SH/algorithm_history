# 제한 시간 1초
"""
면접 코드 리뷰
1. 왜 이렇게 구현했는지
2. 이렇게 구현했을 때의 문제점이 무엇인지
3. 그 문제점을 해결하려면 어떻게 해야 하는지
4. 해결 방법을 적용했을 때의 Trade-off가 무엇인지 등 꼬리 질문
* 힌트도 주고, 꼬리 질문들에 대한 내 생각을 토론처럼 이야기하도록 유도
"""
# 판단근거: 최소 이동 횟수를 물어보니 bfs로 가는게 맞는거 같음.
from collections import deque
def solution():
    T = int(input().strip())
    for t in range(T):
        I = int(input().strip())
        matrix = [[0] * I for _ in range(I)] # matrix에 level을 기록하기
        sy, sx = map(int,input().split())
        gy,gx = map(int,input().split())
        
        
        is_visited = set()
        vector = [(-2,-1),(-2,1),(-1,-2),(-1,2),(1,-2),(1,2),(2,-1),(2,1)]
        queue = deque([(sy,sx)]) # start y, start x
        is_visited.add((sy,sx))
                
        while queue:
            cy, cx = queue.popleft()
            
            if (cy, cx) == (gy, gx):
                print(matrix[cy][cx])
                break
            
            for dy, dx in vector:
                ny, nx = cy+dy, cx+dx

                if 0 <= ny <I and 0 <= nx <I and (ny,nx) not in is_visited:
                    is_visited.add((ny,nx))
                    queue.append((ny,nx))
                    matrix[ny][nx] = matrix[cy][cx] +1               

    return 


 
solution()

