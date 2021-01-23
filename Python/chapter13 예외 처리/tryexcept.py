str = "89점"
try:
    score = int(str)
    print(score)
except: # 예외 타입을 지정하지 않았으므로 모든 예외를 다 나타낸다.
    print("예외가 발생했습니다.")
print("작업완료")