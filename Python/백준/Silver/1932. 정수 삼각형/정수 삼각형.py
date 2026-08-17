## 이게 왜 DP지..

def solution():
    n = int(input())
    triangle = [list(map(int,input().split())) for _ in range(n)]
    dp = [[0] * len(row) for row in triangle]

    dp[0][0] = triangle[0][0]

    for idx_y in range(1,n):
        for idx_x, val in enumerate(triangle[idx_y]):

            # 왼쪽 끝
            if idx_x == 0: 
                dp[idx_y][idx_x] = triangle[idx_y][idx_x] + dp[idx_y-1][idx_x]
            # 오른쪽 끝
            elif idx_x == len(triangle[idx_y])-1:
                dp[idx_y][idx_x] = triangle[idx_y][idx_x] + dp[idx_y-1][idx_x-1]
            else:
                dp[idx_y][idx_x] = triangle[idx_y][idx_x] + max(dp[idx_y-1][idx_x-1], dp[idx_y-1][idx_x])
            
    
    print(max(max(dp,key=sum)))
    




solution()