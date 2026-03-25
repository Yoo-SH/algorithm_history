"""
면접 코드 리뷰(정답 case)
1. 왜 이렇게 구현했는지
2. 이렇게 구현했을 때의 문제점이 무엇이고 그 문제점을 해결하려면 어떻게 해야 하는지
3. 시간 복잡도에 설명할 수 있는지
4. 해결 방법을 적용했을 때의 Trade-off가 무엇인지 등 꼬리 질문
* 힌트도 주고, 꼬리 질문들에 대한 내 생각을 토론처럼 이야기하도록 유도

면접 코드 리뷰(오답 case)
1. 어떤 접근으로 풀었고, 왜 그 방법을 선택했는지
2. 어디서 틀렸는지 스스로 찾아보기 (반례 제시 유도)
3. 틀린 원인이 구현 실수인지, 접근 자체의 오류인지 분류
4. 부분 수정으로 고칠 수 있는지, 전면 재설계가 필요한지 판단
5. 정답 풀이를 본 후, 내 접근과의 차이점 분석
6. 같은 유형 문제에서 이 실수를 반복하지 않으려면? (꼬리 질문)
* 정답을 본 후에  단순히 "아 이거였구나"가 아니라 "내 접근이 왜 안 되는지"를 정확히 설명할 수 있는지 확인하시오.
"""
# 제한 시간 1초, N(2 ≤ N ≤ 50) M(1 ≤ M ≤ 13) 
## 최악의 경우 13C6 이므로 완전탐색으로 가능하겠군.. 대략 100만 
from itertools import combinations
def solution():
    N, M = map(int, input().split())
    matrix = [list(map(int,input().split())) for _ in range(N)]

    chicken_list = []
    house_list = []
    min_result = float('inf')

    # 치킨집 위치랑, 집 위치를 저장
    for y, row in enumerate(matrix):
        for x, val in enumerate(row):
            if val == 2:
                chicken_list.append((y,x))
            elif val == 1:
                house_list.append((y,x))
    
    # 치킨집 최대 M가지만 선택
    for chicken_cobi in list(combinations(chicken_list,M)):
        chicken_cobi = list(chicken_cobi)

        # 치킨집 거리 구하기
        short_chicken_len_sum = 0
        for h_y, h_x in house_list:
            short_chicken_len = float('inf')
            for c_y, c_x in chicken_cobi:
                short_chicken_len = min(short_chicken_len,abs(c_y-h_y)+abs(c_x-h_x))
            
            short_chicken_len_sum += short_chicken_len
        min_result = min(min_result, short_chicken_len_sum)
    
    print(min_result)
    return

solution()

