import sys
input = sys.stdin.readline

# 제한시간 1초, 1<= N <= 100
## 구역마다 카운트이므로 dfs방식으로 카운트
### N이 100이므로 시작점은 전부 순회하면서 DFS를 하며 영역을 개수 체크하기
def main():
    N = int(input())

    matrix = [list(input().strip()) for _ in range(N)]
    vector = [(-1,0),(1,0),(0,1),(0,-1)]
    is_visited = set()
    stack = []
    
    RGB_human_area = 0
    RB_human_area = 0
    
    ## RGB 휴먼 영역 카운트
    for y, row in enumerate(matrix):
        for x, color in enumerate(row):
            
            if (y,x) not in is_visited:
                is_visited.add((y,x))
                stack.append((y,x,color))
                RGB_human_area += 1

                while stack:
                    cy,cx, area_color = stack.pop()

                    for dy, dx in vector:
                        ny, nx = cy + dy, cx +dx
                        if 0 <= ny < N and 0 <= nx < N and (ny,nx) not in is_visited:
                            if matrix[ny][nx] == area_color:
                                is_visited.add((ny,nx))
                                stack.append((ny,nx,area_color))
                    
    is_visited.clear()

    ## RB 휴먼 영역 카운트
    for y, row in enumerate(matrix):
        for x, color in enumerate(row):
            
            if (y,x) not in is_visited:
                is_visited.add((y,x))
                stack.append((y,x,color))
                RB_human_area += 1

                while stack:
                    cy,cx, area_color = stack.pop()

                    for dy, dx in vector:
                        ny, nx = cy + dy, cx +dx
                        if 0 <= ny < N and 0 <= nx < N and (ny,nx) not in is_visited:
                            if area_color in ['R','G']:
                                if matrix[ny][nx] in['R','G']:
                                    is_visited.add((ny,nx))
                                    stack.append((ny,nx,area_color))
                            elif matrix[ny][nx] == area_color:
                                is_visited.add((ny,nx))
                                stack.append((ny,nx,area_color))
                

    print(RGB_human_area, RB_human_area)
if __name__ == "__main__":
    main()