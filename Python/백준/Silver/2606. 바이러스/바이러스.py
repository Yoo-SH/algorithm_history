# 제한 시간 1초
## DFS를 통한 연결된 노드 전부 카운트
from collections import defaultdict
def solution():
    N = int(input().strip()) #노드 갯수
    M = int(input().strip()) #간선 갯수

    graph = defaultdict(list)

    for _ in range(M):
        a, b = map(int,input().split())
        graph[a].append(b)
        graph[b].append(a)

    stack = []
    is_visited = set()
    stack.append(1)
    is_visited.add(1)
    virused_node = 0

    while stack:
        current_node = stack.pop()

        for next_node in graph[current_node]:
            
            if next_node not in is_visited:
                is_visited.add(next_node)
                stack.append(next_node)
                virused_node +=1

    print(virused_node)
    return 
 
solution()

