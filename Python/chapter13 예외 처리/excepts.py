str = "89"
try:
    score = int(str)
    print(score)
    a = str[5] # IndexError
except ValueError:
    print("정수의 형식이 잘못되었습니다.")
except IndexError:
    print("첨자의 범위를 벗어났습니다.")
print("작업 완료")