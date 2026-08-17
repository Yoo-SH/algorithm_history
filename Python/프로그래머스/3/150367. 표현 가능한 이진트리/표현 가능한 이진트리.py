# 파이썬에서 이진 트리 만들기
# 십진수 -> 이진수로 변환 -> 이진 트리로 표현할 수 있는가?
def check_binary_tree(bianry_number):
    if len(bianry_number) ==1:
        return True
    
    middle = len(bianry_number)//2
    
    root = bianry_number[middle]
    left = bianry_number[:middle]
    right = bianry_number[middle+1:]
    
    if root == '0' and ('1' in left or '1' in right):
        return False
    
    return check_binary_tree(left) and check_binary_tree(right)
        
    

def solution(numbers):
    result = []
    
    for n in numbers:
        # 이진수로 변환하는 함수를 만들어야함.
        bianry_number = bin(n)[2:]
        lenth = len(bianry_number)
        h=1
        
        # 현재 이진수 길이(length)를 담을 수 있는 최소 포화 이진트리 크기 찾기
        while 2**h-1 < lenth:
            h+= 1
        
        # 포화 이진트리에 맞게 zfill하기 0001이나 1이나 크기 동일 (ex) 2^3*0 +2^2*0 +2^1*0 +2^0*1)
        tree_lenth = 2**h-1
        bianry_number = bianry_number.zfill(tree_lenth) 
        
        result.append(1 if check_binary_tree(bianry_number) else 0)
    
        
    return result