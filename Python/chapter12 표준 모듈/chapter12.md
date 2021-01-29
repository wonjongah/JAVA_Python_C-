#### 12.1 수학



재사용 가능한 부품, 코드블럭을 모듈이라고 한다. 파이썬에서는 파일이 그러하다.



- 임포트



모듈은 파이썬 코드를 작성해 놓은 스크립트 파일이며 이 안에 함수, 변수, 클래스 등이 정의되어 있다. 파이썬은 자주 사용하는 기능을 표준 모듈(파이썬에서 제공하는 모듈)로 제공하므로 모든 것을 다 만들어 쓸 필요 없이 가져와 사용하면 된다.

외부의 모듈을 가져와 사용할 때는 **import** 명령을 사용한다.

이 명령에 의해 모듈에 정의된 코드가 현재 소스로 읽혀진다.

대신 어느 함수가 어느 모듈에 있는지 알아야 쓸 수 있기 때문에 어떤 함수가 어느 모듈에 있는지 알고 있어야 한다.

```c
import math

print(math.sqrt(2)) # 2의 제곱근
```

```
1.4142135623730951
```

import math 선언은 math 모듈에 작성된 모든 상수와 함수를 다 가져온다. 

만일 import math 구문이 없으면 sqrt 함수는 정의되지 않은 것으로 에러 처리된다.

<u>파일명은 곧 모듈명이다.</u>

모듈의 함수를 호출할 때는 함수명 앞에 모듈명을 붙여 math.sqrt()식으로 소속을 밝힌다. <u>소속을 밝히면 다른 모듈에 같은 이름의 함수가 있더라도 이름충동을 면할 수 있다.</u>

그러나 매번 math.를 붙여야 하는 불편함이 있다. 이럴 경우 아래의 예와 같이 from, import을 사용한다.

```python
from 모듈 import 함수명 # 몇 개만 쓸 경우
```

같은 모듈 소속의 함수는 콤마로 구분해 여러 개를 불러올 수 있다.

모듈의 모든 함수를 다 불러올 때는 함수명 자리에 * 문자를 사용한다.

```python
from math import sqrt

print(sqrt(2)) # math.sqrt()를 쓰지 않아도 된다.
```

```
1.4142135623730951
```

함수를 직접 임포트했으므로 소속을 밝힐 필요 없이 함수명으로 바로 호출할 수 있다.

그러나 sqrt 함수만 임포트했기 때문에 math에 속한 다른 함수는 사용할 수 없다.

이때는 from math import *으로 math에 속한 모든 함수를 다 임포트하면 된다.

너무 많은 함수를 임포트하면 다른 모듈과 이름충돌이 발생할 수 있기 때문에 가급적이면 소속을 밝히고 쓰는 것이 안전하다.

모듈 이름이 길면 함수명 앞에 모듈 명을 일일이 붙이는 일은 번거롭기 때문에 as 문을 사용해 별칭을 붙인다.

```python
import 모듈 [as 별칭]
```

ex)

```python
import math as m

print(m.sqrt(2))
```

```
1.4142135623730951
```

함수의 이름 또한 별칭을 지칭할 수도 있다.

```python
from 모듈 import 함수명 as 별칭
```

ex)

```python
from math import sqrt as sq

print(sq(2))
```

```
1.4142135623730951
```

파일명을 지정할 때 모듈명으로 짓지 않도록 조심해야 한다.

import한 모듈명과 같은 파일명으로 지정하게 되면, 내 디렉토리부터 찾고 무한루프로 프로그램이 종료된다.

또한 import는 소스 중간에서도 사용할 수 있다.



- math 모듈



math 모듈은 수학 연산에 필요한 상수와 연산 함수를 제공한다.

파이썬은 C로 구현되어 있고, C 표준 라이브러리를 랩핑했기 때문에 C 언어에 친숙하면 다루기 쉽다.

| 상수 | 설명                                                         |
| ---- | ------------------------------------------------------------ |
| pi   | 원주율 상수                                                  |
| tau  | 원주율의 2배 되는 상수. pi는 지름과 원둘레의 비율인데 비해 tau는 반지름과 원둘레의 비율이다. 파이썬 3.6에 추가됐다. |
| e    | 자연 대수 상수                                               |
| inf  | 무한대 값                                                    |
| nan  | 숫자가 아닌 값을 의미한다. (not a number)                    |

정밀도를 위해서 3.14 같은 상수를 직접 쓰기보다 math.pi가 훨씬 정확하다.

다음은 수학식을 계산하는 함수들이다.

일부 특수한 함수를 제외하고 대부분의 함수는 정밀한 계산을 위해 실수 타입의 float를 리턴한다.

| 함수                                  | 설명                                                         |
| ------------------------------------- | ------------------------------------------------------------ |
| sqrt(x)                               | x의 제곱근을 구한다. 세제곱근은 1/3승을 계산해 구한다.       |
| pow(x, y)                             | x의 y승을 계산한다. **연산자와 기능은 같지만 인수를 모두 실수로 바꾼 후 연산한다는 차이가 있다. |
| hypot(x, y)                           | 피타고라스 정리에 의거 x제곱 + y제곱의 제곱근을 구한다.      |
| factorial(x)                          | x의 계승을 구한다. 인수 x는 양의 정수만 가능하다.            |
| sin(x), cos(x), tan(x)                | 삼각함수를 계산한다. 인수 x는 라디안 값이다.                 |
| asin(x), acos(x), atan(x), atan2(y,x) | 역삼각함수를 계산한다. 인수 x는 라디안 값이다.               |
| sinh(x), cosh(x), tanh(x)             | 쌍곡선 삼각함수를 계산한다. 인수 x는 라디안 값이다.          |
| asinh(x), acosh(x), atanh(x)          | 쌍곡선 역삼각함수를 계산한다. 인수 x는 라디안 값이다.        |
| degrees(x)                            | 라디안 값을 각도로 바꾼다.                                   |
| radians(x)                            | 각도를 라디안 값으로 바꾼다.                                 |
| ceil(x)                               | 수직선 오른쪽의 올림 값을 찾는다.                            |
| floor(x)                              | 수직선 왼쪽의 내림 값을 찾는다.                              |
| fabs(x)                               | x의 절대값을 구한다.                                         |
| trunc(x)                              | x의 소수점 이하를 버린다.                                    |
| log(x, base)                          | base에 대한 x의 로그를 구한다. base가 생략되면 자연로그를 구한다. |
| log10(x)                              | 10의 로그를 구한다. log(x, 10)과 같다.                       |
| gcd(a, b)                             | a, b의 최대공약수를 구한다.                                  |

파이썬 기본 제공으로 round() 반올림 함수도 있다.

ex)

```python
import math

print(math.sin(math.radians(45)))
print(math.sqrt(2))
print(math.factorial(5))
```

```
0.7071067811865476
1.4142135623730951
120
```



- 통계

statistics 모듈은 3.4 버전에서 새로 추가됐다.

편균, 분산 등의 통계 값을 계산한다.

수학 함수로도 구할 수 있지만, 통계 함수는 정확한 값을 효율적으로 계산해낸다.

| 함수           | 설명                                             |
| -------------- | ------------------------------------------------ |
| mean           | 평균을 구한다.                                   |
| harmonic_mean  | 조화평균을 구한다.                               |
| median         | 중앙값을 구한다. 짝수인 경우 보간 값을 계산한다. |
| median_low     | 중앙값을 구한다. 집합 내의 낮은 값을 선택한다.   |
| median_high    | 중앙값을 구한다. 집합 내의 높은 값을 선택한다.   |
| median_grouped | 그룹 연속 중앙값을 구한다.                       |
| mode           | 최빈값을 구한다.                                 |
| pstdev         | 모표준편차를 구한다.                             |
| stdev          | 표준편차를 구한다.                               |
| variance       | 분산을 구한다.                                   |

ex)

```python
import statistics

score = [30, 40, 60, 70, 80, 90]
print(statistics.mean(score))
print(statistics.harmonic_mean(score))
print(statistics.median(score))
print(statistics.median_low(score))
print(statistics.median_high(score))
```

```
61.666666666666664
53.14586994727592
65.0
60
70
```



#### 12.2 시간



- 시간 조사



time 모듈은 날짜와 시간 관련 기능을 제공한다. 대표적인 함수는 현재 시간을 조사하는 time이다.

유닉스는 1970년 1월 1일 자정을 기준으로 경과한 시간을 초 단위로 표현하는데 이를 에폭(Epoch) 시간 또는 유닉스 시간이라고 부른다.

```python
import time

time.time() # 에폭 시간 리턴
```

```
1611910759.21229
```

위의 숫자는 1970년부터 2018년까지 16억 초가 지났다는 말이다.

시간을 딱 하나의 수치값으로 1차원화해 간단히 표현할 수 있어 계산이나 저장이 간편하고 다른 시스템과의 통신에도 유리하다.

```python
import time

time.ctime() # 에폭 시간을 문자열 형태로 변환해서 리턴
```

하지만 현재 날짜와 시간을 바로 알아보기는 어렵다.

ctime은 문자열 형태로 변환해 사람이 읽을 수 있도록 도와준다.

인수로 에폭 시간을 넘기면 문자열로 바꿔준다.

ex)

```python
import time

t = time.time()
print(time.ctime(t))
```

```
Fri Jan 29 18:02:04 2021
```

문자열로 시간을 확인할 수 있지만 시간 요소의 순서와 영문 표기가 보기에 직관적이지 못하다.

시간 요소를 분리하는 함수는 localtime 과 gmtime이 있다.

gmtime은 세계 표준 시간인 UTC 시간을 구하므로, 현지 시간을 표현하는 localtime 함수를 주로 쓴다.

```python
import time

time.localtime()
time.gmtime()
```

ex)

```python
import time

t = time.time()
print(time.localtime(t))
```

```
time.struct_time(tm_year=2021, tm_mon=1, tm_mday=29, tm_hour=18, tm_min=11, tm_sec=40, tm_wday=4, tm_yday=29, tm_isdst=0)
```

에폭 시간을 인수로 주면 localtime은 struct_time 객체를 리턴한다.

이 객체를 이용해 원하는 형태의 시간으로 출력 가능하다.

```python
import time

now = time.localtime()
print(f"{now.tm_year}년 {now.tm_mon}월 {now.tm_mday}일")
print(f"{now.tm_hour}:{now.tm_min}:{now.tm_sec}")
```

```
2021년 1월 29일
18:16:29
```



time 모듈 대신 datetime 모듈의 now 함수(또는 today 함수)를 사용해도 현재 지역 시간을 구할 수 있다.

같은 시간을 구하지만 멤버 이름이 더 짧고 직관적이라 사용하기 쉽다.

```python
import datetime

datetime.datetime.now()
datetime.datetime.today()
```

ex)

```python
import datetime

now = datetime.datetime.now() # 모듈명.객체명.메서드
print(f"{now.year}년 {now.month}월 {now.day}일")
print(f"{now.hour}:{now.minute}:{now.second}")
```

```
2021년 1월 29일
18:19:36
```



mktime 함수는 반대로 struct_time 객체를 에폭 시간으로 바꾼다.



- 실행 시간 측정



