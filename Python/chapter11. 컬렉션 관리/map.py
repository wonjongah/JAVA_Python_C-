def half(s):
    return s > 60

score = [45, 76, 88, 12, 65, 83]

print(list(map(half, score)))

for s in map(half, score):
    print(s, end = ", ")