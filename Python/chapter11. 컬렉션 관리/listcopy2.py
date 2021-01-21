li1 = [1, 2, 3]
li2 = li1.copy() # li2 = li1[:]와 동일

li2[1] = 100
print(li1)
print(li2)