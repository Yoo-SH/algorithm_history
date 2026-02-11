import sys
input = sys.stdin.readline
from collections import defaultdict

# 시간 제한 1초, 조합론 문제
## 옷 입는 경우의 수들을 모두 곱하고, 모두 안 입는 경우의 수 1을 뺀다
### ex) (옷 3개 경우의 수 + 안입는 경우 x 모자 2개 경우의 수 + 안 입는 경우) -1 
### (4 x 3) -1
def solution():
    
    T = int(input())

    for _ in range(T):
        n = int(input())
        dict = defaultdict(list)
        for _ in range(n):
            clothes, type = input().split()
            dict[type].append(clothes)

        result = 1
        for key, value_list in dict.items():
            result *= len(value_list)+1
            
        print(result -1)


if __name__ == "__main__":
    solution()
