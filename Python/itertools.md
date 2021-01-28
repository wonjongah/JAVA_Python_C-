#### 효율적인 반복에 유용한 itertools 함수



##### itertools란?



Python에서 제공하는 자신만의 반복자를 만드는 모듈이다.



##### 패키지 임포트



```python
import itertools
```



##### 주요 함수



- chain(iterable)

리스트(list, tuple, iterable)을 연결한다.

```python
import itertools

s = ["z", "x", "v"]
n = [1, 2, 3, 4, 5]

print(list(itertools.chain(s, n)))
```

```
['z', 'x', 'v', 1, 2, 3, 4, 5]
```



- repeat(object[, times])

object를 times 만큼 반복한다.

```python
import itertools

n = [1, 2, 3]
print(list(itertools.repeat(n, 3)))
```

```
[[1, 2, 3], [1, 2, 3], [1, 2, 3]]
```



- chain.from_iterable(repeat(object, times))

chain()과 repeat()를 사용해 한 리스트를 times 만큼 반복해 요소로 만들 수 있다.

```python
from itertools import chain, repeat

n = [1, 2, 3]
print(list(chain.from_iterable(repeat(n, 3))))
```

```
[1, 2, 3, 1, 2, 3, 1, 2, 3]
```



- count(start = 0[, step = 1])

start부터 시작해 step 만큼 띄우면서 무한한 이터레이터를 만든다.

연속적인 데이터 포인트 생산을 위해 map()의 입자로, 시퀀스 번호를 추가하기 위해 zip()과도 사용된다.

```python
from itertools import count

# for n in count(10):
#     print(n)
# 10 11 12 13 ...........

for n, s in zip(count(10), ["a", "b", "c", "d"]):
    print(n, s)

for n, s in zip(count(100, 2), ["e", "f", "g", "h"]):
    print(n, s)
```

```
10 a
11 b
12 c
13 d
100 e
102 f
104 g
106 h
```



- islice(iterable, stop) or islice(iterable, start, stop[, step])

stop만 입력한 경우, stop까지의 요소를 반환하는 이터레이터를 만든다.

start와 stop을 같이 입력한 경우, start부터 시작해 stop까지 선택된 요소를 반환하는 이터레이터를 만든다. 끝까지 하고 싶다면 stop에 None을 입력하면 된다.

```python
from itertools import islice

s = "ABCDEFG"
print(list(islice(s, 2)))
print(list(islice(s, 2, 4)))
print(list(islice(s, 2, None)))
print(list(islice(s, 0, None, 2)))

for i in islice(range(10), 3, None, 2):
    print(i, end=" ")
```

```
['A', 'B']
['C', 'D']
['C', 'D', 'E', 'F', 'G']
['A', 'C', 'E', 'G']
3 5 7 9
```



- cycle(iterable)

iterable을 무한히 반복한다.

```python
from itertools import cycle

# print(list(cycle("ABC"))) # A B C A B C ... 무한 반복

for n, i in zip(cycle(range(2)), "abcd"):
    print(f"{n}, {i}")
```

```
0, a
1, b
0, c
1, d
```



- dropwhile(predicate, iterable)

predicate가 참인 한 iterable에서 요소를 걸러내는 이터레이터를 만든다.

즉, 조건에 True인 값이면 제외하고, 조건에 False일 때부터 포함시켜 이터레이터 만든다.

```python
from itertools import dropwhile

print(list(dropwhile(lambda x: x < 5, [1, 2, 3, 6, 5, 4, 3, 2, 1])))
# 6부터 조건에 맞지 않기 시작했으므로 6부터 마지막까지 리턴
```

```
[6, 5, 4, 3, 2, 1]
```



- takewhile(predicate, iterable)

predicate가 참인 한 iterable에서 요소를 반환하는 이터레이터를 만든다.

조건이 True일 때만 요소 포함, False이기 시작하면 그 뒤는 드랍시킨다.

```python
from itertools import takewhile

print(list(takewhile(lambda x: x < 5, [1, 2, 3, 6, 5, 4, 3, 2, 1])))
```

```
[1, 2, 3]
```



- groupby(interable, key=None)

key를 이용해 그룹끼리 묶어주는 함수이다.

일반적으로 iterable은 같은 키 함수로 이미 정렬되어 있어야 한다.

```python
from itertools import  groupby

n = [("문과", "사회학"),
    ("이과", "컴퓨터공학"),
    ("문과", "문헌정보"),
    ("문과", "경제학과"),
    ("이과", "생명공학"),
    ("이과", "화학과"),
    ("예체능", "순수미술")]

category = {}
# key 값을 이용해 group으로 묶는다.
for key, group in groupby(sorted(n), lambda x:x[0]):
    new_li = [x[1] for x in list(group)] # key 값 리스트화
    category[key] = new_li # 사전에 key와 value들을 넣는다.

print(category)
```

```
{'문과': ['경제학과', '문헌정보', '사회학'], '예체능': ['순수미술'], '이과': ['생명공학', '컴퓨터공학', '화학과']}
```



---------------------------



##### 경우의 수



- permutations(iterable, r=None)

iterable에서 요소에서 r개의 길이로 가능한 모든 순서를 반환한다. 순서가 상관있고, 반복값이 없다.

즉, 순열을 반환한다. nPr

서로 다른 n개 중에 r개를 나열하는 경우의 수이다.

<u>순서 O</u>

```python
from itertools import permutations

n = list(permutations("ABCD", 2))
print(n)
print("ABCD 중 2개의 요소로 나열할 수 있는 경우의 수 :", len(n))
```

```
[('A', 'B'), ('A', 'C'), ('A', 'D'), ('B', 'A'), ('B', 'C'), ('B', 'D'), ('C', 'A'), ('C', 'B'), ('C', 'D'), ('D', 'A'), ('D', 'B'), ('D', 'C')]
ABCD 중 2개의 요소로 나열할 수 있는 경우의 수 : 12
```



- product(iterables, repeat=1)

중복순열을 뜻한다.

중복 가능한 n개 중에 r개를 나열하는 경우의 수로 순서가 상관있다.

자기 자신과의 조합도 세보는 셈, n^r

<u>순서 O</u>

```python
from itertools import product

n = list(product("ABCD", repeat=2))
print(n)
print("ABCD 중 2개의 요소로 나열할 수 있는 자기자신을 포함한 모든 경우의 수 :", len(n))
```

```
[('A', 'A'), ('A', 'B'), ('A', 'C'), ('A', 'D'), ('B', 'A'), ('B', 'B'), ('B', 'C'), ('B', 'D'), ('C', 'A'), ('C', 'B'), ('C', 'C'), ('C', 'D'), ('D', 'A'), ('D', 'B'), ('D', 'C'), ('D', 'D')]
ABCD 중 2개의 요소로 나열할 수 있는 자기자신을 포함한 모든 경우의 수 : 16
```



- combinations(iterables, r)

조합을 의미한다.

서로 다른 n개 중에 r개를 선택하는 경우의 수이다. 순서가 중복이 없다. 

nCr

<u>순서 X</u>

```python
from itertools import combinations

n = list(combinations("ABCD", 2))
print(n)
print("ABCD 중 2개의 요소로 중복 없이 선택하는 경우의 수 :", len(n))
```

```
[('A', 'B'), ('A', 'C'), ('A', 'D'), ('B', 'C'), ('B', 'D'), ('C', 'D')]
ABCD 중 2개의 요소로 중복 없이 선택하는 경우의 수 : 6
```



- combinations_with_replacement(iterables, r)

중복조합을 의미한다.

중복 가능한 n개 중에 r개를 선택하는 경우의 수이다. 순서를 따지지 않는다.

<u>순서 X</u>

```python
from itertools import combinations_with_replacement

n = list(combinations_with_replacement("ABCD", 2))
print(n)
print("ABCD 중 2개의 요소로 자기자신을 포함해 뽑는 경우의 수 :", len(n))
```

```
[('A', 'A'), ('A', 'B'), ('A', 'C'), ('A', 'D'), ('B', 'B'), ('B', 'C'), ('B', 'D'), ('C', 'C'), ('C', 'D'), ('D', 'D')]
ABCD 중 2개의 요소로 자기자신을 포함해 뽑는 경우의 수 : 10
```

