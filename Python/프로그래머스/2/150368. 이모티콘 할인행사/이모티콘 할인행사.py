# 이모티콘 할인율을 적용시켜 플러스 가입자를 최대한 늘리면서, 이모티콘 판매액 또한 최대로 늘렸을 때 해당 플러스 가입자와 이모티콘 판매액을 return 하여라(1. 플러스 가입자 수가 제일 많은 것. 2. 이후 판매액이 제일 많은 것)
## 제한시간 없음, 1 <= user <= 100, <emoticons 길이 <= 7
## 이모티콘마다 할인율은 다를 수 있으며, 할인율은 10%, 20%, 30%, 40% 중 하나로 설정됩니다
## 모든 경우의 수를 고려하여 최적의 경우의 수(1플러스 가입자가 많은것 2. 판매액 많은 것)을 골라야하겠군


from itertools import product
def solution(users, emoticons):
    
    # 이모티콘 각각의 할인율 조합
    result = []
    for discount_case in list(product([10,20,30,40], repeat=len(emoticons))):
        user_result = []
        for user_want_discount, user_subscription in users:
            # 유저가 모든 이모지를 구매
            user_purchase_sum = 0
            is_subscriptioned = False
            for idx, emoticon_distcount_rate in enumerate(discount_case):
                if emoticon_distcount_rate >= user_want_discount:
                    user_purchase_sum +=  emoticons[idx] * (100 - emoticon_distcount_rate) // 100
            
            # 유저 구매 금액이 구독 하한선을 넘었다면
            if user_purchase_sum >= user_subscription:
                is_subscriptioned = True
                user_purchase_sum = 0
        
            user_result.append((is_subscriptioned,user_purchase_sum))
        
        # 모든 유저의 구독 수 합과, 구매 금액 합
        subscription_user_count = sum(is_subscriptioned for is_subscriptioned, user_purchase_sum in user_result)
        emoticon_sell_sum = sum(user_purchase_sum for is_subscriptioned, user_purchase_sum in user_result)
        result.append((subscription_user_count,emoticon_sell_sum))
    
    # 내림차순 정렬
    # 1,모든 케이스에 대해 구독수 최대값
    # 2.구매금액 합 최대값 
    result.sort(key= lambda x:(x[0],x[1]), reverse=True)
        
            
    return result[0]