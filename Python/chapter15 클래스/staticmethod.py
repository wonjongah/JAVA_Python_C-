class Car:
    @staticmethod
    def hello(): # 인스턴스 접근 X, 클래스 접근 X
        print("오늘도 안전운행을 합시다.")
    count = 0
    def __init__(self, name):
        self.name = name
        Car.count += 1
    @classmethod
    def outcount(cls):
        print(cls.count)

Car.hello()