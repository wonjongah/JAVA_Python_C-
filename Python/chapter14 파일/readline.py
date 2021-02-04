f = open("live.txt", "rt")
text = ""
line = 1
while True:
    row = f.readline()
    if not row : break # 다 읽었으면, 빈 문자열을 리턴하면
    text += str(line) + " : " + row
    line += 1
f.close()
print(text)