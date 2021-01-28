from itertools import chain, repeat

n = [1, 2, 3]
print(list(chain.from_iterable(repeat(n, 3))))