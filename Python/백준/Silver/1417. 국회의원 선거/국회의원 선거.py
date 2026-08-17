# 그리디로 가장 많은 투표수를 가진 사람의 표를 뺐는것이 방향
# 매수해야하는 최솟값은 본인이 최고 투표수가 될 때
## 제한시간도 2초
def solution():
    N = int(input().strip())
    
    dasom = int(input().strip())

    if N == 1:
        print(0)
        return 

    candidates = []
    for _ in range(N-1):
        candidates.append(int(input().strip()))
    
    
    max_candidate = max(candidates)
    count = 0 
    while dasom <= max_candidate:
        candidates[candidates.index(max_candidate)] -= 1 
        max_candidate = max(candidates)
        dasom += 1
        count +=1
    
    print(count)


solution()