import sys
import re

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
        return 



def solution():
    global parent
    n, m = map(int, input().split())
    parent = [i for i in range(n+1)]

    for _ in range(m):
        command, a,b = map(int,input().split())
        if command == 0:
            union(a,b)
        elif command ==1:
            root_A = find(a)
            root_B = find(b)

            if root_A == root_B:
                print("YES")
            else:
                print("NO")

solution()