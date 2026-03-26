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
from collections import deque

def solution():
    N = int(input().strip())
    vector = [(-1,0),(0,-1),(1,0),(0,1)]
    matrix = [list(map(int, input().split())) for _ in range(N)]

    shark_size = 2
    fish_num = 0
    eaten_count = 0
    total_time = 0

    for y, row in enumerate(matrix):
        for x, val in enumerate(row):
            if val not in [0, 9]:
                fish_num += 1
            if val == 9:
                shark_y, shark_x = y, x
                matrix[y][x] = 0

    while fish_num > 0:
        eatable_fish = []
        is_visited = set()
        is_visited.add((shark_y, shark_x))
        queue = deque([(shark_y, shark_x, 0)])  # 매번 새로 생성, dist=0부터

        while queue:
            cy, cx, dist = queue.popleft()

            for dy, dx in vector:
                ny, nx = cy + dy, cx + dx

                if 0 <= ny < N and 0 <= nx < N and (ny, nx) not in is_visited:
                    if matrix[ny][nx] == 0 or shark_size == matrix[ny][nx]:
                        queue.append((ny, nx, dist + 1))
                        is_visited.add((ny, nx))
                    elif 0 < matrix[ny][nx] < shark_size:
                        eatable_fish.append((ny, nx, dist + 1))
                        queue.append((ny, nx, dist + 1))
                        is_visited.add((ny, nx))
                    # shark_size < matrix[ny][nx]: 지나갈 수 없음

        if eatable_fish:
            eatable_fish.sort(key=lambda x: (x[2], x[0], x[1]))
            fy, fx, fd = eatable_fish[0]
            matrix[fy][fx] = 0
            shark_y, shark_x = fy, fx
            total_time += fd
            fish_num -= 1
            eaten_count += 1
            if eaten_count == shark_size:
                shark_size += 1
                eaten_count = 0
        else:
            break

    print(total_time)

solution()