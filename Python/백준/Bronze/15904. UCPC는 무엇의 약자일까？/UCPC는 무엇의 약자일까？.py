import sys
input = sys.stdin.readline

#제한시간 1초
## 소문자 전부 제거
## 연결리스트 형식으로 순서가 지켜져야함. 중간에 여러 문자 중복된 경우도 고려
def main():
    s = input().strip()
    target = "UCPC"
    idx = 0

    for char in s:
        if char == target[idx]:
            idx += 1
        if idx == 4:
            break

    if idx == 4:
        print("I love UCPC")
    else:
        print("I hate UCPC")

if __name__ == "__main__":
    main()