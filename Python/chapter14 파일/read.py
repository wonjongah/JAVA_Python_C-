try:
    f = open("live.txt", "rt")
    text = f.read()
    print(text)
except FileExistsError:
    print("파일이 없습니다.")
finally:
    f.close()