name = "한결"
age = 23
height = 165.4
print("이름:{0:^10s}, 나이:{1:>5d}, 키:{2:<8.2f}".format(name, age, height))
print("이름:{0:$^10s}, 나이:{1:>05d}, 키:{2:!<8.2f}".format(name, age, height))
print(f"이름:{name}, 나이:{age}, 키:{height:.2f}")
a, b = input('숫자 두 개를 입력하세요: ').split()    # 입력받은 값을 공백을 기준으로 분리
a = int(a)    # 변수를 정수로 변환한 뒤 다시 저장
b = int(b)    # 변수를 정수로 변환한 뒤 다시 저장
 
print(a + b)