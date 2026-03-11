def solution():
    T = int(input().strip())

    for t in range(T):
        input_nums = map(int,input().split())
        A,B = input_nums
        print(A+B)

solution()