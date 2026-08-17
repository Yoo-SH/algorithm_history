def solution():
    T = int(input().strip())

    for _ in range(T):
        n = int(input().strip())
        n = format(n,"b")
        n = n[::-1]
        for idx, char in enumerate(n):
            if char == "1":
                print(idx, end=" ")

solution()