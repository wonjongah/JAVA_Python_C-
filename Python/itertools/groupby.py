from itertools import  groupby

n = [("문과", "사회학"),
    ("이과", "컴퓨터공학"),
    ("문과", "문헌정보"),
    ("문과", "경제학과"),
    ("이과", "생명공학"),
    ("이과", "화학과"),
    ("예체능", "순수미술")]

category = {}
for key, group in groupby(sorted(n), lambda x:x[0]):
    new_li = [x[1] for x in list(group)]
    category[key] = new_li

print(category)
    