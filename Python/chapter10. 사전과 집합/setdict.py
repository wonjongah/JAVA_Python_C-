asia = {"korea", "china", "japan"}
asia.add("vietnam") # 추가
asia.add("china") # 중복 허용 X, 추가 안 됨
asia.remove("japan")
print(asia)

asia.update({"singapore", "hongkong", "korea"})
print(asia)