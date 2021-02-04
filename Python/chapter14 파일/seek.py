f = open("live.txt", "rt")
f.seek(12, 0) # 0, 처음부터, 12만큼 떨어진 곳부터
text = f.read()
f.close()
print(text)