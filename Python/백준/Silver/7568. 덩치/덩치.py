# 전체 n명중, nC2뽑는 경우의 수를 구함
# 자신이 키나,몸무개 둘 중 하나로도 크면 카운트
# rank = n-count
from collections import defaultdict
def solution():
    n = int(input().strip())
    n_list = []

    # 비교를 위해 n matrix으로 만듦
    n_rank_matrix = [n] * n

    # 몸무게 초기화
    for i in range(n):
        kg, h = map(int, input().split())
        n_list.append((i, kg,h))
    
    # 완전탐색비교
    for i in range(n):
        for j in range(i+1,n):
            idx_i, i_kg, i_h = n_list[i]
            idx_j, j_kg, j_h = n_list[j]
            if i_h >= j_h or i_kg >= j_kg:
                n_rank_matrix[idx_i] -= 1
            if i_h <= j_h or i_kg <= j_kg:
                n_rank_matrix[idx_j] -=1
    print(" ".join(map(str,n_rank_matrix)))


solution()