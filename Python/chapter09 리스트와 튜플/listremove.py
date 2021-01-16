score = [55, 77, 27, 100, 84, 25, 84, 50, 72]
score.remove(100) # 100 값을 가진 요소 삭제
# score.remove(1) # 값이 없다면 ValueError: list.remove(x): x not in list 에러
print(score)
del(score[2]) # 2인덱스의 값 삭제
print(score)
score[1:4] = [] # 인덱스 1~3까지 삭제
print(score)
score.clear()
print(score)