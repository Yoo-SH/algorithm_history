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
from collections import deque, defaultdict
def solution():
    N, M, V = map(int,input().split())
    stack = []
    queue = deque()
    is_visited_bfs = set()
    is_visited_dfs = set()
    graph_bfs = defaultdict(list)
    graph_dfs = defaultdict(list)


    for _ in range(M):
        ## 양방향 노드
        from_node, to_node = map(int,input().split())
        graph_dfs[from_node].append(to_node)
        graph_dfs[to_node].append(from_node)
        graph_bfs[from_node].append(to_node)
        graph_bfs[to_node].append(from_node)
    

    # 작은 순으로 탐색하여야 하므로 오름차순 정렬
    for node in graph_bfs.keys():
        graph_bfs[node].sort()
        graph_dfs[node].sort(reverse=True)

    # dfs 시작 노드 초기화
    stack.append(V)

    while stack:
        current_node = stack.pop()

        if current_node in is_visited_dfs:
            continue

        is_visited_dfs.add(current_node)
        print(current_node, end= " ")
    
        for next_node in graph_dfs[current_node]: # iter 순회로 인해 큰값먼저 들어감
            if next_node not in is_visited_dfs:
                stack.append(next_node)


    print()

    # bfs 시작 노드 초기화
    queue.append(V)
    is_visited_bfs.add(V)
    
    # BFS탐색
    while queue:
        current_node = queue.popleft()
        print(current_node,end=" ")

        for next_node in graph_bfs[current_node]:
            if next_node not in is_visited_bfs:
                is_visited_bfs.add(next_node)
                queue.append(next_node)
    

    return 

solution()
