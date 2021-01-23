dic = {"boy":"소년", "girl":"소녀", "book":"책"}
try:
    print(dic["school"]) # 없는 경우 예외 
except:
    print("찾는 단어가 없습니다.")

han = dic.get("school") # 없는 경우 None 리턴 or 디폴트 값 적용
if (han == None):
    print("찾는 단어가 없습니다.")
else:
    print(han)
