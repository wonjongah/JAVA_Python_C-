salerate = 0.9

def kim():
    print("오늘 할인율 :", salerate)

def lee():
    price = 1000 # 지역변수
    print("가격 :", price * salerate)

kim()
salerate = 1.1
lee()