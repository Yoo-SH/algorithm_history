import sys
input = sys.stdin.readline
from collections import defaultdict

N, M = 0,0
li = []
is_printed = set()

def backtracking(path,is_visited):
    if len(path) == M:
        if tuple(path) not in is_printed:
            print(*path)
            is_printed.add(tuple(path))
        return
    
    prev = 0
    for idx, val in enumerate(li):
        if prev != val and is_visited[idx] != True:
            prev = val
            is_visited[idx] = True
            path.append(val)
            backtracking(path, is_visited)
            path.pop()
            is_visited[idx] = False

def solution():
    global N, M, li
    N, M = map(int, input().split())
    li = list(map(int,input().split()))
    is_visited = [False] * N
    li.sort()
    backtracking([],is_visited)

if __name__ == "__main__":
    solution()
