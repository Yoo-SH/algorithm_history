from collections import deque
def solution():
    N, K = map(int,input().split())
    
    queue = deque([i for i in range(1,N+1)])
    result = []
    
    while queue:
        queue.rotate(-(K-1))
        result.append(queue.popleft())
    
    print("<" + ", ".join(map(str,result)) + ">")
    

solution()