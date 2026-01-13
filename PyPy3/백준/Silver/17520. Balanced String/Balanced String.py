import sys
from collections import deque
input = sys.stdin.readline

# 제한시간 0.5초,  1,000,00글자
## 계산이 반복, 이전 값이 이후 값에 영향을 준다..?
MOD = 16769023

def main():
    n = int(input().strip())
    dp = [0] * (n + 1)

    dp[1] = 2
    
    for i in range(2, n + 1):
        if i % 2 == 1:  # 홀수: 2배
            dp[i] = (dp[i-1] * 2) % MOD
        else:           # 짝수: 유지
            dp[i] = dp[i-1]
    
    print(dp[n])

if __name__ == "__main__":
    main()