import sys
from collections import deque
input = sys.stdin.readline

# 제한시간 6초, 0<= A,B < 10,000
## A를 B로 만들어야함. 4가지 경우의 수가 있음.
### A가 B가 되기위한 최소한의 명령어 나열 케이스를 입력해야함 -> BFS탐색
def main():
    test_case = int(input())
    commands = ['D','S','L','R']

    for _ in range(test_case):
        A, B = map(int, input().split())
        queue = deque()
        is_calculed = set()

        queue.append((A, ""))
        is_calculed.add(A)

        while queue:
            A, commanded_str = queue.popleft()

            for command in commands:
                if command == 'D':
                    next_A = (A * 2) % 10000

                elif command == 'S':
                    if A == 0:
                        next_A = 9999
                    else:
                        next_A = A - 1
                elif command == 'L':
                    s = f"{A:04d}"
                    next_A = int(s[1:] + s[0])

                elif command == 'R':
                    s = f"{A:04d}"
                    next_A = int(s[-1] + s[:-1])
                    
                ## 조건 만족시 탈출
                if next_A == B:
                    print(commanded_str+command)
                    queue.clear()
                    break
                
                if next_A not in is_calculed:
                    is_calculed.add(next_A)
                    queue.append((next_A,commanded_str+command))


if __name__ == "__main__":
    main()
