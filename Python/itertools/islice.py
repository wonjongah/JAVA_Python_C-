from itertools import islice

s = "ABCDEFG"
print(list(islice(s, 2)))
print(list(islice(s, 2, 4)))
print(list(islice(s, 2, None)))
print(list(islice(s, 0, None, 2)))

for i in islice(range(10), 3, None, 2):
    print(i, end=" ")