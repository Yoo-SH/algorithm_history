import sys
input = sys.stdin.readline
from collections import defaultdict

N, M = 0,0
li = []

def backtracking(start, path):
    if len(path) == M:
        print(*path)
        return  
    
    for i in li:
        if i not in path:
            path.append(i)
            backtracking(i, path)
            path.pop()

def solution():
    global N, M, li
    N, M = map(int, input().split())
    li = list(map(int,input().split()))
    li.sort()
    backtracking(li[0], [])

if __name__ == "__main__":
    solution()
