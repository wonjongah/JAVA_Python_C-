class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name
    def __str__(self):
        return f"이름 : {self.name}, 나이 : {self.age}"

kim = Human(29, "김상형")
print(kim)