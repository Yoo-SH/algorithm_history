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
## 양수 가중치가 있는 그래프의 최단거리를 구하여라 -> 다익스트라 알고리즘
## 1번 정점에서 N번 정점으로 이동할 때, 반드시 두 정점을 거치면서 최단 경로로 이동해야합니다.
## 해당 두 정점을 1에서 v1까지 다익스트라, v1에서 v2까지 다익스트라, v2에서 N까지 다익스트라 총 3번 진행
from collections import defaultdict
import heapq
def solution():

    N, E= map(int,input().split())
    graph = defaultdict(list)
    INF = float('inf')

    # 양방향 그래프 초기화
    for _ in range(E):
        a, b, c=map(int, input().split())
        graph[a].append((c,b))
        graph[b].append((c,a))
    
    v_1, v_2 = map(int,input().split())
    
    # 다익스트라 알고리즘
    dist_v1 = []
    dist_v2 = []
    for start_node in [1,v_1,v_2]:
        dist = [INF] * (N+1) 
        dist[start_node] = 0
        pq = [(0,start_node)]
        
        while pq:
            cost, current_node = heapq.heappop(pq)

            if cost > dist[current_node]:
                continue

            for next_cost, next_node in graph[current_node]:
                new_cost = cost + next_cost
                if new_cost < dist[next_node]:
                    dist[next_node] = new_cost
                    heapq.heappush(pq,(new_cost, next_node))
        
        if start_node == v_1:
            dist_v1 = dist
        elif start_node == v_2:
             dist_v2 = dist

    
    path_1 = dist_v1[1] + dist_v1[v_2] +dist_v2[N] #v1->v2->N
    path_2 = dist_v2[1] + dist_v2[v_1] + dist_v1[N] #v2->v1->N


    print( -1 if path_1  == INF or path_2 == INF else min(path_1,path_2))
    return

solution()
