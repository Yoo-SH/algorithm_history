import sys
from collections import defaultdict, deque
input = sys.stdin.readline

# 제한시간 1초, N은 1부터 최대 11000개
## 같은 연산이 반복, 브루트포스보다는 다이나믹프로그래밍이 적절한듯
## 직사각형을 채우는 방법의 수. 다운업 방식으로
def main():
    N = int(input().strip())
    dp = [0] * (N+1) # 직사각형을 채우는 방법의 수

    ## 엣지 케이스
    if N == 1:
        print(1)
        return

    #dp 초기화 및 점화식
    dp[1] = 1
    dp[2] = 2
    
    for i in range(3,N+1):
        #맨 오른쪽의 경우가, 세로 블록인 경우와, 가로 블럭인 경우
        dp[i] = dp[i-1] + dp[i-2]
    
    print(dp[N]%10007)

if __name__ == "__main__":
    main()
