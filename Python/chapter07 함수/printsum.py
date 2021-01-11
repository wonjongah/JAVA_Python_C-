def printsum(n):
    sum = 0
    for num in range(n + 1):
        sum += num
    print("~", n, "=", sum) 
    # 유연성 떨어짐

printsum(4)