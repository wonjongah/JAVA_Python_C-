def calcsum(n):
    sum = 0
    for num in range(n+1):
        sum += num
    return sum

print("~4 = ", calcsum(4))
print("~10 = ", calcsum(10))