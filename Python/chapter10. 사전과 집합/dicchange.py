dic = {"boy":"소년", "school":"학교", "book":"책"}
dic["boy"] = "남자애" # 기존값 수정
dic["girl"] = "소녀" # 키 값 없으면 새로운 엔트리 추가
del dic["book"] # 기존 엔트리 삭제
print(dic)