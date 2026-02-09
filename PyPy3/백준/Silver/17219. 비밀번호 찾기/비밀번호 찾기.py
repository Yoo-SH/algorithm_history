import sys
input = sys.stdin.readline
from collections import defaultdict

# 시간 초과가 안 발생하도록 해시 방법으로 가야할 듯
def solution():
    N, M= map(int,input().split())

    dict = defaultdict(str)
    
    for _ in range(N):
        key, value = input().split()
        dict[key] = value
        
    for _ in range(M):
        key = input().strip()
        print(dict[key])
        
    


    
if __name__ == "__main__":
    solution()
