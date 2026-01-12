import sys
input = sys.stdin.readline

def main():
    S_1, S_2 = map(int,input().split())
    S_1_right_answer_count = 0
    S_2_right_answer_count = 0
    
    for _ in range(S_1):
        right_answer,  answer= map(int,input().split())
        if answer == right_answer:
            S_1_right_answer_count +=1
    
    for _ in range(S_2):
        right_answer, answer = map(int,input().split())
        if answer == right_answer:
            S_2_right_answer_count +=1

    if S_1_right_answer_count == S_1:
        print("Accepted")
    elif S_1_right_answer_count < S_1:
        print("Wrong Answer")
    elif S_1_right_answer_count == S_1 and S_1_right_answer_count < S_2:
        print("Why Wrong!!!")
        

if __name__ == "__main__":
    main()
