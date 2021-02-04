f = open("live.txt", "rt")
rows = f.readlines()
for row in rows:
    print(row, end = "")
f.close()