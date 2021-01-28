from itertools import combinations_with_replacement

n = list(combinations_with_replacement("ABCD", 2))
print(n)
print("ABCD 중 2개의 요소로 나열할 수 있는 경우의 수 :", len(n))