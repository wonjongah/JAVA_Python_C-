f = open("live.txt", "rt")
for line in f:
    print(line, end = "")
f.close()