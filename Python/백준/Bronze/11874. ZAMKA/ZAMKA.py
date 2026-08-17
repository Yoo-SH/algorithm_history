import sys
input = sys.stdin.readline

#제한시간 1초, 1<=L=<10,000, 1<= D <10,000. 1<= X<=36
## 최악의 경우라도 1초를 초과하는 경우가 발생하지 않음
### 브루트 포스 방식
def main():
   L = int(input())
   D = int(input())
   X = int(input())
   calcul_result = 0 

   min_num = float('inf')
   max_num = -float('inf')

   # 숫자 분해
   for num in range(L,D+1):
       calcul_result = sum(map(int, str(num)))
       if calcul_result == X:
            min_num = min(min_num,num)
            max_num = max(max_num,num)
       
   print(min_num)
   print(max_num)
   


if __name__ == "__main__":
    main()
