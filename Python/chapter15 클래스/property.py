class Date:
    def __init__(self, month):
        self.inner_month = month

    def getmonth(self):
        return self.inner_month

    def setmonth(self, month):
        if 1 <= month <= 12:
            self.inner_month = month
    
    month = property(getmonth, setmonth)

today = Date(8)
today.month = 15
print(today.month)