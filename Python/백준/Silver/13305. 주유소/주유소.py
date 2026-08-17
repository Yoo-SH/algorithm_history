def solution():
    N = int(input().strip())
    roads = list(map(int,input().split()))
    oil_node =list( map(int,input().split()))
    min_oil_node = oil_node[0]
    result =0

    for idx, road in enumerate(roads):
        if min_oil_node > oil_node[idx]:
            min_oil_node = oil_node[idx]

        result += road * min_oil_node
    
    print(result)

        
solution()