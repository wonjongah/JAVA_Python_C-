def calcsum(n):
    """1 ~ n까지의 합계를 구해 리턴한다."""
    # def 아래 docstring
    sum = 0
    for i in range(n+1):
        sum += i
    return sum

help(calcsum)