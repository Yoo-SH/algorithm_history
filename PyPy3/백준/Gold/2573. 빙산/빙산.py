"""
면접 코드 리뷰(정답 case)
1. 왜 이렇게 구현했는지
2. 이렇게 구현했을 때의 문제점이 무엇이고 그 문제점을 해결하려면 어떻게 해야 하는지
3. 시간 복잡도에 설명할 수 있는지
4. 해결 방법을 적용했을 때의 Trade-off가 무엇인지 등 꼬리 질문
* 힌트도 주고, 꼬리 질문들에 대한 내 생각을 토론처럼 이야기하도록 유도

면접 코드 리뷰(오답 case)
1. 어떤 접근으로 풀었고, 왜 그 방법을 선택했는지
2. 어디서 틀렸는지 스스로 찾아보기 (반례 제시 유도)
3. 틀린 원인이 구현 실수인지, 접근 자체의 오류인지 분류
4. 부분 수정으로 고칠 수 있는지, 전면 재설계가 필요한지 판단
5. 정답 풀이를 본 후, 내 접근과의 차이점 분석
6. 같은 유형 문제에서 이 실수를 반복하지 않으려면? (꼬리 질문)
* 정답을 본 후에  단순히 "아 이거였구나"가 아니라 "내 접근이 왜 안 되는지"를 정확히 설명할 수 있는지 확인하시오.
"""
def solution():
    N, M = map(int,input().split())
    matrix = [ list(map(int,input().split())) for _ in range(N)]

    
    
    year = 0

    # dfs로 탐색 -> unit 갯수 2개 여부확인 -> 완전탐색 갱신 반복
    while True:
        
        dfs_count = 0
        vector = [(-1,0),(1,0),(0,-1),(0,1)]
        stack = []
        is_visited = set()
        
        
        for y, row in enumerate(matrix):
            for x, value in enumerate(row):
                if value != 0 and (y,x) not in is_visited:
                    stack.append((y,x))
                    is_visited.add((y,x))
                    dfs_count +=1

                    while stack:
                        cy, cx = stack.pop()

                        for dy,dx in vector:
                            ny,nx=cy+dy,cx+dx
                            if 0<=ny<N and 0<=nx<M and (ny,nx) not in is_visited:
                                if matrix[ny][nx] > 0:
                                    is_visited.add((ny,nx))
                                    stack.append((ny,nx))
        
        
        if dfs_count == 0:
            print(0)
            return
        
        if dfs_count >= 2:
            print(year)
            return

        # 완전탐색으로 녹일 빙하 카운트
        melt = [[0] *M for _ in range(N)]
        for y, row in enumerate(matrix):
            for x, value in enumerate(row):
                if value >0:                    
                    for dy,dx in vector:
                        ny,nx=y+dy,x+dx
                        if 0<=ny<N and 0<=nx<M and matrix[ny][nx] == 0:
                            melt[y][x] +=1
        
        # 빙하 녹이기
        for y, row in enumerate(matrix):
            for x, value in enumerate(row):
                matrix[y][x] = max(0,matrix[y][x]-melt[y][x])

        #print(matrix)
        
        year +=1

solution()