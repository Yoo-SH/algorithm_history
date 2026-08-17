# 가장 작은 단위(분)로 환산하여 계산하여 정확성을 높인다!
def solution():
    A, B = map(int, input().split())
    C = int(input().strip())
    now = A * 60 + B
    end = now + C

    # end를 시와 분으로 다시 환산
    H = end // 60 % 24
    M = end % 60
    print(H,M)


solution()