dp = {}
def w(A,B,C):
    global dp

    if A <=0 or B <=0 or C <=0:
        return 1
    
    if (A,B,C) in dp.keys():
        return dp[(A,B,C)]

    if A > 20 or B >20 or C >20:
        dp[(A,B,C)] = w(20,20,20)
        return dp[(A,B,C)]
    
    if A < B and B < C:
        dp[(A,B,C)] = w(A,B,C-1) + w(A,B-1,C-1) - w(A,B-1,C)
        return dp[(A,B,C)]
    else:
        dp[(A,B,C)] = w(A-1, B, C) + w(A-1, B-1,C) + w(A-1,B,C-1) - w(A-1,B-1,C-1)
        return dp[(A,B,C)]


def solution():

    while True:
        a,b,c = map(int,input().split())

        if a == -1 and b == -1 and c == -1:
            break
        else:
            print(f"w({a}, {b}, {c}) = {w(a,b,c)}")

    return

solution()