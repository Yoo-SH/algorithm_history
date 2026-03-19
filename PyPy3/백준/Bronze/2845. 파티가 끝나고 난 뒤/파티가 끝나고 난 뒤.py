def solution():
    L,P = map(int, input().split())
    newpaper =list(map(int,input().split()))
    result = []
    for person in newpaper:
        result.append(person-L*P)
    print(" ".join(map(str,result)))

solution()