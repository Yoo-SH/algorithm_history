import sys
from collections import deque
input = sys.stdin.readline

# 제한시간 1초, n은 1부터 1000
## 2xn의 크기의 직사각형을 채우는 방법의 수
## 브루트 포스로 진행하면 시간초과
## 다이나믹 프로그래밍
def main():

    n = int(input())
    
    dp = [0] * (n+1)

    #예외처리
    if n == 1:
        print(1)
        return 
    
    dp[1] = 1
    dp[2] = 3
    
    # 탑 다운 방식으로 다이나믹 프로그래밍 진행
    for i in range(3, n+1):
        ## 마지막에 1×2 (세로) 타일 하나를 놓는 경우 ＋ 마지막에 2×1 타일 2개를 놓는 경우 ＋ 마지막에 2×2 타일 1개를 놓는 경우
        dp[i] = dp[i-1] + dp[i-2] +dp[i-2]

    print(dp[n]%10007)
    




if __name__ == "__main__":
    main()
