li = ["Korea", "", "japan", "CHINA", "", "america"]
print(li)
new_li = [x for x in li if x] # 빈 문자(False)가 아닐 때 그 값을 
# 새로운 리스트로 만든다.
print(new_li)

li = ["Korea", "", "japan", "CHINA", "", "america"]
print(li)
new_li2 = list(filter(None, li))
print(new_li2)
