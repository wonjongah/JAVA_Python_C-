for x in range(1, 51):
    if(x % 10 == 0):
        print("+", end = "")
    else:
        print("-", end = "")
print()

# 반복 대상을 크게 단위별로 끊으면 밑의 코드로 간단하게 변환 가능

for x in range(1, 6):
    print("-" * 9, end = "")
    print("+", end = "")