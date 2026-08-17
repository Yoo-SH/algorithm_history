import sys
input = sys.stdin.readline

def main():
    M, N = map(int, input().split())

    matrix = [[0]*N for _ in range(M)]

    # 시계방향
    vector = [(0,1), (1,0), (0,-1), (-1,0)]
    d = 0  # 현재 방향 인덱스

    y, x = 0, 0
    matrix[y][x] = 1

    turn_count = 0
    total = M * N

    for _ in range(total - 1):
        ny = y + vector[d][0]
        nx = x + vector[d][1]

        if 0 <= ny < M and 0 <= nx < N and matrix[ny][nx] == 0:
            y, x = ny, nx
            matrix[y][x] = 1
        else: # 
            d = (d + 1) % 4
            turn_count += 1
            y += vector[d][0]
            x += vector[d][1]
            matrix[y][x] = 1

    print(turn_count)

if __name__ == "__main__":
    main()
