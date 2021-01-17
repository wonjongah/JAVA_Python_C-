import time

def gettime():
    now = time.localtime()
    return now.tm_hour, now.tm_min
    # 두 개의 값 리턴, 튜플로 묶어 반환

result = gettime()
# hour, min = gettime()
print("지금은 %d시 %d분입니다" % (result[0], result[1]))