from itertools import combinations
def solution():
    N, M= map(int,input().split())
    array = [ i+1 for i in range(N)]
    for p in list(combinations(array,M)):
        print(*p)


solution()