import sys
import math
input = sys.stdin.readline

# 시간 제한 0.5, 1<= n <= 50,000
## 1자리, 2자리, 3자리, 4자리 제곱의 합이 되는 모든 경우의 수를 구하는 방식으로 가도 시간 내에 도달
def main():
    N = int(input())
    limit = int(N**0.5) + 1

    # 1자리인 경우
    for i in range(1,limit):
        if N == i ** 2:
            print(1)
            return 
    
    ## 2자리인 경우
    for i in range(1,limit):
        for j in range(1,limit):
            if N == j **2 + i ** 2:
                print(2)
                return
    
    ### 3자리인 경우
    for i in range(1, limit):
        for j in range(1, limit):
            for k in range(1, limit):
                if N == k**2 +j**2 +i**2:
                    print(3)
                    return
    
    ## 모든 자연수는 최대 4개의 제곱수 합으로 표현 가능
    print(4)
    return 

if __name__ == "__main__":
    main()
