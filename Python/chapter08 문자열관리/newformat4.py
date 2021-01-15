name = "한결"
age = 23
height = 165.4
print("이름:{0:^10s}, 나이:{1:>5d}, 키:{2:<8.2f}".format(name, age, height))
print("이름:{0:$^10s}, 나이:{1:>05d}, 키:{2:!<8.2f}".format(name, age, height))
print(f"이름:{name}, 나이:{age}, 키:{height:.2f}")