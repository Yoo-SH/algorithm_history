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

# 제한시간 0.5초 버스 비용은 0보다 크거나 같고, 100,000보다 작은 정수
## 0이상 가중치 그래프인데, A번째 도시에서 B번째 도시까지 가는데 드는 최소비용을 출력하여라 -> 다익스트라 알고리즘
from collections import defaultdict
import heapq
def solution():
    N = int(input().strip()) # 도시 개수
    M = int(input().strip()) # 버스 개수
    city_graph = defaultdict(list)

    # 도시 간격 초기화
    for _ in range(M):
        start_city, end_city, val = map(int, input().split())
        city_graph[start_city].append((val,end_city))
    
    
    # 다익스트라 알고리즘
    my_city, target_city= map(int, input().split())
    INF = float('inf')
    dist = [INF] * (N+1)
    dist[my_city] = 0
    pq  = [(0,my_city)]
    
    while pq:
        cost, current_city = heapq.heappop(pq)

        if cost > dist[current_city]:
            continue

        for next_cost, next_city in city_graph[current_city]:
            new_cost = cost + next_cost
            if new_cost < dist[next_city]:
                dist[next_city] = new_cost
                heapq.heappush(pq, (new_cost,next_city))

    print(dist[target_city])
    return

solution()
