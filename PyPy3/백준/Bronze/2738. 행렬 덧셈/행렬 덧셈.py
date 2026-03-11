def solution():
    N,M = map(int,(input().split()))
    matrix_A = [list(map(int,input().split())) for _ in range(N)]
    matrix_B = [list(map(int,input().split())) for _ in range(N)]
    matrix_AB = []

    for row_A, row_B in zip(matrix_A,matrix_B):
         row_AB = []
         for a, b in zip(row_A,row_B):
              row_AB.append(a + b)

         matrix_AB.append(row_AB)

    print("\n".join(" ".join(map(str, row)) for row in matrix_AB))
    



solution()