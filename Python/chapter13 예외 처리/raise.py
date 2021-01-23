def calcsum(n):
    if(n < 0):
        raise ValueError # raise에서의 예외 이름과 except의 예외 이름이 같아야 한다.
    sum = 0
    for i in range(n+1):
        sum = sum + i
    return sum

try:
    print("~10 =", calcsum(10)) # 함수를 이용하는 쪽에서 예외처리를 한다.
    print("~-5 =", calcsum(-5))
except ValueError: # raise에서의 예외 이름과 except의 예외 이름이 같아야 한다.
    print("입력 값이 잘못되었습니다.")