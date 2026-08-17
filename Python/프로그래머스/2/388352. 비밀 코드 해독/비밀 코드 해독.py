# 10 ≤ n ≤ 30, 1 ≤ (q의 길이 = m) ≤ 10 이므로 완전탐색 가능
## n의 크기에 따라 len(q)크기의 배열을 여러개 만듦
## q리스트와 비교하여 ans를 해당하는 배열이 몇개인지 카운트

from itertools import combinations

def solution(n, q, ans):
    
    result = 0
    for secret_code in combinations([i for i  in range(1,n+1)], 5):
        is_secret_code_ok = True
        for q_code, q_ans in zip(q, ans):
            ans_count = 0
            for secret_code_num in secret_code:
                if secret_code_num in q_code:
                    ans_count+=1
            if ans_count != q_ans:
                is_secret_code_ok = False
                break
        
        if is_secret_code_ok:
            result +=1
                
    
    return result