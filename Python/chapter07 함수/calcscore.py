def calcscore(name, *score, **option): # 위치 인수, 가변 인수, 키워드 가변 인수
    print(name)
    sum = 0
    for s in score:
        sum += s
    print("총점 : ", sum)
    if(option["avg"] == True):  # 키워드 가변 인수 사용하므로 값 넘어와야 함
        print("평균 : ", sum / len(score))
    else:
        print("평균 옵션이 없습니다.")

calcscore("원종아", 88, 99, 77, avg = True)
calcscore("엄경식", 100, 23, 55, 65, avg = False)