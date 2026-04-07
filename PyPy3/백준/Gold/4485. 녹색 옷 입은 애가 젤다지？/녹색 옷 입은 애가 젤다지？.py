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

- 프로그래머스 모의고사에서는 실제 환경과 비슷하도록, 내가 작성한 코드를 다시 보지않고 복기하여 답변하세요
"""

# 제한 시간 1초
## 시작점 (0,0)에서 (n-1,n-1)까지 가야하는데, 가중치가 존재함(matrix)형태로. 그리고 최소 가중치인 것으로 가야함
## 따라서 다익스트라 알고리즘이 적절한 것 같아.
from collections import defaultdict
import heapq

def solution():
    T = 0
    while True:
        T +=1 
        N = int(input().strip())
        
        # 테스트 종료 조건
        if N == 0:
            break

        matrix = [list(map(int, input().split())) for _ in range(N)]
        
        # 다익스트라 알고리즘
        pq = [(0,(0,0))]
        INF = float('inf')
        dist = [[INF] * N for _ in range(N)]
        dist[0][0] = 0
        vector = [(-1,0),(1,0),(0,1),(0,-1)]

        while pq:
            cost, (cy,cx)= heapq.heappop(pq)

            if cost > dist[cy][cx]:
                continue

            for dy, dx in vector:
                ny, nx = cy +dy, cx+dx
                if 0<=ny<N and 0<= nx<N:
                    next_cost = matrix[ny][nx]
                    new_cost = cost + next_cost

                    if new_cost < dist[ny][nx]:
                        dist[ny][nx] = new_cost
                        heapq.heappush(pq,(new_cost, (ny,nx)))
        
        print(f"Problem {T}: {matrix[0][0]+dist[N-1][N-1]}")
        






            




    return 
 

solution()
