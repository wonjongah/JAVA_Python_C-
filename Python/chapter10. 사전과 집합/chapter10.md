#### 10.1 사전



사전과 집합은 순서가 중요하지 않기 때문에 시퀀스가 아니다.



- 키와 값의 쌍



사전(Dictionary)은 키와 값의 쌍을 저장하는 대용량의 자료구조이다.

해시 알고리즘을 사용하여 일대일로 대응하는 특성이 있어 맵이라고도 부르고 관련된 키와 값의 쌍이라고 해서 연관배열이라고도 부른다.

다른 언어에서는 라이브러리로 제공하는 고급 자료구조이지만 파이썬에서는 기본 기능으로 제공한다.

사전을 정의할 때는 {}괄호 안에 키:값 형태로 콤마로 구분하여 나열한다.

```python
{'키':'값', ...}
```

```python
dic = {'boy':'소년', 'girl':'소녀', 'book':'책'}
print(dic)
```

```
{'boy': '소년', 'girl': '소녀', 'book': '책'}
```

영어 단어가 키이고 합글을 값으로 하는 세 쌍의 요소를 사전에 저장했다.

<u>키</u>는 값을 찾는 기준이기 때문에 <u>중복되지 않는 고유의 값</u>을 가져야 하지만 값은 중복되어도 상관없다.

<u>키</u>는 <u>읽기 전용</u>이어서 변경할 수 없으며 그래서 튜플은 키로 쓸 수 있지만 리스트는 안 된다.

중복되면 업데이트로 간주된다.

값은 자유롭게 변경 가능하다.

print() 함수로 사전을 출력할 때 지정할 때와는 다른 순서로 출력되는데, 사전은 빠른 검색을 위해 키로부터 저장하는 위치를 결정하며 최대한 찾기 쉬운 위치에 저장하기 때문에 순서를 유지하지 않는다.

```python
사전[키값]
```

```python
dic = {"boy":"소년", "girl":"소녀", "book":"책"}
print(dic["boy"])
print(dic["book"])
```

```
소년
책
```

dic[키값]은 없으면 예외가 발생한다 측, 키가 있는지 확인한 후 접근해야 한다. 확신할 수 있을 때 사용한다.

이럴 때 get() 메서드를 사용하면 된다.

```python
사전.get(키값[, 찾는 인자 없을 경우 리턴할 내용]) 
# get 메서드는 키값이 없으면 None을 리턴, 만일 두 번째 인자에 전달된 매개변수가 있다면 그 값을 리턴한다.
```

```python
dic = {'boy':'소년', 'girl':'소녀', 'book':'책'}
print(dic.get('student')) # 키 값이 없다면 None을 리턴한다.
print(dic.get('student', "사전에 없는 단어입니다."))
# get의 두 번째 인수로 키 값이 없다면 리턴할 값을 지정할 수 있다.
```

```
None
사전에 없는 단어입니다.
```

```python
dic = {"boy":"소년", "girl":"소녀", "book":"책"}
if 'student' in dic: # key 파트만 검사
    print("사전에 있는 단어입니다.")
else:
    print("이 단어는 사전에 없습니다.")
```

```
이 단어는 사전에 없습니다.
```



- 사전 관리



사전은 변경 가능한 자료형이기 때문에 실행 중에 삽입, 삭제, 수정 등의 편집을 자유롭게 할 수 있다.

[] 괄호와 대입문을 주로 사용한다.

```python
dic = {"boy":"소년", "school":"학교", "book":"책"}
dic["boy"] = "남자애" # 기존값 수정
dic["girl"] = "소녀" # 키 값 없으면 새로운 엔트리 추가
del dic["book"] # 기존 엔트리 삭제
print(dic)
```

```
{'boy': '남자애', 'school': '학교', 'girl': '소녀'}
```

사전[키] 식에 값을 대입하면 키의 존재 여부에 따라 동작이 달라진다.

<u>키가 이미 존재하면 기존의 값이 변경</u>되는데, 사전은 키의 중복을 허락하지 않아 두 개의 키를 저장하지 않고 기존의 키 값을 변경한다.

<u>만일 없는 키에 대해 값을 대입하면 새로운 키와 값의 쌍이 추가되어 요소가 늘어난다.</u>

<u>즉, 키값이 있으면 수정, 없으면 추가이다.</u>

요소를 삭제할 때는 del 명령어를 사용해 해당 키를 찾아 값과 함께 사전에서 삭제한다.

사전의 모든 요소를 지울 때는 clear 메서드를 호출한다.

```python
사전.clear() # 사전의 모든 요소 삭제
```

사전의 키, 값 목록을 얻으려면 keys, values 메서드를 호출한다.

keys 메서드는 <u>dict_key</u>라는 <u>리스트 객체</u>를 리턴하며, 이 리스트에는 키의 목록만 들어있다.

values 메서드는 <u>dict_values</u>라는 <u>리스트 객체</u>를 리턴하며, 이 안에는 값의 목록만 들어있다.

items 메서드는 키와 값의 쌍을 <u>튜플</u>로 묶은 <u>dic_items 객체</u>를 리턴한다.

```python
dic = {"boy":"소년", "school":"학교", "book":"책"}
print(dic.keys())
print(dic.values())
print(dic.items()) # 리스트로 읽고 싶다면 list() 함수 써서 변환
```

```
dict_keys(['boy', 'school', 'book'])
dict_values(['소년', '학교', '책'])
dict_items([('boy', '소년'), ('school', '학교'), ('book', '책')])
```

파이썬 3.0 이전에는 목록을 직접 가지는 리스트를 리턴했지만 내부에서 거대한 리스트를 만드는 데에 메모리와 시간이 너무 많이 소모되어 3.0에서는 값을 구하는 객체를 리턴하는 것으로 변경되었다.

dict_* 객체는 리스트처럼 순회 가능해 값을 순서대로 읽을 수 있다.

```python
dic = {"boy" : "소년", "school":"학교", "book":"책"}
keylist = dic.keys()
for key in keylist: 
    print(key)
```

```
boy
school
book
```

그러나 진짜 리스트는 아니기 때문에 append, insert 등의 편집 함수를 호출할 수 없다. 

리스트로 만들고 싶다면 list() 함수로 변환한다.

```python
keylist = list(dic.keys())
```

update 메서드는 두 개의 사전을 병합한다.

인수로 전달한 사전이 호출 사전에 병합되어 합쳐진다.

```python
dic = {"boy":"소년", "school":"학교", "book":"책"}
dic2 = {"student":"학생", "book":"서적"}
dic.update(dic2)
print(dic)
```

```
{'boy': '소년', 'school': '학교', 'book': '서적', 'student': '학생'}
```

dic에 dic2를 병합하면 dic2에 있는 답어가 dic에 삽입된다. 중복된 키가 있으면 병합되는 키의 값이 적용된다. 

사전은 키 파트 중복이 허용되지 않는다. update 사용 시 호출한 사전과 호출된 사전의 키 중복이 있다면 호출된 사전의 키의 값으로 덮어쓴다.

<u>dict 함수는 빈 사전을 만들기도 하고 다른 자료형을 사전으로 변환하기도 한다.</u>

<u>2차원 리스트를 사전으로 바꿀 수 있는데 내부 리스트의 첫 요소는 키가 되고, 두 번째 요소는 값이 된다.</u>

```python
li = [["boy", "소년"], ["school", "학교"], ["book", "책"]]
dic = dict(li)
print(dic)
```

```
{'boy': '소년', 'school': '학교', 'book': '책'}
```

<u>리스트에 중복되는 키가 있으면 뒤쪽에 있는 키의 값이 적용된다.</u>

구조만 맞다면 튜플도 사전으로 바꿀 수 있다.

dict() -> 키와 밸류 정보(이중리스트) 있어야 사전으로 바뀐다.



- 사전의 활용



사전은 키의 중복을 허락하지 않는다는 점과, 연관된 정보를 저장한다는 면에서 유용하다.

이 특성을 이용하면 대량의 관련 정보를 저장할 수 있을 뿐만 아니라 <u>빠른 속도로 검색할 수 있다.</u>

[] 괄호만으로 추가 및 수정이 가능해 사용하기도 용이하다.

```python
song = """Some days, things just take way too much of my energy
I look up and the whole room's spinning
You take my cares away
I can so overcomplicate, people tell me to medicate
Feel my blood runnin', swear the sky's fallin'
How do I know if this shit's fabricated?
Time goes by and I can't control my mind
Don't know what else to try, but you tell me every time
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'"""

alphabet = dict()
# 한 문장씩 세고 싶다면 .splitlines()

for c in song:
    if c.isalpha() == False:
        continue # 알파벳이 아니라면 그다음으로 넘어감
    c = c.lower() # 알파벳이라면 소문자로 변환
    if c not in alphabet: # 사전에 문자가 없다면
        alphabet[c] = 1 # 알파벳을 추가하고, 1 값 넣기
    else:
        alphabet[c] += 1 # 알파벳이 있다면, 해당 알파벳에 +1

print(alphabet)
```

```
{'s': 18, 'o': 33, 'm': 14, 'e': 52, 'd': 17, 'a': 38, 'y': 14, 't': 40, 'h': 21, 'i': 30, 'n': 38, 'g': 6, 'j': 3, 'u': 9, 'k': 12, 'w': 8, 'c': 9, 'f': 5, 'r': 20, 'l': 14, 'p': 11, 'v': 2, 'b': 14}
```

결과는 정확하지만 출력문이 알파벳 순서가 이니어서 보기 어렵다.

사전은 순서가 없는 컬렉션이기 때문에 list로 변경 후 정렬한다.

```python
song = """Some days, things just take way too much of my energy
I look up and the whole room's spinning
You take my cares away
I can so overcomplicate, people tell me to medicate
Feel my blood runnin', swear the sky's fallin'
How do I know if this shit's fabricated?
Time goes by and I can't control my mind
Don't know what else to try, but you tell me every time
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'"""

alphabet = dict()
# 한 문장씩 세고 싶다면 .splitlines()

for c in song:
    if c.isalpha() == False:
        continue # 알파벳이 아니라면 그다음으로 넘어감
    c = c.lower() # 알파벳이라면 소문자로 변환
    if c not in alphabet: # 사전에 문자가 없다면
        alphabet[c] = 1 # 알파벳을 추가하고, 1 값 넣기
    else:
        alphabet[c] += 1 # 알파벳이 있다면, 해당 알파벳에 +1

key = list(alphabet.keys())
key.sort()
for c in key:
    num = alphabet[c] # key의 값을 대입
    print(c, "=>", num) # 순서대로 정렬된 키의 값의 밸류를 출력
```

```
a => 38
b => 14
c => 9
d => 17
e => 52
f => 5
g => 6
h => 21
i => 30
j => 3
k => 12
l => 14
m => 14
n => 38
o => 33
p => 11
r => 20
s => 18
t => 40
u => 9
v => 2
w => 8
y => 14
```

키의 목록을 구해 정렬하는 것이 번거로우면 a~z까지 순회하며 각 알파벳의 등장 횟수를 조사하는 방법도 있다.

```python
song = """Some days, things just take way too much of my energy
I look up and the whole room's spinning
You take my cares away
I can so overcomplicate, people tell me to medicate
Feel my blood runnin', swear the sky's fallin'
How do I know if this shit's fabricated?
Time goes by and I can't control my mind
Don't know what else to try, but you tell me every time
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'
Just keep breathin' and breathin' and breathin' and breathin'
And oh, I gotta keep, keep on breathin'"""

alphabet = dict()
# 한 문장씩 세고 싶다면 .splitlines()

for c in song:
    if c.isalpha() == False:
        continue # 알파벳이 아니라면 그다음으로 넘어감
    c = c.lower() # 알파벳이라면 소문자로 변환
    if c not in alphabet: # 사전에 문자가 없다면
        alphabet[c] = 1 # 알파벳을 추가하고, 1 값 넣기
    else:
        alphabet[c] += 1 # 알파벳이 있다면, 해당 알파벳에 +1

# key = list(alphabet.keys())
# key.sort()
# for c in key:
#     num = alphabet[c] # key의 값을 대입
#     print(c, "=>", num) # 순서대로 정렬된 키의 값의 밸류를 출력

for code in range(ord("a"), ord("z") + 1):
    c = chr(code)
    num = alphabet.get(c, 0)
    print(c, "=>", num)
```

```
a => 38
b => 14
c => 9
d => 17
e => 52
f => 5
g => 6
h => 21
i => 30
j => 3
k => 12
l => 14
m => 14
n => 38
o => 33
p => 11
q => 0
r => 20
s => 18
t => 40
u => 9
v => 2
w => 8
x => 0
y => 14
z => 0
```



#### 10.2 집합



- 집합의 정의



집합은 여러가지 값의 모임이다. 

<u>집합을 정의할 때는 {} 괄호 안에 키를 콤마로 구분하여 나열한다.</u>

<u>사전을 정의하는 괄호와 같지만 값은 없고 키만 있다는 점이 다르다.</u>

순서는 중요치 않기 때문에 원본과 달라진다.

```python
asia = {"korea", "china", "japan", "korea"}
print(asia)
```

```
{'japan', 'china', 'korea'}
```

집합은 값을 포함하고 있느냐 아니냐만 중요할 뿐이기 때문에 키의 중복은 허락하지 않으며 순서도 별 의미가 없다. 

<u>set() 함수는 빈 집합을 만들기도 하고, 다른 컬렉션을 집합형으로 변환하기도 한다.</u>

```python
.set(다른시퀀스) # 집합으로 변환, 다른 시퀀스에는 사전은 오지 못한다.
.add(값) # 값 추가, 동일한 데이터가 있다면 효과는 없다.
.remove(값) # 값 제거, 값이 없으면 예외처리된다.
.update(추가할집합) # 집합끼리 결합해 합집합을 만든다.
```

```python
print(set("sanghyung")) # 문자 중복 제거
print(set([12,34, 56, 78]))
print(("신지희", "한주환", "김태륜"))
print(set({"boy":"소년", "girl":"소녀", "book":"책"}))
# 사전은 시퀀스가 아니기 때문에 key 파트만 집합으로 바꾼다.
print(set())
```

```
{'a', 'n', 'g', 'u', 's', 'y', 'h'}
{56, 34, 12, 78}
('신지희', '한주환', '김태륜')
{'boy', 'book', 'girl'}
set()
```

<u>{}는 비어있는 집합이 아니다. 비어있는 사전이기 때문에 빈 집합은 set()이다.</u>

```python
asia = {"korea", "china", "japan"}
asia.add("vietnam") # 추가
asia.add("china") # 중복 허용 X, 추가 안 됨
asia.remove("japan")
print(asia)

asia.update({"singapore", "hongkong", "korea"}) # korea 중복이므로 추가 X
print(asia)
```

```
{'china', 'vietnam', 'korea'}
{'china', 'singapore', 'vietnam', 'hongkong', 'korea'}
```



- 집합 연산



| 연산          | 기호 | 메서드                 | 설명                                                         |
| ------------- | ---- | ---------------------- | ------------------------------------------------------------ |
| 합집합        | \|   | union                  | 두 집합의 모든 원소                                          |
| 교집합        | &    | intersection           | 두 집합 모두에 있는 원소                                     |
| 차집합        | -    | difference             | 왼쪽 집합의 원소 중 오른쪽 집합의 원소를 뺀 것               |
| 배타적 차집합 | ^    | symmetric _ difference | 한쪽 집합에만 있는 원소의 합(서로 유일한 것)(합집합 - 교집합) |

```python
twox = {2, 4, 6, 8, 10, 12}
threex = {3, 6, 9, 12, 15}

print("교집합", twox & threex)
print("합집합", twox | threex)
print("차집합", twox - threex)
print("차집합2", threex - twox)
print("배타적 차집합", twox ^ threex)
```

```
교집합 {12, 6}
합집합 {2, 3, 4, 6, 8, 9, 10, 12, 15}
차집합 {8, 2, 10, 4}
차집합2 {9, 3, 15}
배타적 차집합 {2, 3, 4, 8, 9, 10, 15}
```

| 연산          | 기호 | 메서드     | 설명                                 |
| ------------- | ---- | ---------- | ------------------------------------ |
| 부분집합      | <=   | issubset   | 왼쪽이 오른쪽의 부분집합인지 조사    |
| 진성 부분집합 | <    |            | 부분집합이면서 여분의 원소가 더 있음 |
| 포함집합      | >=   | issuperset | 왼쪽이 오른쪽 집합을 포함하는지 조사 |
| 진성 포함집합 | >    |            | 포함집합이면서 여분의 원소가 더 있음 |

```python
mammal = {"코끼리", "고릴라", "사자", "사람", "원숭이", "개"}
primate = {"사람", "원숭이"}

if "사자" in mammal:
    print("사자는 포유류이다")
else:
    print("사자는 포유류가 아니다")

print(primate <= mammal)
print(primate < mammal)
print(primate <= primate)
print(primate < primate)
```

```
사자는 포유류이다
True
True
True
False
```

한쪽의 모든 원소가 다른 집합에 포함되면 부분집합이라고 한다. 모든 영장류는 포유류의 일종이므로 영장류가 포유류의 부분집합이다.

진성 부분집합은 포함한 쪽에서 여분의 원소를 더 가지는 것을 말하며 한쪽이 더 넓은 범위를 포괄한다는 뜻.

포유류는 영장류를 포괄하면서 영장류 외의 동물이 더 있다. 

따라서 포유류는 영장류의 진성 부분집합이다. 같은 집합끼리 부분집합은 성립하지만 진성 부분집합은 아니다. 포함집합은 부분집합의 반대 개념이다.

frozenset은 변경 불가능한 집합이다.

set과 frozenset은 리스트와 튜플의 관계와 비슷하며, 편집할 필요가 없다면 frozenset을 사용하는 것이 유리하다.