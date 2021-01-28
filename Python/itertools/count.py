from itertools import count

# for n in count(10):
#     print(n)

for n, s in zip(count(10), ["a", "b", "c", "d"]):
    print(n, s)

for n, s in zip(count(100, 2), ["e", "f", "g", "h"]):
    print(n, s)