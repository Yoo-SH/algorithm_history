# 제한 시간 2초, O(n) 이하 알고리즘으로 가면 완전탐색 가능20
def solution():
    E,S,M =map(int,input().split())

    year = 1
    e,s,m = 1,1,1

    while not (E == e and S == s and M ==m):
        m = 1 if (m + 1) % 20 == 0 else (m + 1) % 20
        s = 1 if (s + 1) % 29 == 0 else (s+1) % 29
        e = 1 if (e + 1) % 16 == 0 else (e +1) % 16
        
        year +=1

    print(year)
    return 
solution()
