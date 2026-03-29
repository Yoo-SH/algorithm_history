# 단순 구현 문제
## 자료구조 선택이 중요할듯
from collections import defaultdict
def solution(survey, choices):
    
    result = defaultdict(int)
    
    for s, c in zip(survey,choices): ## s = AN
        a = s[0] # A
        b = s[1] # N
        
        if c == 1:
            result[a] += 3
        elif c == 2:
            result[a] += 2
        elif c == 3:
            result[a] += 1
        elif c == 4:
            continue
        elif c == 5:
            result[b] += 1
        elif c == 6:
            result[b] += 2
        elif c == 7:
            result[b] += 3
    
    # 정렬 1: 점수 크기 내림차순, 정렬 2: 키값 사전 순
    #list(result).sort(key=lambda x: (-x[1],x[0]))
    
    result_list = []
    # 1번 지표
    if result["R"] >= result["T"]:
        result_list.append("R")
    else:
        result_list.append("T")
     
    # 2번 지표
    if result["C"] >= result["F"]:
        result_list.append("C")
    else:
        result_list.append("F")
        
    # 3번지표
    if result["J"] >= result["M"]:
        result_list.append("J")
    else:
        result_list.append("M")
    
    # 4번지표
    if result["A"] >= result["N"]:
        result_list.append("A")
    else:
        result_list.append("N")
    
    
    return "".join(result_list)
