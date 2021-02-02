class User: # 클래스 첫 글자는 대문자
    def say_hello(some_user): # 인스턴스 메소드
        print(f"안녕하세요! 저는 {some_user.name}입니다!")

user1 = User() # User()을 통해 User 인스턴스를 만들고, user1이 이 인스턴스를 가짐
user2 = User()
user3 = User()
# 셋은 User 인스턴스이나 서로 다른 인스턴스이다.

user1.name = "원종아"
user1.email = "won@codeit.co.kr"
user1.password = "12345"

user2.name = "강영훈"
user2.email = "kang.codeit.co.kr"
user2.password = "9827"

user3.name = "최하하"
user3.email = "hahaha.codeit.co.kr"
user3.password = "51235"

print(user1.email)
print(user2.password)

# 추가하지 않은 인스턴스 변수 사용 시 object has no attribute 에러 뜬다.
# print(user1.age)

User.say_hello(user1)
User.say_hello(user2)
User.say_hello(user3)