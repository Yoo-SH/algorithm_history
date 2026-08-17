parent = []

def find(x):
    global parent
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]
    

def union(a,b):
    global parent

    root_A = find(a)
    root_B = find(b)

    if root_A != root_B:
        parent[root_B] = root_A


def solution():
    global parent
    N = int(input().strip())
    M = int(input().strip())
    parent = [i for i in range(N+1)]

    for city in range(1,N+1):
        input_list = list(map(int,input().split()))
        for idx, val in enumerate(input_list):
            if val == 1:
                union(city,idx+1)
    
    city_plan_list = list(map(int, input().split()))
    # 연결되지 않은 도시가 있는지 확인하고, 연결되지 않은 도시(같은 집합이 아닌)가 있다면 "NO" 없다면 "YES"
    root_a = find(city_plan_list[0])
    is_yes = True
    for city in city_plan_list:
        root_b = find(city)
        if root_a != root_b:
            is_yes = False
            break
    
    if is_yes:
        print("YES")
    else:
        print("NO")

solution()