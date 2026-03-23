# 제한 시간 2초
from collections import defaultdict
def solution():
    N = int(input().strip())
    matrix = [list(map(int,input())) for _ in range(N)]

    stack = [ ]
    vector = [(-1,0),(1,0),(0,-1),(0,1)]
    result = defaultdict(int)
    unit_level = 0 # 단지 레벨

    # 시작 노드 초기화
    for y, row in enumerate(matrix):
        for x, val in enumerate(row):
            
            #단지 레벨과 시작노드 탐색
            if val == 1:
                stack.append((y,x))
                unit_level +=1

                # dfs로 단지 갯수 탐색
                while stack:
                    cy, cx = stack.pop()

                    # dfs 방문 처리 시점
                    if matrix[cy][cx] != 0:
                        matrix[cy][cx] = 0
                        result[unit_level] += 1

                    for dy, dx in vector:
                        ny, nx = cy+dy, cx+dx
                        if 0<= ny < N and 0<=nx <N and matrix[ny][nx] != 0:
                            stack.append((ny,nx))
                            
    
    # 각 단지내 집의 수를 오름차순으로 정렬
    print(unit_level)
    print("\n".join(map(str,sorted(list(result.values())))))

    return 

solution()

