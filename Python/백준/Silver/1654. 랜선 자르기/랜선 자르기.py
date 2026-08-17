import sys
input = sys.stdin.readline

# 제한 시간 2초, (1<= K <= 10,000  1<= N <= 1,000,000)
## 단순 순차 탐색은 시간초과. N탐색 속도를 줄여야함
### 해당 타겟을 기준으로 랜선을 나누고, 랜선 갯수가 N보다 많아지는 것을 기준으로 경계를 찾는다.
def main():
    K, N = map(int, input().split())
    lens_list = []
    
    for _ in range(K):
        lens_list.append(int(input()))

    left, right = 1, max(lens_list)
    
    while left <= right:
        target = (left + right) // 2
        count = 0 
    # 해당 타겟을 기준으로 랜선을 나누고, 랜선 갯수가 N보다 많아지는 것을 기준으로 경계를 찾는다.
        for lens in lens_list:
            count += lens // target
        
        if count >= N:
            result = target
            left = target + 1
        elif count < N:
            right = target -1 

    print(result)

if __name__ == "__main__":
    main()
