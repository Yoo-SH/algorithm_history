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
# 제한 시간 2초, N(2 ≤ N ≤ 11) 
## 모든 경우의 수를 탐색해도 시간이 남을거 같다. 최악의 경우(10)^4 
from itertools import permutations
def solution():
    N = int(input().strip())
    A = list(map(int,input().split()))
    plus_count, minus_count, multi_count, div_count = map(int,input().split())
    min_result = float('inf')
    max_result = -float('inf')

    combi_list = []

    for _ in range(plus_count):
        combi_list.append('+')
    for _ in range(minus_count):
        combi_list.append('-')
    for _ in range(multi_count):
        combi_list.append('*')
    for _ in range(div_count):
        combi_list.append('/')


    for combi in list(permutations(combi_list,plus_count+minus_count+multi_count+div_count)):
        combi = list(combi)
        result = A[0]
        B = A[1:]
        
        for oper, val in zip(combi, B):
            if oper == '+':
                result = result + val
            elif oper == '-':
                result = result - val
            elif oper == '*':
                result = result * val
            elif oper == '/':
                result = -(abs(result)//val) if result < 0 and val >0 else result // val
        min_result = min(min_result,result)
        max_result = max(max_result,result)


    print(max_result)
    print(min_result)
    return 

    
solution()

