#### 13.1 예외 처리



- 예외



프로그램 코드는 이상이 없지만 실행 중에 불가피하게 발생하는 문제를 예외(Exception)이라고 한다.

예측이 가능한 오류도 있지만, 예를 들어 사용자에게 직접 값을 입력받을 경우 미리 예측하기 힘들다. 

에러 발생 즉시 프로그램이 종료되면, 이후의 명령 또한 무시되기 때문에 이후의 실행도 정상적일 수 없어 강제종료되며 제어권을 잃어버린다.



- 예외 처리



예외를 막을 근본적인 방법이 없다면 발생 가능한 모든 예외를 처리해야 한다.

예외 처리 구문의 형식은 다음과 같다.

```python
try:
	실행할 명령
except 예외 as 변수:
	오류 처리문
else: # 옵션
	예외가 발생하지 않을 떄의 처리
```

try 문에서 예외가 발생한 경우는 try -> except 순서를 따르며, try 문에서 예외가 발생하지 않은 경우는 try -> else 순서를 따른다.

ex)

```python
str = "89점"
try:
    score = int(str)
    print(score)
except: # 예외 타입을 지정하지 않았으므로 모든 예외를 다 나타낸다.
    print("예외가 발생했습니다.")
print("작업완료")
```

```
예외가 발생했습니다.
작업완료
```

예외가 발생한 코드는 어쩔 수 없이 제대로 실행할 수 없지만 예외를 처리하면 최소한 프로그램이 다운되지 않으며, 남은 코드 또한 실행할 수 있다.

예외가 발생하지 않으면 except 문은 무시되고, 다음 문장을 실행한다.

위의 print(score)는 변환 중 예외가 발생하지 않을 때 실행되어야 하므로 else 절에 옮겨도 상관없다.

```python
try:
	score = int(str)
except:
	print("예외가 발생했습니다.")
else:
	print(score)
```



- 예외의 종류



다음은 파이썬의 예외 객체의 종류이다.

| 예외              | 설명                                                         |
| ----------------- | ------------------------------------------------------------ |
| NameError         | 명칭이 발견되지 않는다. 초기화하지 않은 변수를 사용할 때 발생한다. |
| ValueError        | 타입은 맞지만 값의 형식이 잘못되었다.                        |
| ZeroDivisionError | 0으로 나누었다.                                              |
| IndexError        | 첨자가 범위를 벗어났다.                                      |
| TypeError         | 타입이 맞지 않다. 숫자가 필요한 곳에 문자열을 사용한 경우 등이다. |

만일 모든 에러를 전부 커버하고 싶다면,

```python
except Exception as e:
	예외 처리 구문
```

식의 except 문을 지정하면 된다.



try 문에서 다른 종류의 예외가 여러 개 발생할 수도 있다. 예외 별로 except 블록을 여러 개 작성해두면 예외에 따라 적절한 except 문으로 점프한다.

ex)

```python
str = "89"
try:
    score = int(str)
    print(score)
    a = str[5] # IndexError
except ValueError:
    print("정수의 형식이 잘못되었습니다.")
except IndexError:
    print("첨자의 범위를 벗어났습니다.")
print("작업 완료")
```

```
89
첨자의 범위를 벗어났습니다.
작업 완료
```

두 개 이상의 예외를 하나의 except 블록에서 동시에 받을 수도 있는데 이때는 예외를 괄호로 묶어 튜플로 지정한다.

두 예외를 처리하는 방식이 비슷하다면, 한꺼번에 같이 처리하는 것이 간편하다.

```python
except (ValueError, IndexError):
	print("점수의 형식이나 첨자가 잘못되었습니다.")
```

except 블록의 예외 이름 다음에 as 키워드로 예외 객체를 변수로 받으면, 이 객체를 통해 에러 메시지를 얻을 수 있다.

```python
except 에러 종류 as 변수: # 어디에서 에러가 났는지, 좀 더 구체적인 에러 정보를 알 수 있다.
```

ex)

```python
str = "89점"
try:
    score = int(str) # ValueError
    print(score)
    a = str[5]
except ValueError as e:
    print(e)
except IndexError as e:
    print(e)
print("작업 완료")
```

```
invalid literal for int() with base 10: '89점'
작업 완료
```

예외 처리는 예외 발생지와 호출한 곳 중 호출한 곳에서 예외처리를 한다. 그래야 다른 작업들이 가능하다.



- raise



raise는 고의적으로 예외를 발생시킨다. 

작업을 위한 선결 조건이 맞지 않거나 더 이상 진행할 수 없는 치명적인 문제가 발생했을 때 호출원으로 예외를 던져 잘못되었음을 알린다.

```python
raise 예외 이름
```

ex)

```python
def calcsum(n):
    if(n < 0):
        raise ValueError # raise에서의 예외 이름과 except의 예외 이름이 같아야 한다.
    sum = 0
    for i in range(n+1):
        sum = sum + i
    return sum

try:
    print("~10 =", calcsum(10)) # 함수를 이용하는 쪽에서 예외처리를 한다.
    print("~-5 =", calcsum(-5))
except ValueError: # raise에서의 예외 이름과 except의 예외 이름이 같아야 한다.
    print("입력 값이 잘못되었습니다.")
```

```
~10 = 55
입력 값이 잘못되었습니다.
```

보통 CPU, 메모리 이외의 환경이 영향을 미쳐 오류가 나는 경우가 있다. I/O에서 오류가 자주 난다. 누군가와 통신할 때는 꼭 try, except를 사용해 예외처리를 해준다.

예외를 던지는 대신 특이값을 리턴하여 인수가 잘못되었음을 보고할 수도 있다.

정상적인 리턴값으로 나올 수 없는 값을 선정해 리턴한 값을 판단해 잘못된 상황임을 알리는 것을 약속한다. 호출원은 예외 처리 구문 대신 리턴값 점검을 철저히 해야 한다.

ex)

```python
def calcsum(n):
    if(n < 0):
        return -1
    sum = 0
    for i in range(n+1):
        sum = sum + 1
    return sum

result = calcsum(10)
if result == -1:
    print("입력값이 잘못되었습니다.")
else:
    print("~10 =", result)

result = calcsum(-5)
if result == -1:
    print("입력값이 잘못되었습니다.")
else:
    print("~-5 =", result)
```

```
~10 = 11
입력값이 잘못되었습니다.
```

그러나 일일이 리턴값을 확인하는 작업은 불편하고, 에러 처리 구문과 정상처리 구문이 섞여 있어 코드 관리에도 좋지 않다. 

또한 예외는 함수 호출에서도 잘 동작하므로 연쇄적인 에러 처리를 하지 않아도 된다는 점에서 우수하다.

함수별로 비정상적인 상황을 처리하는 방법이 다르므로 함수별로 예외를 처리하는 방법에 맞게 구문을 작성해야 한다.

ex)

```python
dic = {"boy":"소년", "girl":"소녀", "book":"책"}
try:
    print(dic["school"]) # 없는 경우 예외 
except:
    print("찾는 단어가 없습니다.")

han = dic.get("school") # 없는 경우 None 리턴 or 디폴트 값 적용
if (han == None):
    print("찾는 단어가 없습니다.")
else:
    print(han)
```

```
찾는 단어가 없습니다.
찾는 단어가 없습니다.
```

예외를 던지는 구문은 강제종료 위험이 있기 때문에 반드시 try로 감싸야 한다.

특이값을 리턴하는 함수는 리턴값을 받아 if문으로 확인하면 특이값을 출력할 뿐, 다운은 되지 않는다.



#### 13.2 자원 정리



- finally (close, clean up 역할, 예외가 발생하든 말든 무조건 실행)



finally 블록은 예외 발생 여부와 상관없이 반드시 실행해야 할 명령을 지정한다.

메모리나 자원을 할당한 후 해제해야 하는데 이런 구문을 finally 블록에 작성하면 예외 발생 여부에 상관 없이 항상 이 구문을 실행한 후 전체 블록에서 빠져나온다.

ex)

```python
try:
    print("네트워크 접속")
    a = 2 / 0
    print("네트워크 통신 수행")
finally: # 오류가 나든 안 나든 무조건 실행
    print("접속 해제")
print("작업 완료")
```

```
네트워크 접속
접속 해제
Traceback (most recent call last):
  File "c:\workspace\JAVA_Python_C++\Python\chapter13 예외 처리\tempCodeRunnerFile.py", line 3, in <module>  
    a = 2 / 0
ZeroDivisionError: division by zero
```

네트워크 접속 후 통신을 수행하고 다 완료하면 접속을 끊는 것은 수순이다. 통신 중 예외가 발생해서 해제하지 못하면 네트워크는 계속 연결된 상태로 남아있게 된다. 

이럴 때 해제 구문을 finally 블록에 작성해두면 연결이 끊어짐을 보장할 수 있다.

예외가 발생하든 안 하든 무조건 finally 블록은 실행된다. 심지어 함수 내부의 try 블록에서 return 문으로 함수를 종료하더라도 finally 블록을 실행한 후 return하게 되어 있기 때문에 정리 코드는 실행된다.

외부의 자원을 사용하는 코드는 해제에 신경써야 한다. 

특히 파일 입출력 시 파일을 다 사용하면 받드시 닫아야 한다.

이때도 finally 구문은 유용하나 파일은 with 구문이 더 편리하기 때문에 with 구문을 주로 사용한다.



- assert (충족하는지 검사, 조건이 True면 통과하고 False면 메시지 가진 예외 발생)



assert 문장은 프로그램의 현재 상태가 맞는 지 확인한다.

점검할 조건과 조건이 거짓일 때 보여줄 메시지를 지정한다.

```python
assert 조건[, 메시지]
```

조건을 점검하고 참이면 현재 상태를 정상이라 판단해 아무 일도 일어나지 않고, 거짓이면 AssertionError 예외를 발생시키고 프로그램을 즉시 중지시키고 메시지를 보여준다.

메시지가 필요 없으면 생략 가능하다.

ex)

```python
score = 128
assert score <= 100, "점수는 100 이하여야 합니다." # False -> 프로그램 중지, 메시지 출력
print(score) # assert에 걸려 여기까지 오지 못한다.
```

```
  File "c:\workspace\JAVA_Python_C++\Python\chapter13 예외 처리\assert.py", line 2, in <module>
    assert score <= 100, "점수는 100 이하여야 합니다."
AssertionError: 점수는 100 이하여야 합니다.
```

assert는 이상이 발생하는 즉시 이를 확인해 알려주는 역할을 한다.

의심이 갈만한 상황에 assert를 군데군데 작성해두면 문제를 조기에 발견하는데 큰 도움이 된다.

문제를 즉시 알 수 있다는 점에서 유용하지만, 일일이 조건을 점검하기 때문에 속도가 느려질 수 있는데, 해석기 실행 시 -O 옵션을 주면 assert 문장은 모두 무시된다. 디버깅 확인용으로만 사용하고 최종적으로는 빼는 것이 좋다.