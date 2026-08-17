# 제한 시간 2초,  N(1 ≤ N ≤ 15,000) M(1 ≤ M ≤ 10,000,000) 
## 무조건 O(nlogn) 이하의 알고리즘으로 가야한다.
## 이것도 정렬한뒤O(nlogn), 투 포인터 방식O(n)으로 가야하려나?
def solution():
    N = int(input().strip())
    M = int(input().strip())

    input_list = list(map(int,input().split()))
    input_list.sort() # o-nolon
  
    left = 0
    right = N-1
    result = 0

    while left < right:
        a = input_list[left]
        b = input_list[right]

        if a+b == M:
            result +=1
            left+=1
            right-=1
        elif a+b < M:
            left+=1
        else:
            right-=1

    print(result)
    return 
solution()
