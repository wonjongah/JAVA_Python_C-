from itertools import tee

a1, a2 = tee(range(10), 2)

print(list(a1))
print(list(a1))
print(list(a2))
print(list(a2))