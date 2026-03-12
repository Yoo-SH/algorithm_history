from collections import defaultdict, deque
def solution():
    N, M = map(int, input().split())
    graph = defaultdict(list)
    indegree_dict = defaultdict(list)
    indegree = [0] * (N+1) #해당 노드에서 들어오는 edge 카운트 
    outdegree = [0] * (N+1)  # 해당 노드에서 나가는 edge 카운트

    for _ in range(M):
        from_node,to_node = map(int, input().split())
        graph[from_node].append(to_node)
        indegree_dict[to_node].append(from_node)
        indegree[to_node] +=1
        outdegree[from_node] +=1
    
    targer_node = int(input().strip())
    
    count = 0
    if indegree[targer_node] ==0:
        print(0)
        return
    else:
        queue = deque()
        is_visited = set()
        indegree_list = indegree_dict[targer_node]

        for node in indegree_list:
            queue.append(node)
            is_visited.add(node)

        while queue:
            node = queue.popleft()
            count +=1
            indegree_list = indegree_dict[node]
            if indegree_list:
                for node in indegree_list:
                    if node not in is_visited:
                        queue.append(node)
                        is_visited.add(node)
                
    print(count)


solution()