from collections import defaultdict
import math
def solution(fees, records):
    base_time = int(fees[0])
    base_price = int(fees[1])
    over_time = int(fees[2])
    over_price = int(fees[3])
    
    car_in_dict = defaultdict(list) # car_num, time
    car_out_dict = defaultdict(list)
    car_total_time = defaultdict(int)
    car_settlement = defaultdict(int) # car_num, price
    
    # 하루 2회이상 왔다갔다 하는 경우도 고려해야함
    for record in records:
        time, car_num, in_out_type = record.split()
        h, m = map(int,time.split(":"))
        time = h* 60 + m # 최소 단위로 시간 통일
        
        if in_out_type == "IN":
            car_in_dict[car_num].append(time)
        else:
            car_out_dict[car_num].append(time)
    
    
    # in, out 크기가 맞지 않는 경우
    for car in car_in_dict.keys():
        if len(car_in_dict[car]) != len(car_out_dict[car]):
            car_out_dict[car].append(23 * 60 + 59)
        
    # 정산
    for car in car_in_dict.keys():
        # 누적시간 계산
        for car_in_time, car_out_time in zip(car_in_dict[car], car_out_dict[car]):
            print(car_out_time - car_in_time)
            car_total_time[car] += car_out_time - car_in_time
            
            
        if car_total_time[car] <= base_time: # 주차시간이 기본 시간이라면
            total_price = base_price
            car_settlement[car] = total_price
        else:
            total_price = base_price + math.ceil((car_total_time[car]-base_time)/over_time)*over_price
            car_settlement[car] = total_price
    
    
    result = []
    
    for car_num, val in sorted(list(car_settlement.items()),key=lambda x: x[0]):
        result.append(val)
    
    return result