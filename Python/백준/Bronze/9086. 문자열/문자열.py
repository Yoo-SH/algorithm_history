def solution():
    T = int(input().strip())

    for t in range(T):
        input_str = input().strip()
        print(f"{input_str[0]}{input_str[-1]}")

solution()