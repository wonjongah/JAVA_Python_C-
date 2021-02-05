#### 14.1 파일 입출력



- 파일쓰기



파이썬의 파일 입출력 기능은 유닉스 것을 그대로 따왔으며 이점은 C도 마찬가지이다. 

파일 입출력을 위해 위치를 확인하고 버퍼를 준비해야 하는데, 이 과정을 오픈이라고 한다.

다음 함수로 파일을 연다.

```python
open(파일경로, 모드) # 파일을 열어야 파일 속 내용을 조작할 수 있음
# encoding 옵션을 줄 수 있다.
# 파일이 있으면 열고, 없으면 새로 만든다.
```

파일 경로는 입출력 대상 파일의 이름이다.

디렉토리 경로를 포함할 수 있되 파일명만 있으면 현재 디렉토리에서 찾는다.

모드는 읽기, 쓰기, 추가 등 파일로 무엇을 할 것인가를 지정하며, 읽을 파일이 없거나 생성할 파일이 이미 있을 때의 처리 방식을 결정한다.

| 모드 | 설명                                                         |
| ---- | ------------------------------------------------------------ |
| r    | 파일을 읽는다. 파일이 없으면 예외 발생.                      |
| w    | 파일에 기록한다. 파일이 이미 있으면 덮어쓴다. 파일의 처음부터 접근. 기존 내용을 다 버리고 처음부터 다시 쓰기. |
| a    | 파일에 데이터를 추가한다. 기존을 살리고 맨 마지막에 추가하는 방식. |
| x    | 파일에 기록하되 파일이 이미 있으면 실패한다.                 |

open, read는 파일포인터가 0이다. 모드 "at"를 주면 이미 있는 포인터 끝을 가리킨다.

| 모드2 | 설명               |
| ----- | ------------------ |
| t     | text 모드로 열기   |
| b     | binary 모드로 열기 |

t와 b 둘 중 하나를 골라 써야 한다. 이진 파일은 있는 그대로 쓰는 데 비해 텍스트 파일은 개행 코드를 운영체제에 맞게 바꿔준다.

디폴트 모드는 텍스트 파일 읽기 모드인 "rt"이다.

open 함수는 파일 입출력을 준비하고 파일 객체를 리턴하는데 이 객체의 메서드로 입출력을 수행한다.

데이터를 기록할 대는 출력할 데이터를 인수로 전달해 write 메서드를 호출한다. 

파일을 다 사용한 후 close 메서드로 닫아 뒷정리를 수행한다.

open -> 읽기 or 쓰기(try & except) -> close(finally)

 

ex)

```python
f = open("live.txt", "wt")
f.write("""삶이 그대를 속일 지라도
슬퍼하거나 노하지 말라!
우울한 날들을 견디면
믿으라, 기쁨의 날이 오리니""")
f.close()
```

경로 지정 없이 파일명만 주었으니 현재 디렉토리에 생성되며 같은 이름의 파일이 있으면 덮어쓰고 새로 만든다.



- 파일 읽기



파일에서 데이터를 읽을 때는 분량에 따라 적당한 함수를 골라 사용한다.

```python
file.read() # 파일 전체 읽어서 리턴, text, binary 공통
file.read(n) # n 바이트 수만큼 읽어서 리턴, binary
file.readline() # 개행문자 포함해 한 줄씩 읽어들인다. 파일 마지막에 도달하면 빈 문자열 리턴. text
file.readlines() # 전체 읽어 한 줄씩 문자열로 만들어 리스트 리턴. text
```

ex)

```python
try:
    f = open("live.txt", "rt")
    text = f.read()
    print(text)
except FileExistsError:
    print("파일이 없습니다.")
finally:
    f.close()
```

read 함수는 파일 전체를 한 번에 읽을 수 있어 편리하지만 대용량의 파일을 읽을 때는 메모리를 많이 소모하는 단점이 있다.

아주 큰 파일을 읽을 때는 read 함수의 인수로 읽을 양을 지정해 조금씩 끊어서 읽어 들여야 한다.

```python
f = open("live.txt", "rt")
while True:
    text = f.read(10) # 10 바이트씩 읽어들인다.
    if len(text) == 0:  break # 읽어들인 것이 없을 때 = 읽는 것이 끝났을 때
    print(text, end = "")
f.close()
```

```
text = f.read(1) # 입출력 횟수가 많아지고 느리다.
text = f.read(1024) # 모아서 한꺼번에 처리한다.
```

한 번에 읽을 양은 적당히 결정하되 너무 작으면 읽는 횟수가 많아져 느리므로 넉넉하게 큰 덩어리로 읽는 것이 유리하다.

readline 함수는 한 줄씩 읽으며, 파일 마지막에 도달하면 빈 문자열을 리턴한다.

```python
f = open("live.txt", "rt")
text = ""
line = 1
while True:
    row = f.readline()
    if not row : break # 다 읽었으면, 빈 문자열을 리턴하면
    text += str(line) + " : " + row
    line += 1
f.close()
print(text)
```

```
1 : 삶이 그대를 속일 지라도 # 끝에 개행문자 포함!
2 : 슬퍼하거나 노하지 말라!
3 : 우울한 날들을 견디면
4 : 믿으라, 기쁨의 날이 오리니
```

readlines 함수는 파일 전체를 읽어서 한 줄씩 문자열로 만들어 리스트를 리턴한다.

리스트를 순회하며 전체 파일을 다 출력할 수도 있고 []로 각 줄을 개별적으로 읽을 수도 있다.

```python
f = open("live.txt", "rt")
rows = f.readlines()
for row in rows:
    print(row, end = "")
f.close()
```

각 줄 끝에 개행문자가 포함되어 있어, end에 아무것도 설정하지 않았다.

파일 또한 리스트와 같은 컬렉션이어서 파일 자체에 대해 루프를 돌 수도 있다.

```python
f = open("live.txt", "rt")
for line in f:
    print(line, end = "")
f.close()
```



```python
with ~ as 문 (컨텍스트 매니저)
with의 코드 블럭을 벗어날 때 자동 close()해준다.
만일 open에서 실패하면 close()도 하지 않는다. 열질 못했으니까 닫을 필요도 없기 때문.
ex) with open("test.txt", "r") as file: 
```



- 입출력 위치



파일 객체는 다음 입출력 위치를 기억한다.

파일을 순서대로 읽는 방식을 <u>순차 접근</u>이라고 한다.

대개 처음부터 끝까지 다 읽어 메모리로 로드하는 방식을 쓴다.

반면, 입출력 위치를 바꿔가며 파일의 원하는 부분을 자유롭게 액세스하는 방식을 <u>임의 접근</u>이라고 한다.

현재 입출력 위치를 조사할 때는 tell 함수를 호출해 위치를 변경할 때는 seek 함수를 사용한다.

```python
seek(위치, 기준)
# 위치 : 기준으로부터 얼마나 떨어진 곳인지 정수로 지정 (음수 지정 가능)(한글 주의)
# 기준 : 0 - 파일 처음 위치, 1 : 현재 위치, 2 : 파일 끝 위치
```

```python
f = open("live.txt", "rt")
f.seek(12, 0) # 0, 처음부터, 12만큼 떨어진 곳부터
text = f.read()
f.close()
print(text)
```

```
속일 지라도
슬퍼하거나 노하지 말라!
우울한 날들을 견디면
믿으라, 기쁨의 날이 오리니
```

한글은 2바이트를 차지해 건너뛴 수와 글자수는 약간 다르다.

임의 접근은 인코딩 방식이 가변적인 텍스트 파일에는 적용하기 어려우며 길이가 일정한 이진 파일에 주로 사용한다. 

예를 들어 주소록의 한 사람의 정보 크기가 32바이트씩일 때 64바이트를 건너뛴 후 읽으면 세 번째 사람의 정보를 바로 구할 수 있다.

```python
# 저장
pickle.dump(data, file)
# 로드
data = pickle.load(file)
```



- 내용 추가



```python
f = open("live.txt", "at")
f.write("\n\nby 푸쉬킨")
f.close()
f = open("live.txt", "rt")
```



파일을 확실히 닫기 위해 with 블록을 사용한다.

with 구문으로 파일을 열고 as 구문으로 파일 객체에 대입한 후 with 블록에서 파일을 사용해 입출력한다. with 블록을 벗어나면서 파일이 자동으로 닫히며 입출력 중에 예외가 발생해도 파일은 반드시 닫힌다.

ex)

```python
with open("live.txt", "rt") as f:
    text = f.read()
print(text)
```



#### 14.2 파일 관리



- 파일 관리 함수



파일 입출력 함수는 파일에 저장된 내용을 다루는 데 비해 파일 관리 함수는 파일 자체를 다룬다.

os 모듈과, shutil 모듈에 정의되어 있다.

| 함수                  | 설명                                                 |
| --------------------- | ---------------------------------------------------- |
| shutil.copy(a, b)     | 파일을 복사한다.                                     |
| shutil.copytree(a, b) | 디렉토리를 복사한다. 서브디렉토리까지 전부 복사한다. |
| shutil.move(a, b)     | 파일을 이동한다.                                     |
| shutil.rmtree(path)   | 디렉토리를 삭제한다.                                 |
| os.rename(a, b)       | 파일 이름을 변경한다.                                |
| os.remove(f)          | 파일을 삭제한다.                                     |
| os.chmod(f, m)        | 파일의 퍼미션을 변경한다.                            |
| shutil.chown(f, u, g) | 파일의 소유권을 변경한다.                            |
| os.link(a, b)         | 하드 링크를 생성한다.                                |
| os.symlink(a, b)      | 심볼릭 링크를 생성한다.                              |

ex)

```python
import shutil

shutil.copy("live.txt", "live2.txt") # live.txt 내용을 복사해 live2.txt 파일 생성
```



- 디렉토리 관리 함수



| 함수          | 설명                                    |
| ------------- | --------------------------------------- |
| os.chdir(d)   | 현재 디렉토리를 변경한다.               |
| os.mkdir(d)   | 디렉토리를 생성한다.                    |
| os.rmdir(d)   | 디렉토리를 제거한다.                    |
| os.getcwd()   | 현재 디렉토리를 조사한다.               |
| os.listdir(d) | 디렉토리안의 목록을 나열한다.           |
| glob.glob(p)  | 패턴과 일치하는 파일의 목록을 나열한다. |

디렉토리 경로가 여러 개의 요소로 구성된 포맷은 정확하게 다루기 어렵다. os.path 모듈에는 디렉토리의 경로를 조사하고 조작하는 여러가지 함수가 제공된다.

| 함수                | 설명                                                       |
| ------------------- | ---------------------------------------------------------- |
| os.path.isabs(f)    | 절대 경로인지 조사한다.                                    |
| os.path.abspath(f)  | 파일의 절대 경로를 구한다.                                 |
| os.path.realpath(f) | 원본 파일의 경로를 구한다.                                 |
| os.path.exists(f)   | 파일의 존재 여부를 조사한다.                               |
| os.path.isfile(f)   | 파일인지 조사한다. 파일이면 참, 디렉토리이면 거짓 리턴     |
| os.path.isdir(f)    | 디렉토리인지 조사한다. 디렉토리이면 참, 파일이면 거짓 리턴 |



write 함수는 파일이 없으면 만들지만 디렉토리는 만들어지지 않는다.

디렉토리가 있는 지 없는지 먼저 확인 후(os.path.exsits) -> 없으면 디렉토리를 만들어야 한다.(os.mkdir)



```python
import os

files = os.listdir("c:\\workspace") // workspace 디렉토리에 있는 목록을 열거한다.
for f in files:
    print(f)
```

```
.git
algorithm
android-ex
arduino LED practice.code-workspace
basic_of_AI
bigdata
DataStructure_codingTest
iot
iot_web_service
java
JAVA_Python_C++
kotlin-ex
mariadb
mongodb
openCV
opencv-ex
project
pymongo-ex
python
README.md
tf
webclient
인터페이스 실습코드
```



```python
import os

def dumpdir(path):
    files = os.listdir(path)
    for f in files:
        fullpath = path + "\\" + f
        if os.path.isdir(fullpath):
            print("[" + fullpath + "]")
            dumpdir(fullpath)
        else:
            print("\t" + fullpath)

dumpdir("c:\\workspace\\bigdata")
```

```
[c:\workspace\bigdata\.git]
        c:\workspace\bigdata\.git\COMMIT_EDITMSG
        c:\workspace\bigdata\.git\config
        c:\workspace\bigdata\.git\description
        c:\workspace\bigdata\.git\HEAD
[c:\workspace\bigdata\.git\hooks]
        c:\workspace\bigdata\.git\hooks\applypatch-msg.sample
        c:\workspace\bigdata\.git\hooks\commit-msg.sample
        c:\workspace\bigdata\.git\hooks\fsmonitor-watchman.sample
        c:\workspace\bigdata\.git\hooks\post-update.sample
        c:\workspace\bigdata\.git\hooks\pre-applypatch.sample
        c:\workspace\bigdata\.git\hooks\pre-commit.sample
        c:\workspace\bigdata\.git\hooks\pre-push.sample
        c:\workspace\bigdata\.git\hooks\pre-rebase.sample
        c:\workspace\bigdata\.git\hooks\pre-receive.sample
        c:\workspace\bigdata\.git\hooks\prepare-commit-msg.sample
        c:\workspace\bigdata\.git\hooks\update.sample
        c:\workspace\bigdata\.git\index
[c:\workspace\bigdata\.git\info]
        c:\workspace\bigdata\.git\info\exclude
[c:\workspace\bigdata\.git\logs]
        c:\workspace\bigdata\.git\logs\HEAD
[c:\workspace\bigdata\.git\logs\refs]
[c:\workspace\bigdata\.git\logs\refs\heads]
        c:\workspace\bigdata\.git\logs\refs\heads\main
[c:\workspace\bigdata\.git\logs\refs\remotes]
[c:\workspace\bigdata\.git\logs\refs\remotes\origin]
        c:\workspace\bigdata\.git\logs\refs\remotes\origin\main
[c:\workspace\bigdata\.git\objects]
[c:\workspace\bigdata\.git\objects\12]
        c:\workspace\bigdata\.git\objects\12\2c5f2799058bf023405437c934ae4f0177ed25
[c:\workspace\bigdata\.git\objects\29]
        c:\workspace\bigdata\.git\objects\29\2f147d79254e162c3e75180837079db61ac577
[c:\workspace\bigdata\.git\objects\49]
        c:\workspace\bigdata\.git\objects\49\ec3eb16f69c154cd0778a023d06807215897ed
[c:\workspace\bigdata\.git\objects\71]
        c:\workspace\bigdata\.git\objects\71\fd50f50d7a2c4054d128c7e0fd1ac889174b50
[c:\workspace\bigdata\.git\objects\86]
        c:\workspace\bigdata\.git\objects\86\ebd9f71defc907963aa484b1fdde7c4d66b380
[c:\workspace\bigdata\.git\objects\c3]
        c:\workspace\bigdata\.git\objects\c3\ecd6c8d4ebf884c3fe0c1f61fecdfabd31eb17
[c:\workspace\bigdata\.git\objects\info]
[c:\workspace\bigdata\.git\objects\pack]
[c:\workspace\bigdata\.git\refs]
[c:\workspace\bigdata\.git\refs\heads]
        c:\workspace\bigdata\.git\refs\heads\main
[c:\workspace\bigdata\.git\refs\remotes]
[c:\workspace\bigdata\.git\refs\remotes\origin]
        c:\workspace\bigdata\.git\refs\remotes\origin\main
[c:\workspace\bigdata\.git\refs\tags]
        c:\workspace\bigdata\README.md
[c:\workspace\bigdata\데이터 크롤링]
[c:\workspace\bigdata\데이터 크롤링\chapter01. 크롤링의 종류]
        c:\workspace\bigdata\데이터 크롤링\chapter01. 크롤링의 종류\chapter01.md
```

dumpdir 함수는 인수로 받은 경로에 대해 listdir 함수로 파일 목록을 얻어 출력한다.

isdir 함수로 디렉토리인지 조사, 서브디렉토리인 경우 재귀호출해 디렉토리 내부를 다시 살핀다.