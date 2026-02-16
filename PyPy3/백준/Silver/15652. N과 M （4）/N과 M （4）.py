import sys
input = sys.stdin.readline

N, M = 0,0
def backtracking(start, path):
    if len(path) == M:
        print(*path)
        return  
    
    for i in range(start, N + 1):
        path.append(i)
        backtracking(i, path)
        path.pop()

def solution():
    global N, M
    N, M = map(int, input().split())
    backtracking(1, [])

if __name__ == "__main__":
    solution()
