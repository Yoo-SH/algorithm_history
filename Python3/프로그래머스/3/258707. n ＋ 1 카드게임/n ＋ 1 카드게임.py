# 그리디로, 가면 될거 같은데.. 
## 코인을 최소화하면서 다음 라운드 가기
## 1. 내 카드로만 가기. 2. 카드 1개만 뽑아서 가기. 3. 카드 2개 뽑아서 가기
from collections import deque
from itertools import combinations
def solution(coin, cards):
    # 카드를 deque로 변경하고, 초기화
    target = len(cards) +1
    my_cards = set(cards[:(len(cards)//3)])
    deck = deque(cards[(len(cards)//3):])
    candidate = set()
    round_stage = 1 
    
    # 카드를 2장뽑고, 2장을 내서 다음 라운드 갈 수 있을지 결정
    while deck:
        
        if len(deck) >=2:
            candidate.add(deck.popleft())
            candidate.add(deck.popleft())
        else:
            break
        
        played = False
            
        # 내 카드로만 갈 수 있는지 확인
        for x in list(my_cards):
            y = target -x
            if y in my_cards and x != y:
                my_cards.remove(x)
                my_cards.remove(y)
                played = True
                break
                
        if played:
            round_stage +=1
            continue
            
        # 후보 카드 1개로 가는지
        if coin >=1:
            for x in list(my_cards):
                y = target -x
                if y in candidate:
                    my_cards.remove(x)
                    candidate.remove(y)
                    coin -=1 
                    played = True
                    break
                    
        if played:
            round_stage +=1
            continue
        
        # 후보 카드 2개로 가는지
        if coin >=2:
            for x in list(candidate):
                y = target - x
                if y in candidate and y !=x:
                    candidate.remove(x)
                    candidate.remove(y)
                    coin -=2
                    played = True
                    break
        if played:
            round_stage +=1
            continue
        
        # 못 내면 종료
        return round_stage
            
    return round_stage 