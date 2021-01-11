def calcstep(begin, end, step):
    sum = 0
    for num in range(begin, end + 1, step):
        sum += num
    return sum

print("3~5=", calcstep(3, 5, 1)) # 위치 기반 호출만
print("3~5=", calcstep(begin = 3, end = 5, step = 1)) # 키워드만, 키워드는 순서 상관 X
print("3~5=", calcstep(end = 5, step = 1, begin = 3))
print("3~5=", calcstep(3, 5, step = 1)) # 혼용, 반드시 위치 기반 먼저 해석, 그 다음 키워드 방식
print("3~5=", calcstep(3, step = 1, end = 5))
