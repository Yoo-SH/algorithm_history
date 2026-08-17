# 제한 시간 1초
## matrix 영역 개수 구하는 문제랑 동일
## dfs로 탐색하여 영역의 개수를 구함
def solution():
    T = int(input().strip())
    
    for t in range(1,T+1):

        M,N,K = map(int,input().split())
        matrix = [[0] * M for _ in range(N)]

        # dfs 탐색을 위한 stack
        stack = []
        vector = [(-1,0),(1,0),(0,1),(0,-1)]

        # 배추 위치 초기화
        bachoo = []
        for _ in range(K):
            X, Y = map(int, input().split())
            matrix[Y][X] = 1
            bachoo.append((Y,X))
        
        white_bug = 0
        # 저장한 배추 위치에서 dfs시작
        while bachoo:
            y,x = bachoo.pop()
            if matrix[y][x] ==1:
                stack.append((y,x))
                white_bug+=1
                
            # dfs 탐색
            while stack:
                cy,cx = stack.pop()
            
                for dy,dx in vector:
                    ny, nx = cy+dy, cx + dx

                    if 0<= ny < N and 0<= nx <M and matrix[ny][nx] == 1:
                        matrix[ny][nx] = 0
                        stack.append((ny,nx))

        print(white_bug)

    return 

solution()

