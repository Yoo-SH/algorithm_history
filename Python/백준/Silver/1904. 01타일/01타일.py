# 제한 시간 0.75초
## DP인 근거 N자리 숫자에서 특정 자리를 만드는 경우의 수는 이전 1자리 수에 영향을 받고, 계산이 중복적으로 반복되기 때문?
def solution():
    N = int(input().strip())    
    dp = [0] * (N+1) # 만들 수 있는 최대 경우의 수

    if N == 1:
        print(1)
        return
    if N == 2:
        print(2)
        return 

    dp[1] = 1
    dp[2] = 2

    ## 선택지 00고르는 경우 경우의 수 and 1 고르는 경우의 수
    for i in range(3,N+1):
        dp[i] = (dp[i-2] + dp[i-1]) % 15746
    
    print(dp[N])
    return

solution()
