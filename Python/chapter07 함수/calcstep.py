def calcstep(begin, end, step = 1): # step 인수 전달되지 않았다면 1 사용, 아니면 그 값 사용
    sum = 0
    for num in range(begin, end + 1, step):
        sum += num
    return sum

print("1~10", calcstep(1, 10, 2))
print("1~100", calcstep(1, 100))