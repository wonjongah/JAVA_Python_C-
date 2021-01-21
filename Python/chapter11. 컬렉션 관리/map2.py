def total(s, b):
    return s + b

score = [76, 35, 87, 98, 100]
bonus = [2, 3, 0, 0, 5]
for s in map(total, score, bonus):
    print(s, end = ", ")