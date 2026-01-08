import sys
input = sys.stdin.readline

def main():
    N, M = map(int, input().split())
    tree_list = list(map(int, input().split()))
    
    left, right = 0, max(tree_list)
    result = 0  # 정답을 저장할 변수

    while left <= right:
        target = (left + right) // 2
        total = 0

        # target 높이로 잘랐을 때 가져갈 수 있는 나무 길이
        for tree in tree_list:
            if tree > target:
                total += tree - target

        # 이분 탐색 조건
        if total >= M:  # 충분히 가져갈 수 있음
            result = target  # 현재 높이를 저장
            left = target + 1  # 더 높은 높이 시도
        else:  # 부족함
            right = target - 1  # 더 낮은 높이 시도

    print(result)

if __name__ == "__main__":
    main()