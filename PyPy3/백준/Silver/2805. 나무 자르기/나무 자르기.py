import sys
input = sys.stdin.readline

# 제한 시간 1초, (1<= N <= 1,000,000  1<= M <= 2,000,000,000)
## 나무의 길이는 2억 이므로, 자르는 길이를 브루트포스 방식으로 선형적으로 탐색하면 시간초과
## 이분 탐색 방법으로 탐색하면 시간 안에 탐색
### 탐색 지점은 트리의 합계가 최소 M이상이 되는 경계
def main():
    
    N, M = map(int,input().split())
    tree_list = list(map(int,input().split()))
    
    left , right = 0, max(tree_list)

    while left <= right:
        target = (left + right) // 2
        sum = 0

        # target의 값을 계산
        for tree in tree_list:
            if target < tree:
                sum += tree - target

        # tartget 값에 따라 탐색 범위 수정
        if M <= sum:
            result = target  # 현재 높이를 저장
            left = target + 1
        elif M > sum:
            right = target -1

    print(result)

if __name__ == "__main__":
    main()
