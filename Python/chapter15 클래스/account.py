class Account:
    def __init__(self, balance):
        self.balance = balance
    def deposit(self, money):
        self.balance += money
    def inquire(self):
        print(f"잔액은 {self.balance}입니다.")

sinhan = Account(8000)
sinhan.deposit(1000)
sinhan.inquire()

nonghyup = Account(1200000)
nonghyup.inquire()