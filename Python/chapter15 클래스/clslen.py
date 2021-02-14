class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name

    def __len__(self):
        return self.age

kim = Human(29, "김상형")
print(len(kim))