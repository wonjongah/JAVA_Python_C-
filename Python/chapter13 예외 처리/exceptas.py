str = "89점"
try:
    score = int(str) # ValueError
    print(score)
    a = str[5]
except ValueError as e:
    print(e)
except IndexError as e:
    print(e)
print("작업 완료")