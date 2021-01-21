list1 = [1, 2, 3]
list2 = list1 # 같은 객체 참조
list3 = list1.copy() # 같은 객체 참조 X

print("1 == 2", list1 is list2)
print("1 == 3", list1 is list3)
print("2 == 3", list2 is list3)