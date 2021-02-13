class Date:
    def __init__(self, month):
        self.month = month

    def getmonth(self):
        return self.month

    def setmonth(self, month):
        if 1 <= month <= 12:
            self.month = month

today = Date(8)
today.setmonth(15)
print(today.getmonth())