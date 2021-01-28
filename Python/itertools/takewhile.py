from itertools import takewhile

print(list(takewhile(lambda x: x < 5, [1, 2, 3, 6, 5, 4, 3, 2, 1])))