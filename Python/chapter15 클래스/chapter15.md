#### 15.1 클래스



- 클래스의 정의



객체지향의 가장 기본적인 개념이 클래스이다. 클래스는 관련된 속성과 동작을 하나의 범주로 묶어 실세계의 사물을 흉내낸다.

사물을 분석해 필요한 속성과 동작을 추출하는 것을 모델링이라고 하고, 모델링된 결과를 클래스로 포장하는 것을 캡슐화하고 한다.

```python
balance = 8000

def deposit(money):
    global balance
    balance += money

def inquire():
    print(f"잔액은 {balance}입니다.")

deposit(1000)
inquire()
```

```
잔액은 9000입니다.
```

위의 두 함수는 독립적이다. 만일 계좌가 더 많아지면 누구의 통장인지 구별하고 처리할 수 있을까?

이럴 경우 클래스를 사용해 관리를 하나로 묶어서 한다.

위의 balance, deposit, inquire는 긴밀하게 연관되어 있다.

이렇게 긴밀하게 연관된 정보는 모여 있어야 완벽하게 동작하며 하나의 범주로 묶어야 관리하기 편하다.

이것이 캡슐화이며, 클래스로 묶어 두면 계좌를 쉽게 표현할 수 있다.

캡슐화를 해두면 여러 개의 계좌를 만들기도 쉽다.

계좌가 필요할 때마다 매번 속성과 동작을 새로 만들어야 한느 낭비가 있는데, 캡슐화를 해두면 객체만 만들면 된다.

```python
class Account: # 정의일 뿐 호출해야 사용 가능
    def __init__(self, balance): # 생성자 함수(초기화)
        self.balance = balance # self -> 인스턴스 변수(현재 생성된 인스턴스에 대한 참조, 지금의 인스턴스가 누구냐에 따라 달라짐)
    def deposit(self, money):
        self.balance += money
    def inquire(self):
        print(f"잔액은 {self.balance}입니다.")

sinhan = Account(8000) # 클래스 이름으로 호출 -> 생성자 함수를 통해 초기화(heap에 메모리 잡힘)
sinhan.deposit(1000)
sinhan.inquire()

nonghyup = Account(1200000)
nonghyup.inquire()
```

```
잔액은 9000입니다.
잔액은 1200000입니다.
```

class 키워드로 대문자로 시작하는 이름으로 클래스 정의 -> 사용하기 위해서는 인스턴스(개념이 실체화된 하나하나의 존재) 생성한 뒤 사용

파이썬 내부에서 사용하는 함수를 \_\__함수이름\_\__이라고 정의한다.

함수 이름 -> 함수의 참조를 의미한다.

사물의 속성을 변수로 표현하고 동작은 함수로 표현할 수 있어 클래스로 캡슐화하면 세상의 모든 사물을 다 표현할 수 있다. 

클래스를 구성하는 변수와 함수를 합쳐 멤버라고 통칭하며 클래스에 소속된 함수를 특별히 메서드라고 부른다.



- 생성자



파이썬의 클래스 선언은 다음과 같다.

키워드 class로 시작하고 클래스 이름을 적되 대상을 잘 표현하는 이름을 붙인다.

클래스의 이름은 첫 글자를 대문자로 적는 것이 관행이다.

```python
class 이름:
	def __init__(self, 초기값):
		멤버 초기화
	메서드 정의
```

클래스를 사용해 객체를 생성하려면 클래스를 함수처럼 호출하면 된다.

```python
객체 = 클래스명(인수) # 인수로 초기값 전달
```

\_\_init\_\_ 생성자는 객체를 초기화하는 특수 메서드이다.

특수 메서드란, 앞뒤로 밑줄 두 개가 있는 메서드를 말하며, 용도와 이름이 미리 정해져 있다.

메서드의 첫 번째 인수는 자기 자신을 의미하는 self이며, 멤버 참조 시 self 멤버 구문을 사용한다.

파이썬은 변수를 선언한느 문법이 없어 멤버 변수를 따로 선언하지 않는다.

대신 \_\_init\_\_에서 초기값을 받아 대입하는 형식으로 멤버를 생성한다.

생성자에서 self.멤버 = 초기값 형식으로 대입하면 클래스의 멤버 변수가 된다.

생성자 외 더 필요한 메서드는 아래쪽에 정의한다.

\_\_init\_\_ 생성자와 더불어, \_\_del\_\_ 파괴자도 있으나 파이썬은 메모리 관리가 자동화되어 있어 잘 사용하지 않는다.

메서드는 원하는 만큼 선언할 수 있다.

또한 클래스.메서드(객체) 식으로 호출도 가능하다.

```python
객체.메서드()
클래스.메서드(객체)
```

둘은 같은 표현이다.



-> 리스트에 정보를 여러 개 저장해서 넣기 적합하다.

-> 인스턴스 변수는 어디서든 접근 가능하다.

-> 메소드 없는 데이터만 있는 데이터 클래스도 존재한다.



- 상속



상속은 기존 클래스를 확장해 멤버를 추가하거나 동작을 변경하는 방법이다.

비슷한 클래스가 있다면 처음부터 다시 만들 필요 없이 상속받아 약간씩 확장 및 변형해 사용한다.

상속을 받을 때는 클래스 이름 다음 괄호 안에 부모 클래스의 이름을 지정한다.

```python
class 이름(부모):
	자식 클래스 저의
```

새로 정의되는 자식 클래스는 부모 클래스의 모든 멤버를 물려받는다.

일단 물려받은 후 추가로 멤버를 더 정의하거나 동작을 수정할 수 있다.

ex)

```python
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
```

```
29살 김상형입니다.
24살 이승우입니다.
학번 : 294829
하늘천 따지 검을현 누를황
```

만일 상속하는 함수 없으면 부모의 함수를 그대로 쓰겠다는 뜻이다.

함수 재정의(method override) -> 같은 이름을 가지고 있고, 매개 변수가 같아야 한다.

상속 받은 후 더 필요한 멤버는 추가 선언이 가능하다.

자식 클래스에서 부모 메서드를 호출할 때는 super() 메서드로 부모를 구해 호출한다.

그러나

```python
def __init__(self, age, name, stunum):
	self.age = age 
	self.name = name
	self.stunum = stunum
```

이런 식으로 직접 멤버를 초기화하면, 부모가 변경될 때 자식도 같이 수정해야 하는 불편함이 존재해 상속의 장점이 반감되고 코드를 관리하기 어렵다.

부모로부터 물려받은 멤버는 부모의 생성자에게 초기화를 위임하고 직접 추가하는 것이 정석이다.

자식은 부모의 모든 메서드를 물려받는다.

Student가 intro 메서드를 따로 정의하지 않더라도 학생은 부모 메서드(intro)로 자기소개를 할 수 있다.

필요하다면 같은 이름의 메서드를 재정의(override)해 부모의 동작을 원하는 대로 수정한다.

Student는 intro를 다시 정의해 부모의 intro를 통해 나이와 이름을 출력한 후, 자신의 학번도 출력한다.

부모의 메서드를 아예 호출하지 않고 완전히 다르게 작성할 수도 있다.

ex)

```python
def intro(self):
	print(f"{self.stunum}학번 {self.name}입니다.")
    # Student의 intro
    # 이 함수를 선언해도 부모 클래스는 바뀌지 않고, 자식 클래스에 intro 함수가 독립적으로 생기는듯
```

상속을 받은 자식 클래스가 또 다른 클래스를 파생시킬 수도 있는데, Student로부터 Graduate를 파생시킬 수도 있다.

파생될 수록 클래스는 더 특수한 대상을 표현하게 되어 속성과 동작이 늘어난다.

파이썬은 여러 개의 부모로부터 클래스를 파생시키는 다중 상속까지 지원한다.

상속의 맨 꼭대기는 오브젝트라고 부른다.



- 액세서



파이썬은 공식적으로 정보 은폐를 지원하지 않는다.

그래서 파이썬 클래스의 멤버는 모두 공개되어 있으며 외부에서 누구나 액세스할 수 있다. (기본 퍼블릭)

하지만, 객체 초기화 후 외부에서 멤버를 실수나 우발적으로 엉뚱한 값을 대입하면 큰 문제가 된다.

멤버를 외부에서 마음대로 조작하게 내버려두는 것보다 일정한 규칙을 마련하고 안전하게 액세스하도록 해야 한다.

멤버 값을 대신 읽어주는 게터(Getter), 메서드와 변경하는 세터(Setter) 메서드를 정의하는 것이 보편적이다.

```python
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
```

1 ~ 12의 값에 해당하는 월의 값만 저장을 하기 때문에 객체를 엉뚱한 값으로 설정하지 않을 수 있다.

<u>month 멤버는 숨겨놓고 게터, 세터만 쓰도록 한다면 객체의 안전을 어느 정도 지킬 수 있다.</u>

그러나 사용자가 멤버의 이름을 알고 있으니 today.month = 123이라 대입하면 이때는 방어할 방법이 없다.

<u>좀 더 안전한 방법은 멤버의 이름을 어렵게 만들고 게터, 세터를 정의한 후 property(getter, setter) 형식으로 프로퍼티를 정의하는 것이다.</u>

```python
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
today.month = 15 # today의 프로퍼티 함수 month에서 setter 이용
print(today.month)
```

<u>getter, setter로 접근 가능한 함수가 property이다.</u>

실제 정보를 저장하는 멤버는 inner_month로 정의하고 month 프로피터를 통해 내부 멤버를 액세스하는 게터, 세터와 연결한다.

<u>month 프로퍼티를 읽고 쓰면 게터, 세터가 호출되어 안전하다.</u>

프로퍼티를 통해 게터, 세터는 직접 호출할 수 있지만 today.month에 15를 대입하는 것은 허락되지 않는다.

데코레이터로 프로퍼티를 정의할 수도 있다.

<u>메서드의 이름은 month로 쓰고 데코레이터를 붇이되 게터는 @property를 붙이고 세터는 @이름.setter를 붙인다.</u>

```python
class Date:
    def __init__(self, month):
        self.inner_month = month
    @property
    def month(self): # 읽기 용도 month
        return self.inner_month
    @month.setter
    def month(self, month): # 쓰기(설정) 용도 month
        if 1 <= month <= 12:
            self.inner_month =  month

today = Date(8)
today.month = 15 # write -> setter호출
print(today.month) # 필드 함수 리드처럼 보이나 getter 함수
```

property 사용 시 같은 이름 함수 선언, 사용 가능하다.

데코레이터로 정의하면 액세서는 노출되지 않아 외부에서 직접 호출할 수 없으며 속성에 잘못된 값을 대입하면 거부된다.

세터를 정의하지 않으면 읽기 전용으로 만들 수 있다.

그러나 프로퍼티를 쓰더라도 숨겨진 멤버 이름을 알고 있다면 today.inner_month = 15로 대입하는 것을 막을 수 없다.

숨겨진 멤버의 이름이 \_\_로 시작하면 이 멤버를 바로 참조하지 못하도록 특수한 이름을 붙인다.

(private(외부 노출하지 않겠다.))

다음 코드는 __month로 이름을 바꿈으로써 함부로 값이 변경되지 않도록 한다.

```python
class Date:
    def __init__(self, month):
        self.__month = month # 외부 공개 X

    def getmonth(self):
        return self.__month
    
    def setmonth(self, month):
        if 1 <= month <= 12:
            self.__month = month
    
    month = property(getmonth, setmonth) # month라는 프리퍼티를 만들어준다.

today = Date(8)
today.__month = 15
print(today.month)
```

__가 붙으면 내부적인 실제 이름을 _클래스명\_\_멤버명으로 복잡하게 만든다.(프리베이트 멤버변수)

즉 __month는 _Date\_\_month가 된다.

사용자가 이런 복잡한 이름을 알아내 실수로 대입할 위험을 막을 수 있다.

물론 숨겨진 이름도 직접 대입하면 바꿀 수 있지만 최소한 의도치 않은 실수는 막을 수 있다.

게터, 세터만 잘 사용해도 어느 정도의 안전성은 확보 가능하다.



#### 15.2 여러가지 메서드



- 클래스 메서드



<u>일반적인 메서드는 객체에 소속되는 인스턴스 메서드이다.</u> 

첫 번째 인수 self를 받아 이 객체에 대한 작업을 수행한다.

<u>이에 비해 클래스 메서드는 특정 객체의 작업을 처리하는 것이 아니라 클래스 전체가 공유한다.</u>

함수 앞에 @classmethod 데코레이터를 붙이고 첫 번째 인수로 클래스에 해당하는 cls 인수를 받아들인다.

```python
class Car:
    count = 0

    def __init__(self, name):
        self.name = name
        Car.count += 1

    @classmethod
    def outcount(cls):
        print(cls.count)

pride = Car("프라이드")
korando = Car("코란도")
Car.outcount()
```

클래스 선언문에 초기화한 변수 count는 Car 클래스 소속이다.

특정 객체에 소속되지 않고, 이 클래스로부터 생성되는 모든 객체가 공유한다.

최초 선언될 때 0으로 초기화하고 __init\_\_에서 차를 한 대 생성할 때마다 1씩 증가시킨다.

<u>클래스 멤버는 모든 객체에 의해 공유되므로 각 객체에서도 참조 가능하다.</u>

ex)

```python
print(pride.count) # pride의 소속 클래스의 클래스 멤버 변수 count를 출력하라
```

이대 pride는 객체를 의미하는 것이 아니라 이 객체가 소속된 클래스를 의미하며 korando.count도 마찬가지이다.

하지만 보통 클래스.클래스멤버변수 식으로 호출하는 것이 어디 클래스의 클래스 멤버 변수인지 쉽게 알 수 있으므로 이 호출방식을 사용한다.



- 정적 메서드



<u>정적 메서드는 클래스에 포함되는 단순한 유티리티 메서드이다.</u>

<u>특정 객체에 소속되지 않고 클래스와 관련된 동작을 하는 것도 아니어서 self, cls를 인수로 받지 않는다.</u>

정적 메서드를 정의할 때는 @staticmethod 데코레이터를 붙인다.

```python
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

Car.hello() # 클래스 메서드인지, 정적 메서드인지는 클래스 정의로 가서 봐야 확인 가능
```

모든 객체가 빈번히 호출하는 공통적인 도우미 함수를 클래스 안에 포함시켜 두고자 할 때 정적 메서드를 사용한다.



- 연산자 메서드



클래스에 연산자 메서드를 정의하면 객체에 대해 연산자를 사용할 수 있다.

클래스별로 연산자의 동작을 고유하게 정의하는 기능을 연산자 오버로딩이라고 한다.

피연산자의 타입에 따라 적절한 동작을 정의해두면 객체를 수식에 바로 활용할 수 있어 편리하다.

연산자는 기호로 되어 있어 함수의 이름으로 쓸 수 없기 때문에 연산자별로 메서드의 이름으로 정해져 있다.

| 연산자             | 메서드        | 우변일 때 메서드 |
| ------------------ | ------------- | ---------------- |
| ==                 | __eq\_\_      |                  |
| !=                 | __ne\_\_      |                  |
| <                  | __lt\_\_      |                  |
| >                  | __gt\_\_      |                  |
| <=                 | __le\_\_      |                  |
| >=                 | __ge\_\_      |                  |
| +                  | __add\_\_     | __radd\_\_       |
| -                  | __sub\_\_     | __rsub\_\_       |
| *                  | __mul\_\_     | __rmul\_\_       |
| /                  | __div\_\_     | __rdiv\_\_       |
| /(division 임포트) | __truediv\_\_ | __rtruediv\_\_   |

ex)

```python
class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name
    def __eq__(self, other):
        return self.age == other.age and self.name == other.name

kim = Human(29, "김상형")
sang = Human(29, "김상형")
moon = Human(43, "문종현")
print(kim == sang)
print(kim == moon) # 연산자 왼쪽이 self로, 연산자 오른쪽이 other로 넘어간다.
```

물론 연산자를 사용하지 않고 함수로 정의해도 무관하나, 함수에 비해 연산자는 훨씬 더 직관적이다.



- 특수 메서드



다음 메서드들은 특정한 구문에 객체가 사용될 때 미리 약속된 작업을 수행한다.

이 메서드를 정의해두면 필요할 때 호출되어 객체에 대해 원하는 작업을 수행한다.

| 메서드     | 설명                                        |
| ---------- | ------------------------------------------- |
| __str\_\_  | str(객체) 형식으로 객체를 문자열화한다.     |
| __repr\_\_ | repr(객체) 형식으로 객체의 표현식을 만든다. |
| __len\_\_  | len(객체) 형식으로 객체의 길이를 조사한다.  |

__str\_\_ 함수는 객체를 문자열화해 표현하는데 이 함수를 정의해두면 print의 인수로 객체 자체를 넘길 수 있다.

```python
class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name
    def __str__(self):
        return f"이름 : {self.name}, 나이 : {self.age}"

kim = Human(29, "김상형")
print(kim)
```

객체의 정보를 화면에 출력하려면 객체를 문자열로 바꿔야 한다.

print 함수는 출력 대상을 문자열화하고, str 함수는 객체의 __str\_\_ 함수를 호출하게 되어 있다.

print 함수에 원하는 객체를 전달하면 호출된다.

```python
print(객체)
```

만약 이 함수가 없다면 객체의 소속과 번지가 출력된다.



__repr\_\_ 함수는 사람을 위한 출력문이 아닌 해석기를 위한 표현식을 생성한다는 면에서 단순 문자열과는 다르다.

__len\_\_ 함수는 len(객체) 형식으로 객체의 길이를 조사할 때 돌려줄 값을 리턴한다.

```python
class Human:
    def __init__(self, age, name):
        self.age = age
        self.name = name

    def __len__(self):
        return self.age

kim = Human(29, "김상형")
print(len(kim))
```

컬렉션 클래스라면 요소의 개수를 리턴하는 것이 가장 적합한 사용 예이다.