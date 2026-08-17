"""
면접 코드 리뷰(정답 case)
1. 왜 이렇게 구현했는지
2. 이렇게 구현했을 때의 문제점이 무엇이고 그 문제점을 해결하려면 어떻게 해야 하는지
3. 시간 복잡도에 설명할 수 있는지
4. 해결 방법을 적용했을 때의 Trade-off가 무엇인지 등 꼬리 질문
* 힌트도 주고, 꼬리 질문들에 대한 내 생각을 토론처럼 이야기하도록 유도

면접 코드 리뷰(오답 case)
1. 어떤 접근으로 풀었고, 왜 그 방법을 선택했는지
2. 어디서 틀렸는지 스스로 찾아보기 (반례 제시 유도)
3. 틀린 원인이 구현 실수인지, 접근 자체의 오류인지 분류
4. 부분 수정으로 고칠 수 있는지, 전면 재설계가 필요한지 판단
5. 정답 풀이를 본 후, 내 접근과의 차이점 분석
6. 같은 유형 문제에서 이 실수를 반복하지 않으려면? (꼬리 질문)
* 정답을 본 후에  단순히 "아 이거였구나"가 아니라 "내 접근이 왜 안 되는지"를 정확히 설명할 수 있는지 확인하시오.
"""
from itertools import combinations
import copy
# 제한 시간 2초, (3 ≤ N, M ≤ 8)
## 벽은 3개로 고정
## 시간과 갯수를 참고하면 완전 탐색으로 모든 벽의 케이스를 구하고 바이러스 전파하고(dfs) 안전영역 미로 탐색(dfs)하면 될듯
def solution():
    N, M = map(int,input().split())
    max_area = 0

    matrix = [list(map(int,input().split())) for _ in range(N)]
    yx_list = []
    
    for y, row in enumerate(matrix):
        for x, val in enumerate(row):
            if val ==0:
                yx_list.append((y,x))
        
    for a,b,c in list(combinations(yx_list,3)): # a == (ay,ax)
        matrix_copy = [row[:] for row in matrix]
        ay, ax = a
        by, bx = b
        cy, cx = c

        # 벽을 세움
        matrix_copy[ay][ax] =1
        matrix_copy[by][bx] =1
        matrix_copy[cy][cx] =1
        
        # dfs 탐색을 위한 자료
        stack = []
        is_visited = set()
        vector = [(-1,0),(1,0),(0,1),(0,-1)]
        
        # 바이러스 전파 시작

        # 바이러스 dfs 시작 위치 찾기
        for y, row in enumerate(matrix_copy):
            for x, val in enumerate(row):
                if val == 2 and (y,x) not in is_visited:
                    stack.append((y,x))
                    is_visited.add((y,x))

                    # 바이러스 dfs 전파 시작
                    while stack:
                        cy,cx = stack.pop()

                        for dy,dx in vector:
                            ny, nx = cy+dy, cx+dx
                            
                            if 0<=ny<N and 0<=nx<M and (ny,nx) not in is_visited and matrix_copy[ny][nx] in [0,2]:
                                is_visited.add((ny,nx))
                                matrix_copy[ny][nx] = 2
                                stack.append((ny,nx))


        is_visited.clear()

        area = 0
        # 안전영역 갯수 세기
        for y, row in enumerate(matrix_copy):
            for x, val in enumerate(row):
                if val == 0:
                    area +=1
                    # 방문한 최대 안전 영역 갯수 갱신
                    max_area = max(max_area,area)
        
    print(max_area)
    return 
                                
solution()
