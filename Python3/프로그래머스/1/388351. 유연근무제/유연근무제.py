## 1 ≤ schedules의 길이 = n ≤ 1,000, timelogs[i]의 길이 = 7 ,1 ≤ timelogs의 길이 = n ≤ 1,000
## 완전탐색으로 가도 무방한 숫자인듯


def solution(schedules, timelogs, startday):
    result = 0
    #틀리는 케이스가 있는 이유가 뭘까.
    ## 시간 문제는 단위 때문에 분으로 전부 환산해버리자
    
    # 직원마다 제대로 출근하는지 카운트
    for idx_i, schedule in enumerate(schedules):
        # 시간을 전부 분으로 환산
        schedule = schedule // 100 * 60 + schedule % 100
        now_day = startday
        is_ok = True
        # startday부터 일주일 체크
        for timelog in timelogs[idx_i]:
            timelog = timelog//100 * 60 + timelog % 100
            print(idx_i, timelog,schedule+10, now_day, is_ok)
            
            # nowDay가 6,7인 경우에는 계산하지 않는다.
            if now_day == 6 or now_day == 7:                
                now_day = (1 if (now_day+1) % 8 == 0 else (now_day+1) % 8)    
                continue
            
            if timelog > schedule + 10:
                is_ok = False
                print(idx_i, timelog,schedule+10, now_day, is_ok)
                break
            now_day = (1 if (now_day+1) % 8 == 0 else (now_day+1) % 8)
            
        if is_ok:
            result +=1

    return result