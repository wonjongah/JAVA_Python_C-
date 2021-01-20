## 반복문과 배열 그리고 예외 처리



------



#### 3.1 반복문



- for 문



```java
for(초기문; 조건식; 반복 후 작업){
... 작업문 ...
}
```



초기문은 조건식에서 사용하는 변수를 초기화한다. 

초기문은 시작할 때만 한 번 수행된다. 콤마로 분리하여 여러 문장을 나열할 수 있다. 초기문은 빈 상태로 두어도 되지만 세미콜론(;)은 있어야 한다.



조건식에는 논리형 변수나 논리 연산을 사용한다.

조건식의 결과가 true이면 반복이 계속되고, false이면 for 문을 벗어난다. 조건식에 true가 있거나 비어있으면 무한반복 된다.



반복 후 작업은 작업문이 실행된 후 실행된다. 



작업문은 for 문이 반복되는 동안 반복 실행된다.



- 반복문에 변수 선언



```java
for(int i = 0; i < 10; i++){ // 변수 i는 for 문 밖에서 사용 불가
System.out.print(i);
}
```



변수 i를 for 문 블록 내에서만 사용되는 지역 변수로 선언하여 사용할 수 있다. 이때 변수 i는 for문 밖에서는 사용 불가하다.



- while 문



```java
while(조건식){
... 작업문 ...
}
```



while 문은 반복 횟수를 알 수 없는 경우에 적합하다. for문과 다르게, while 문에 조건식이 없으면 컴파일 오류가 발생한다. 

while 문을 사용할 때, 조건식의 변수를 while 문 밖에 초기화하는 것, 반복이 진행되면서 조건식이 false가 되어 반복문을 빠져나오게 설계하는 것을 잊지 말아야 한다.



- do-while문



```java
do{
...작업문...
}while(조건식);
```



do-while 문의 조건식은 while 문과 동일하며 조건식이 없으면 컴파일 오류가 발생한다. 다른 반복문과 달리, do-while 문은 작업문 실행 후 조건식을 검사하므로 작업문이 최초 한 번은 반드시 실행된다.

do-while 문의 조건식에 사용되는 변수는 do-while 문 이전에 반드시 초기화가 되어 있어야 하며, 무한 반복에 빠지지 않도록 설계해야 한다.



for 문 -> 반복 횟수와 범위가 명확한 경우

while or do-while 문 -> 반복 횟수를 처음부터 알 수 없고, 반복이 진행되면서 평가되어야 하는 경우



- 중첩 반복



반복 안의 반복을 중첩 반복(nested loop라고 한다. 



#### 3.2 continue 문과 break 문



반복문 내에 continue 문과 break 문을 이용해 반복의 흐름을 바꾸거나 반복에서 벗어나게 할 수 있다.



- continue 문



```java
continue;
```



for 문 -> continue를 만나면 반복 후 작업으로 간다.

while 문 -> 조건식으로 간다.

do-while문 -> 조건식으로 간다.



- break 문



break 문은 하나의 반복문을 즉시 벗어날 때 사용하며 다음과 같이 사용한다.



```java
break;
```



break 문은 하나의 반복문만 벗어난다. 따라서 중첩 반복의 경우 안쪽 반복문만 벗어난다. 



#### 3.3 배열



배열(array)은 인덱스(index)와 인덱스에 대응하는 데이터들로 이루어진 연속적인 자료구조로 같은 종류의 데이터들이 순차적으로 저장된다.



- 배열 선언 및 생성



자바에서 배열의 생성은 C/C++와 달리 두 단계를 거친다.

1. 배열에 대한 레퍼런스 변수 선언 

```java
int intArray []; // 배열의 레퍼런스 변수 intArray 선언
```

배열을 가리킬 변수 선언

2. 배열 생성 - 배열의 저장 공간 할당

```java
intArray = new int[5]; // 데이터를 저장할 배열 공간 할당
```



- 배열의 레퍼런스 변수 선언



```java
int intArray []; // 배열의 레퍼런스 변수 intArray 선언
```

이 선언만으론 배열 공간 할당은 되지 않는다. 배열 공간의 주소 값(레퍼런스 값)을 가지며 그 자체가 배열은 아니다. 아직 배열 공간이 생성되지 않았으므로 intArray는 null을 가진다.

```java
int intArray[];
int [] intArray;
```

위와 같이 두 가지 방법으로 배열의 레퍼런스 변수를 선언할 수 있다.



- 배열 선언 시 []에 크기를 지정하면 안 된다



배열 선언 시 []안에 배열의 크기를 지정하면 컴파일 오류가 난다.

```java
int intArray[10]; // 컴파일 오류
```



- 배열 생성



데이터를 저장할 데이터를 저장할 배열 공간을 할당받는 과정이다. new 연산자를 이용하여 배열을 생성하고 [] 안에 생성할 원소 개수를 지정한다.

```java
intArray = new int[5]; // 정수 5개의 배열 공간 할당받고, 이 배열의 레퍼런스 값을 intArray에 저장
```

이 두 과정을 통해 intArray를 배열로 사용할 수 있다.



- 배열의 선언과 동시에 생성



```java
int intArray[] = new int[5];
```



- 배열 초기화



배열 선언문에서 {}에 원소를 나열하면 초기화된 배열을 만들 수 있다. 

```java
int intArray[] = {4, 3, 2, 1, 0};
double doubleArray[] = {0.1, 2.3, 0.03};
```

intArray 배열의 크기는 자동으로 5가 되며, doubleArray 배열의 크기는 자동으로 3이 된다. 생성되는 배열의 원소 개수는 {}에 나열된 값의 개수로 정해지므로 []에 크기를 주어선 안 된다.



- 배열 인덱스와 배열 원소 접근



배열의 인덱스는 정수만 가능하다. 인덱스는 0부터 시작하며 마지막 원소의 인덱스는 (배열 크기 -1)이다. 배열의 원소를 인덱스를 이용해 접근 가능하다.

```java
int intArray[] = new int[5];
intArray[0] = 5; // 원소 0에 5 저장
intArray[3] = 6;
int n = intArray[3]; //원소 3의 값을 읽어 n에 저장, n은 6이 된다.
```

```java
n = intArray[-2]; // error, 인덱스로 음수 사용 불가
n = intArray[5]; // error, 5는 인덱스 범위(0~4) 넘어섬
```

인덱스는 음수 사용 불가, 또한 배열의 범위를 넘어서 접근한 경우도 에러가 난다.

```java
int intArray []; // 레퍼런스만 선언
intArray[1] = 8; // error, 생성되지 않은 배열 사용
```



- 레퍼런스 치환과 배열 공유



자바에서 레퍼런스 변수와 배열 공간이 분리되어 있기 때문에, 다수의 레퍼런스 변수가 하나의 배열 공간을 가리키는 배열 공유가 쉽게 이루어진다.

```java
int intArray[] = new int[5];
int myArray[] = intArray; // 레퍼런스 치환, myArray는 intArray와 동일한 배열 참조
```

레퍼런스 치환으로 두 레퍼런스가 하나의 배열 공유하는 모습.

intArray 배열을 복사한 것이 아니라, 배열의 주소만 복사된다. myArray는 intArray와 동일한 레퍼런스 값을 갖게 되어 myArray는 intArray의 배열을 공유하게 되고, 배열의 원소 또한 접근 가능하다.



- 배열의 크기, length 필드



자바는 배열을 객체로 다룬다. 배열이 생성되면 객체가 생성된다. 이 객체에는 배열의 저장 공간과 함께 배열의 크기 값을 가진 length 필드가 존재한다.

```java
int intArray[] = new int[5];
int size = intArray.length; // size는 5
```

배열 객체는 length 필드가 있기 때문에, 프로그램에서 배열 크기를 따로 관리하지 않아도 된다.

```java
for(int i = 0; i < intArray.length; i++){ // 배열의 크기만큼 반복하는 코드
System.out.println(intArray[i]);
}
```

위와 같이 유용하게 사용한다.



- 배열과 for-each 문



기존의 for 문을 변형하여, 배열이나 나열(enumeration)의 크기만큼 루프를 돌면서 각 원소를 순차적으로 접근하는데 유용하게 만드는 for 문을 for-each 문이라고 부르며, 구조는 다음과 같다.

```java
for(변수 : 배열레퍼런스){
.. 반복 작업문 ...
}
```

배열 n에 들어있는 모든 정수를 더하는 코드를 for-each 문으로 작성하면 다음과 같다.

```java
int []n = {1,2,3,4,5};
int sum = 0;
for(int k : n){
sum += k;
}
System.out.println("합은 " + sum);
```

앞의 for-each 문은 k = n[0], n[1], n[2], n[3], n[4] 값으로 바꾸면서, 배열 n의 크기만큼 반복한다.

문자열, 나열 타입(enum) 또한 for-each 문을 사용할 수 있다.

```java
String names[] = {"사과", "배", "체리"};
for(String s : names){
System.out.print(s + " ");
}
```

```java
enum Week {월, 화, 수, 목, 금, 토, 일}
for (Week day : Week.values()){
System.out.println(day + "요일 ");
}
```



#### 3.4 다차원 배열



- 2차원 배열

- 2차원 배열 선언과 생성

1차원 배열과 마찬가지로 2차원 배열도 레퍼런스 변수 선언 후 배열을 생성한다.

```java
int intArray[][];
char charArray[][];
double doubleArray[][];
```

또는

```java
int [][] intArray;
char [][] charArray;
double [][] doubleArray;
```

그다음 new 연산자를 이용해 2차원 배열의 저장 공간을 생성한다.

첫 번째 []에는 행의 개수를, 두 번째 []에는 열의 개수를 나타낸다.

```java
intArray = new int [2][5];
charArray = new char [5][5];
doubleArray = new double [5][2];
```

length를 통해 행의 개수, 열의 개수를 알 수 있다.

```java
int intArray = new int [2][5];
int size = intArray.length; // 2 (intArray[0], intArray[1])
int size2 = intArray[0].length; // 5 (intArray[0][0], intArray[0][1], //intArray[0][2], intArray[0][3], intArray[0][4])
int size3 = intArray[1].length; // 5 (intArray[1][0], intArray[1][1], //intArray[1][2], intArray[1][3], intArray[1][4])
```

intArray.length -> 행의 개수, 2개

intArray[0].length -> 0번째 행의 열의 개수, 5개

intArray[1].length -> 1번째 행의 열의 개수, 5개



2차원 배열도 레퍼런스 변수 선언과 배열 생성을 동시에 할 수 있다.

```java
int intArray[][] = new int [2][5];
char charArray[][] = new char [5][5];
double doubleArray[][] = new double [5][2];
```



- 2차원 배열의 초기화



2차원 배열을 선언할 때 각 원소를 초기화할 수 있다. 그러면 자동으로 원소 개수만한 배열의 공간이 할당되고, 원소 값으로 초기화된다.

```java
int intArray[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}}; // 3x3
char charArray[][] = {{'a', 'b', 'c'}, {'d', 'e', 'f'}}; // 2x3
double doubleArray[][] = {{0.01, 0.02}, {0.03, 0.04}}; // 2x2
```



- 비정방형 배열



지금까지 공부한 배열은 모두 정방형 배열이다.

정방형 배열은 각 행의 열 개수가 모두 동일한 배열을 말한다.

비정방형 배열은 행마다 열의 개수가 서로 다른 배열을 말한다.

```java
int i[][]; // 2차원 배열의 레퍼런스 변수 i 선언
i = new int[4][]; // 각 행을 가리키는 레퍼런스 배열 생성
i[0] = new int[1]; // 첫째 행에 1개 크기의 배열 생성
i[1] = new int[2]; // 둘째 행에 2개 크기의 배열 생성
i[2] = new int[3]; // 셋째 행에 3개 크기의 배열 생성
i[3] = new int[4]; // 넷째 행에 4개 크기의 배열 생성
```

![스크린샷(137)](https://user-images.githubusercontent.com/50413112/105169365-c5e36680-5b5e-11eb-9dde-ec3ba874b36f.png)

```java
i.length -> 2차원 배열의 행의 개수
i[0].length -> 0번째 행의 열의 개수
i[1].length -> 1번째 행의 열의 개수
....
```

어떤 메소드가 배열을 매개변수로 받을 때, 배열이 정방형인지 비정방형인지는 표시되지 않기 때문에 length 필드를 사용해 각 행의 열의 개수를 파악해야 한다.

배열 생성 시 초기화를 통해 비정방형 배열을 생성할 수도 있다.

```java
int intArray[][] = {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
```

정방형 배열 역시 비정방형 배열을 만드는 방법으로 만들 수 있다.

```java
int i [][]; // 2차원 배열 레퍼런스 생성
i = new int[2][]; // 각 행의 레퍼런스 배열 생성
i[0] = new int[2]; // 첫째 행에 2개 정수 배열 생성
i[1] = new int[2]; // 둘째 행에 2개 정수 배열 생성
```



#### 3.5 메소드에서 배열 리턴



메소드가 배열을 리턴하는 경우를 보면, 메소드에서 어떤 배열이든지 리턴하면 배열 공간 전체가 아니라 배열의 레퍼런스만 리턴된다.

```java
int[] makeArray(){ // 리턴타입 메소드이름
	int temp[] = new int[4];
	return temp; // 리턴 후 temp가 가리키는 new로 항당받은 배열 메모리는 사라지지 않고, 지역 변수인 temp만 사라진다.
}
...
public static void main(String args[]){
    int [] intArray;
    intArray = makeArray(); // makeArray() 메소드가 리턴하는 배열을 받음
    intArray[0] = 5;
    intArray[1] = 6;
    intArray[2] = 7;
    intArray[3] = 8;
}
```

메소드는 레퍼런스만 리턴하기 때문에, 리턴타입을 선언할 때는 [] 안에 배열 크기를 지정하지 않는다.

또한 리턴하는 배열의 타입이 리턴받는 레퍼런스 변수의 타입과 일치해야 한다.

![스크린샷(138)](https://user-images.githubusercontent.com/50413112/105172382-e3b2ca80-5b62-11eb-95f0-bd39825e9926.png)

2차원 배열을 리턴하는 메소드와 배열을 리턴받는 코드는 다음과 같다.

```java
int [][] make2DArray(){
	return new int[3][4];
}
int [][] int2DArray = make2DArray();
```

생성하고, 리턴받는 타입이 동일해야 한다.



#### 3.6 main() 메소드



- main() 메소드의 특징



main() 메소드는 자바 응용 프로그램의 실행이 시작되는 특별한 메소드로서 원형은 다음과 같다.

```java
public static void main(String[] args[]){
...
}
```

public(다른 클래스에서 메소드 접근 허용)

-> 자바 응용 프로그램이 실행을 시작할 때 JVM에 의해 호출되어야 하므로 public 속성으로 선언되어야 한다.

static(객체 생선 전부터 호출 가능)

-> 자신을 포함하는 클래스의 객체가 생성되기 전에, 처음부터 JVM이 호출하므로 static 속성으로 선언되어야 한다.

void(리턴 값 없음)

-> 아무 값도 리턴하지 않기 때문에 void 타입니다. main() 메소드를 끝내기 위해 리턴하려면 return; 문을 사용하면 된다.

String[](문자열 배열)

-> 자바는 명령행에 입력된 인자들을 문자열 배열로 만들어 main() 메소드에 전달한다.

args(매개변수)



- main() 메소드의 매개변수



자바에서 main()메소드에서 매개변수의 값은

```java
$ java Hello option1 option2 option3 .... optionN
```

다음과 같이 실행된다. Hello 클래스를 실행하는 예이다.

option1 option2 option3 .... optionN을 명령행 인자라고 부르며, 이들은 모두 Hello 클래스의 main() 메소드의 매개변수로 전달된다.

Hello 클래스의 main() 메소드가 시작되기 전, 이 인자들은 각각 문자열로 만들어지고 String 배열에 저장된다.

``` java
String a = args[0]; // option1
String b = args[1]; // option2
...
```

args 레퍼런스를 이용해 명령행 인자를 전달받는다.



- main()에 명령행 인자를 전달하고 활용하는 예



```
$ javac Hello.java
$ java Hello option1 option2
```

args 배열은 문자열 배열이기 때문에 숫자로 계산을 하고 싶다면 숫자로 변형하는 함수를 사용해야 한다.

