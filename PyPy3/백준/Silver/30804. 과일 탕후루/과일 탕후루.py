import sys
from collections import deque, defaultdict
input = sys.stdin.readline

# 시간 제한 2, 1<= n <= 200,000
## 과일의 종류는 총 9개
## O(n^2) 알고리즘 사용시 시간초과, 
### 슬라이싱 윈도우 사용하기
def main():
    N = int(input())
    stick = list(map(int, input().split()))

    left = 0
    count = defaultdict(int)
    result = 0

    for right in range(N):
        count[stick[right]] += 1   # 오른쪽 확장

        while len(count) > 2:      # 과일이 3종류면
            count[stick[left]] -= 1
            if count[stick[left]] == 0:
                del count[stick[left]]
            left += 1              # 왼쪽 줄이기

        result = max(result, right - left + 1)

    print(result)
if __name__ == "__main__":
    main()
