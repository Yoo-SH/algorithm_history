def solution():
    L,P = map(int, input().split())
    newpaper =list(map(int,input().split()))
    result = []
    for person in newpaper:
        result.append(person-L*P)
    print(" ".join(map(str,result)))

solution()

# 코드 리뷰
"""
코드 자체는 **정답을 정확히 맞히는 깔끔한 풀이**입니다. 다만, 코딩테스트 관점에서 몇 가지 개선 포인트를 짚어보겠습니다.

---

## ✅ 1. 로직 검증

문제 핵심:

* 1m²당 사람 수 = `L`
* 파티장 넓이 = `P`
* **전체 인원 수 = L × P**
* 신문 기사 값과 실제 값의 차이 출력

당신 코드의 핵심 계산:

```python
person - L * P
```

👉 문제 요구와 **완전히 일치**합니다.
👉 시간복잡도도 O(5) → 사실상 O(1)

✔️ 로직은 완벽합니다.

---

## ⚠️ 2. 개선 포인트

### (1) 불필요한 리스트 생성

```python
result = []
for person in newpaper:
    result.append(person-L*P)
```

→ 이건 **파이썬스럽지 않은 코드**

👉 이유:

* append 반복 → 불필요
* 한 줄로 표현 가능

---

### (2) 더 좋은 방식 (리스트 컴프리헨션)

```python
result = [person - L * P for person in newpaper]
```

👉 장점:

* 코드 길이 ↓
* 가독성 ↑
* 파이썬 스타일

---

### (3) 변수명 개선

```python
newpaper → newspaper
```

👉 오타 수준이라지만 실무에서는 중요함

---

## ✨ 3. 더 깔끔한 최종 코드

```python
def solution():
    L, P = map(int, input().split())
    newspaper = list(map(int, input().split()))
    
    total = L * P
    result = [x - total for x in newspaper]
    
    print(" ".join(map(str, result)))

solution()
```

---

## 🔥 4. 한 단계 더 (고수 스타일)

리스트조차 안 만들고 바로 출력 가능:

```python
def solution():
    L, P = map(int, input().split())
    total = L * P
    
    print(*[x - total for x in map(int, input().split())])
```

👉 핵심 포인트:

* `map(int, input().split())` 바로 사용
* `print(*list)` → 자동 공백 출력

---

## 💡 총평

* ✔️ 문제 이해: 정확
* ✔️ 구현: 깔끔
* ✔️ 시간복잡도: 최적
* ⚠️ Pythonic 개선 여지 있음

👉 결론:

> **"정답 코드 + 약간의 스타일 개선으로 상위 10% 코드 가능"**

---

원하면
👉 이 문제를 “왜 이런 형태로 출제됐는지 (출제 의도)”
👉 비슷한 문제 (브론즈~실버)
도 같이 정리해줄게.

"""
