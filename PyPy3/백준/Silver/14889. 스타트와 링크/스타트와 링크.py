# 제한 시간 2초, N(4 ≤ N ≤ 20, N은 짝수)
## 완전탐색도 가능
from itertools import combinations,permutations
def solution():
    N = int(input().strip())
    lineup = [i for i in range(N)]
    matrix = [list(map(int, input().split())) for _ in range(N)] 

    start_team_combi = list(combinations(lineup,N//2))
    result = float('inf')

    # start_team 조합에 따른 start_team, link_team 초기화
    for start_team in start_team_combi:
        start_team = list(start_team)
        link_team = []
        for i in lineup:
            if i not in start_team:
                link_team.append(i)

        # 팀 점수를 측정하기 위한 완전탐색
        start_team_score =0
        link_team_score =0

        for a,b in combinations(start_team,2):
            start_team_score += matrix[a][b] + matrix[b][a]
        for a,b in combinations(link_team,2):
            link_team_score += matrix[a][b] + matrix[b][a]
        
        if result > abs(start_team_score-link_team_score):
            result = abs(start_team_score-link_team_score)
        
    print(result)
    return 
solution()
