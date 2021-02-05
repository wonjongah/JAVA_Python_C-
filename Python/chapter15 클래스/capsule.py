balance = 8000

def deposit(money):
    global balance
    balance += money

def inquire():
    print(f"잔액은 {balance}입니다.")

deposit(1000)
inquire()