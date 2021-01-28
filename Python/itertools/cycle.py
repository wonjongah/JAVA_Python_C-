from itertools import cycle

# print(list(cycle("ABC"))) # A B C A B C ... 무한 반복

for n, i in zip(cycle(range(2)), "abcd"):
    print(f"{n}, {i}")