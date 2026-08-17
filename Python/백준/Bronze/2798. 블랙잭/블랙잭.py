# 완전 탐색으로 가도 될듯.
## N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000), 제한시간 
### 최대 100 * 100 * 100 이므로 제한시간 1초안에 도달

from itertools import combinations
def solution():
    N, M = map(int, input().split())
    input_list = list(map(int, input().split()))
    combi_list = list(combinations(input_list,3))
    
    max_sum = -1
    for a, b, c in combi_list:
        if a + b + c <= M and a + b + c >= max_sum:
            max_sum = a + b + c

    print(max_sum)

    
solution()