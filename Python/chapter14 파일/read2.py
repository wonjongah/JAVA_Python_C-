f = open("live.txt", "rt")
while True:
    text = f.read(10) # 10 바이트씩 읽어들인다.
    if len(text) == 0:  break # 읽어들인 것이 없을 때 = 읽는 것이 끝났을 때
    print(text, end = "")
f.close()