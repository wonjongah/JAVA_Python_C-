dan = 2
while dan <= 9:
    hang = 1
    print(dan, "단")
    while hang <= 9:
        print(dan, "*", hang, "=", dan * hang)
        hang += 1
    dan += 1
    print()