class User: # 클래스 첫 글자는 대문자
    count = 0

    def __init__(self, name, email, password):
        self.name = name
        self.email = email
        self.password = password
        User.count += 1

    def __str__(self):
        return f"사용자: {self.name}, 이메일: {self.email}, 비밀번호: ******"

    def say_hello(self): # 인스턴스 메소드
        print(f"안녕하세요! 저는 {self.name}입니다!")
    
    def login(self, my_email, my_password):
        # 로그인 메소드
        if self.email == my_email and self.password == my_password:
            print("로그인 성공, 환영합니다.")
        else:
            print("로그인 실패, 없는 아이디이거나 잘못된 비밀번호입니다.")

    def check_name(self, name):
        # 파라미터로 받는 name이 유저의 이름과 같은지 체크
        return self.name == name

    @classmethod # 클래스 메소드 정의시 작성해야 하는 데코레이터
    def number_of_users(cls): # 클래스 메소드는 클래스가 첫 번째 파라미터로 전달된다. cls 관례
        # cls.count = User.count
        print(f"총 유저 수는:{cls.count}")


user1 = User("원종아", "won@codeit.co.kr", "12345") # User()을 통해 User 인스턴스를 만들고, user1이 이 인스턴스를 가짐
user2 = User("강영훈", "kang@codeit.co.kr", "592")
user3 = User("최하하", "haha@codeit.co.kr", "21412")
# 셋은 User 인스턴스이나 서로 다른 인스턴스이다.

# user1.name = "원종아"
# user1.email = "won@codeit.co.kr"
# user1.password = "12345"

# user2.name = "강영훈"
# user2.email = "kang.codeit.co.kr"
# user2.password = "9827"

# user3.name = "최하하"
# user3.email = "hahaha.codeit.co.kr"
# user3.password = "51235"

print(user1.email)
print(user2.password)

# 추가하지 않은 인스턴스 변수 사용 시 object has no attribute 에러 뜬다.
# print(user1.age)

User.say_hello(user1)
User.say_hello(user2)
User.say_hello(user3)

User.say_hello(user1)
user1.say_hello()

user1.login("captain@codeit.kr", "12345")
user1.login("won@codeit.co.kr", "12345")
# user1.login(user1, "captain@codeit.kr", "12345")는 에러

print(user1.check_name("원종아"))

print(user1)
print(user2)

user1.count = 5 # 인스턴스 변수를 사용할 때의 문법
# user1의 인스턴스에 count라는 변수가 새로 생기고 그 값이 5로 설정된 것
print(User.count)
print(user1.count)
print(user2.count)

User.number_of_users()
user1.number_of_users()