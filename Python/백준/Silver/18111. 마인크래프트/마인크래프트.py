import sys
input = sys.stdin.readline

def main():
    N, M, B = map(int, input().split())
    matrix = [list(map(int, input().split())) for _ in range(N)]

    min_h = min(map(min, matrix))
    max_h = max(map(max, matrix))

    time_min = float('inf')
    result_h = 0

    for target_h in range(min_h, max_h + 1):
        time_sum = 0
        inventory = B

        for y, row in enumerate(matrix):
            for x, h in enumerate(row):
                if target_h > h:  # 쌓기
                    time_sum += (target_h - h)
                    inventory -= (target_h - h)
                elif target_h < h:  # 파기
                    time_sum += (h - target_h) * 2
                    inventory += (h - target_h)

        if inventory < 0:
            continue  # 블록 부족하면 불가능한 높이

        if time_min > time_sum or (time_min == time_sum and result_h < target_h):
            time_min = time_sum
            result_h = target_h

    print(time_min, result_h)

if __name__ == "__main__":
    main()
