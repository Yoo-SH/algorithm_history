import sys
input = sys.stdin.readline
from collections import deque



count_blue_matrix = 0
count_white_matrix = 0
matrix = [] 


def divide_and_conquer(x,y,size):
    global count_blue_matrix, count_white_matrix

    color = matrix[y][x]
    same = True

    for i in range(y,y+ size):
        for j in range(x,x + size):
            if matrix[i][j] != color:
                same = False
                break
        if not same:
            break

    # 모두 같은 색이면
    if same:
        if color == 0:
            count_white_matrix += 1
        else:
            count_blue_matrix +=1
        return 
    
    # 아니라면 4분할
    half = size //2
    divide_and_conquer(x,y,half)
    divide_and_conquer(x,y+half,half)
    divide_and_conquer(x+half,y,half)
    divide_and_conquer(x+half,y+half,half)


# 분할 정복 방식으로 처리
def solution():
    global matrix

    N = int(input())
    matrix = [list(map(int,input().split())) for _ in range(N)]

    divide_and_conquer(0,0,N)

    print(count_white_matrix)
    print(count_blue_matrix)

if __name__ == "__main__":
    solution()
