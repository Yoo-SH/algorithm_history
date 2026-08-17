import sys
input = sys.stdin.readline

# 시간 제한 2, 4<= N,M <= 500
# 브루트포스 방식으로 모든 경우의 수를 구해도 시간안에 도착
def main():
    N,M = map(int, input().split())

    matrix = [ list(map(int, input().split())) for _ in range(N)]
    max_sum = 0
    tetrominoes = []

    # 모양 종류(회전,대칭 포함)

    ##
    ##
    tetroid_1 = [[(0,0), (0,1), (1,0), (1,1)]] # 원본
    
    ####
    tetroid_2 = [ 
        [(0,0), (0,1), (0,2), (0,3)], # 원본 
        [(0,0), (1,0), (2,0), (3,0)] # 우측 회전 1
    ]

    #
    #
    ##
    tetroid_3 = [
        [(0,0),(1,0),(2,0),(2,1)],# 원본
        [(0,0),(0,1),(0,2),(1,0)],# 우측 회전 1
        [(0,0),(0,1),(1,1),(2,1)],# 우측 회전 2
        [(0,2),(1,0),(1,1),(1,2)],# 우측 회전 3

        [(0,1),(1,1),(2,1),(2,0)], # 대칭
        [(0,0),(1,0),(1,1),(1,2)],# 대칭 우측 회전 1
        [(0,0),(0,1),(1,0),(2,0)],# 대칭 우측 회전 2
        [(0,0),(0,1),(0,2),(1,2)],# 대칭 우측 회전 
    ]
    
    #
    ##
     #
    tetroid_4 = [
        [(0,0),(1,0),(1,1),(2,1)], # 원본
        [(0,1),(0,2),(1,0),(1,1)], # 우측 회전1
        [(0,1),(1,0),(1,1),(2,0)], # 대칭
        [(0,0),(0,1),(1,1),(1,2)] # 대칭 회전1
    ]
    
    ###
     #
    tetroid_5 = [
        [(1,0),(1,1),(1,2),(0,1)],  # ㅜ
        [(0,0),(1,0),(2,0),(1,1)],  # ㅏ
        [(0,0),(0,1),(0,2),(1,1)],  # ㅗ
        [(0,1),(1,0),(1,1),(2,1)],  # ㅓ
    ]
    
    tetrominoes += tetroid_1 + tetroid_2 + tetroid_3 + tetroid_4 + tetroid_5
    
    for dy in range(N):
        for dx in range(M):
            
            for tetroid in tetrominoes:
                sum = 0
                valid_tetriod = True

                for cy, cx in tetroid:
                        ny, nx = cy + dy, cx + dx
                        if 0<= ny < N and 0 <= nx < M:
                            sum += matrix[ny][nx]
                        else:
                             valid_tetriod = False
                             break

                if valid_tetriod:
                    max_sum =max(max_sum,sum)

    print(max_sum)

    
if __name__ == "__main__":
    main()
