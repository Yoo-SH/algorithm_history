import sys
from collections import deque
input = sys.stdin.readline

# 제한시간 1초, 최대 1,000,000글자
## 선행적으로 계산해도 될듯 조합론?
def main():
    cd_list = list(input().strip())
    result = 1
    prev_element = ''
    MOD = 1000000009


    for element in cd_list:
        if element == 'c' and prev_element != 'c':
            result = (result * 26) % MOD
            prev_element = 'c'
        elif element == 'c' and prev_element == 'c':
            result = (result * 25) % MOD
            prev_element = 'c'
        elif element == 'd' and prev_element != 'd':
            result = (result * 10) % MOD
            prev_element ='d'
        elif element == 'd' and prev_element == 'd':
            result = (result *  9) % MOD
            prev_element ='d'
        

    print(result)    

if __name__ == "__main__":
    main()