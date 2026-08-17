# 완전 탐색으로 가도 될듯.
## S1(2 ≤ S1 ≤ 20), S2(2 ≤ S2 ≤ 20), S3(2 ≤ S3 ≤ 40)
### 최대 20 * 20 * 40 이므로 제한시간 1초안에 도달
### 1. 가장 많이 나오는 주사위 조합 2. 중복이면 합이 가장 작은 것
from itertools import combinations, permutations
from collections import defaultdict
def solution():

    a_dice, b_dice, c_dice = map(int, input().split())
    combi_dict = defaultdict(int)

    # 가장 많이 나오는 주사위 조합을 카운트 하기 위해 합 빈도수 저장
    for a in range(1,a_dice+1):
        for b in range(1, b_dice+1):
            for c in range(1, c_dice +1):
                combi_dict[a+b+c] +=1 

    combi_list = []
    # value 내림차순 정렬하고, key값 오름차순 정렬
    for key, val in combi_dict.items():
        combi_list.append((key,val))

    combi_list= sorted(combi_list, key=lambda x: (-x[1],x[0]))

    print(combi_list[0][0])

    
solution()