class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name

    def intro(self):
        print(str(self.age) + "살 " + self.name + "입니다.")


class Student(Human):
    def __init__(self, age, name, stunum):
        super().__init__(age, name) # 부모 클래스의 참조값 리턴
        self.stunum = stunum

    def intro(self):
        super().intro() # 부모 클래스의 intro 함수를 상속 + 밑의 코드 추가하겠다.
        print("학번 : " + str(self.stunum))

    def study(self):
        print("하늘천 따지 검을현 누를황")

kim = Human(29, "김상형")
kim.intro()
lee = Student(24, "이승우", 294829)
lee.intro()
lee.study()