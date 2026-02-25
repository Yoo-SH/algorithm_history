import sys
input = sys.stdin.readline
from collections import defaultdict, deque

def solution():
    N = int(input().strip())
    tree = defaultdict(list)
    parent_note = {}
    queue = deque([1])
    is_visited = set()
    
    
    for _ in range(N-1):
        node_1, node_2 = map(int, input().split())
        tree[node_1].append(node_2)
        tree[node_2].append(node_1)
    
    
    while queue:
        c_node = queue.popleft()
        
        for nxt_node in tree[c_node]:
            if nxt_node not in is_visited:
                queue.append(nxt_node)
                is_visited.add(nxt_node)
                parent_note[nxt_node] = c_node

    
    for n in range(2,N+1):
        print(parent_note[n])



solution()