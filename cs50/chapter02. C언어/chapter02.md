#### 1. C 언어



```c
#include <stdio.h>

int main(void){
print("hello, world\n");
}
```

C는 아주 오래되고 전통적인 텍스트 기반의 언어이다.

int main(void)는 시작한다와 같은 의미를 가지고 있다. 

앞으로 작성할 코드는 모두 int main(void){}의 중괄호 사이에 작성하게 될 것이다.

말한다, 출력한다는 함수로 printf가 있고 텍스트는 언제나 "" 쌍따옴표로 감싸야 한다.

그리고 문장의 끝에 마침표를 붙이는 것처럼 C에서는 세미콜론(;)을 붙인다.

#include <stdio.h>는 stdio.h라는 이름의 파일을 찾아서 printf 함수에 접근할 수 있도록 해준다.

문저를 저장했을 때 문서.docx와 같이 .docx 확장자가 붙는 것처럼 C로 작성한 코드는 "파일이름.c"로 저장해야 한다.



- 컴파일러



우리가 직접 작성한 코드는 소스코드라고 불린다. 이를 2진수로 작성된 머신코드로 변환해야 컴퓨터가 이해할 수 있다. 이런 작업을 컴파일러라는 프로그램이 수행한다.

``` 
소스코드 -> 컴파일러 -> 머신코드
(hello.c)            (a.out)
```

터미널 창에 clang hello.c 명령어는 clang이라는 컴파일러로 hello.c라는 코드를 컴파일하라는 의미이다.

그 결과 a.out이라는 파일이 생성된다. 

./a.out이라는 명령어를 실행하면 컴퓨터가 현재 티렉토리에 있는 a.out이란 프로그램을 싱행하게 해준다.

머신코드의 이름을 바꾸고 싶다면 -o 옵션을 준다.

```
$ clang -o hello hello.c
```

ls 명령어로 봤을 때 뒤에 *이 붙어있다는 뜻은 실행할 수 있다는 뜻, 즉 머신코드를 의미한다.

```
$ ls
```

rm 명령어로 파일을 지울 수도 있다.

```
$ rm hello.c
```



#### 2. 문자열



```c
string answer = get_string("What's your name?\n");
```

get_string 함수를 통해 단어, 구절, 문장을 뜻하는 string을 사용자로부터 받아올 수 있다.

변수의 이름은 answer 이외도 상관없다.

C는 오래된 언어이기 때문에 변수가 저장하는 데이터의 종류를 아주 정확하게 명시해줘야 한다.

string이라는 것을 알려주기 위해 형식지정자 string을 사용합니다.

=은 프로그래밍 언어에서는 오른쪽에서 왼쪽으로 가는 화살표와 비슷하다고 생각하면 된다.

오른쪽에 있는 것을 왼쪽에 지정한다는 할당 연산자이다.

위는 즉, get_string 함수가 사용자의 이름을 반환하면 그 이름을 answer라는 변수에 저장하는 것이다.

```c
string answer = get_string("What's your name?\n");
printf("hello, %d\n", answer);
```

이 코드를 실행하면 hello, answer이 그대로 결과로 나온다.

answer이라는 변수에 들어있는 이름을 출력해야 하기 때문에 %을 사용해준다.

이때도 어떤 종류의 인자를 받는지 말해줘야 하기 때문에 string의 s를 %뒤에 붙여서 인자를 받아준다.

```
$ clang -o string string.c -lcs50
```

link라는 의미를 지닌 -l라는 인자에 우리가 추가로 포함한 cs50 파일을 합친 것이다. 이를 통해 컴파일시 cs50 파일을 연결하도록 알렸다.

이런 과정 없이 

```
$ make string
```

make 명령어로 간단하게 컴파일 수행 가능하다.



#### 3. 조건문과 루프



```c
int counter = 0;
```

숫자를 저장하고 싶을 때, int를 통해 변수가 정수라는 것을 알려주고, counter가 변수의 이름, 0은 그 값에 0을 저장(초기화)하는 것이다.

```c
counter = counter + 1;
```

```c
counter += 1;
```

```c
counter++;
```

위의 셋은 counter에 1을 더해서 다시 저장한다는 뜻이다.

```c
if(x < y){
printf("x is less than y\n");
}
```

if()의 괄호 안에 검사하고자 하는 조건이 들어가고, {} 안에는 조건을 만족할 때 수행하고자 하는 작업을 넣는다.

```c
if(x < y){
printf("x is less than y\n");
}else{
printf("x is not less than y\n");
}
```

else를 통해 조건에 맞지 않을 경우 또한 지정할 수 있다.

```c
if(x < y){
printf("x is less than y\n");
}else if(x > y{
printf("x is greater than y\n");
}else if(x == y){
print("x is equal to y\n");
}
```

=는 할당 연산자이지만 ==는 2개가 같다라는 표현을 할 때 쓰는 일치 연산자이다.

```c
if(x < y){
printf("x is less than y\n");
}else if(x > y{
printf("x is greater than y\n");
}else{
print("x is equal to y\n");
}
```



- 루프



```c
while(true){
printf("hello, world\n");
}
```

while의 경우 while() 괄호 안에 조건을 넣고 {} 안에 수행할 작업을 포함시킨다.

루프를 구현하고 싶다면 탈출 조건을 넣어줘야 한다.

만일 무한루프를 계속 가동시키고 싶다면 true를 정는다.

```c
int i = 0;
while(i < 50){
printf("hello, world\n");
i++;
}
```

이를 통해 50번 hello, wolrd를 출력한다.

i는 0으로 설정 -> i는 50보다 작은가? -> 작다 -> hello world를 출력한다 -> i를 1증가시킨다 -> i가 50보다 작은가?
-> (반복) -> i가 50보다 작은가? -> 작지 않다 -> 종료

```c
for(int i = 0; i < 50; i = i + 1){
printf("hello, world\n");
}
```



#### 4 자료형, 형식 지정자, 연산자



- 데이터 타입



아래 목록은 변수의 데이터 타입으로 사용할 수 있는 것들이다.

```
- bool: 불리언 표현, (예) True, False, 1, 0, yes, no
- char: 문자 하나 (예) 'a', 'Z', '?'
- string: 문자열
- int: 특정 크기 또는 특정 비트까지의 정수 (예) 5, 28, -3, 0
- long: 더 큰 크기의 정수
- float: 부동소수점을 갖는 실수 (예) 3.14, 0.0, -28.56
- double: 부동소수점을 포함한 더 큰 실수
```



\* int는 대략 40억까지 셀 수 있기 때문에 40억게 이상의 데이터를 가진 일부 거대 기업과 같은 상황이 아닌 일반 사용자들은 대부분 정수에 int를 사용한다.



- cs50 라이브러리 내의 get 함수



```
- get_char
- get_double
- get_float
- get_int
- get_long
- get_string
```





- 형식 지정자



```
- %c : char
- %f : float, double
- %i : int
- %li : long
- %s : string
```



- 기타 연산자 및 주석



```
+:  더하기
-: 빼기
*: 곱하기
/: 나누기
%: 나머지
&&: 그리고
||: 또는
//: 주석
```



- 정수와 실수를 받아서 출력해보기



```c
# include <cs50.h>
# include <stdio.h>

int main(void)
{
    int age = get_int("what's your age?\n");
    int days = age * 365;
    printf("Your are at least %i days old.\n", days);
}
```

↓

```c
# include <cs50.h>
# include <stdio.h>

int main(void)
{
    int age = get_int("what's your age?\n");
    printf("Your are at least %i days old.\n", age * 365);
}
```

↓

```c
# include <cs50.h>
# include <stdio.h>

int main(void)
{
    printf("Your are at least %i days old.\n", get_int("what's your age?\n") * 365);
}
```



실수 표현

```c
# include <cs50.h>
# include <stdio.h>

int main(void)
{
    float price = get_float("What's the price?\n");
    printf("Your total is %f\n", price*1.0625);
}
```

출력 결과가 소수점 여섯자리가 기본이다.

소수점을 원하는 자리수만 출력하고 싶다면, %.2f처럼 사용하면 된다.

```
.원하는자리수f
```



짝수인지 홀수인지 알려주는 코드 짜기

```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    int n = get_int("n: ");

    if (n % 2 == 0)
    {
        printf("even\n");
    }
    else
    {
        printf("odd\n")
    }
}
```



주석은 //를 사용해 달 수 있다.



#### 5. 사용자 정의 함수, 중첩 루프



```c
#include <stdio.h>

void cough(void)
{
    printf("cough\n")
}

int main(void)
{
    for (int i = 0; i < 3; i++)
    {
        cough();
    }
}
```

void를 입력하고 원하는 함수명(cough)를 적은 뒤 괄호 안에 void를 적은 뒤 {} 안에 원하는 코드를 적어준다.

그리고 메인함수 안에 cough(함수명)을 사용하면 정의해둔대로 cough가 출력된다.

c는 함수를 정의한 후 호출해야 하기 때문에 int main(void)를 위로 올리면 에러가 나게 된다.

int main(void)를 올리는 방법은 함수를 정의하는 것이다.

```c
#include <stdio.h>

void cough(int n);

int main(void)
{
    cough(3);
}

void cough(int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("cough\n");
    }
}
```

void cough(int n); 이라고 뼈대를 잡고 나중에 함수를 정의한다.

```c
#include <cs50.h>
#include <stdio.h>

int get_positive_int(void);

int main(void)
{
    int i = get_positive_int();
    printf("%i\n", i);
}

int get_positive_int(void)
{
    int n;
    do
    {
        n = get_int("Positive Integer: ");
    }
    while (n < 1);
    return n;
}
```

리턴값(출력종류) 함수 이름 (인수(입력 종류))

만일 int n; 이런 식으로 아무 것도 값을 지정하지 않으면 n에는 일단 쓰레기 값을 가지게 된다.

do-while 루프는 do를 무조선 한 번은 먼저 수행하게 해준다.

나머지는 while과 같다.



- 중첩 루프



```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    int n;

    do
    {
        n = get_int("Size: ");
    }
    while (n < 1);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("#");
        }
        printf("\n");
    }
}
```

출력 화면은 가로 n개, 세로 n개인 "#"이 출력된다.



#### 6. 하드웨어의 한계



컴퓨터는 RAM(랜덤 액세스 메모리)라는 물리적 저장장치를 포함하고 있다.

우리가 작성한 프로그램은 구동 중에 RAM에 저장되고, RAM은 유한한 크기의 비트만 저장할 수 있기 때문에 때때로 부정확한 결과를 내기도 한다.



- 부동 소수점 부정확성



```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    // 사용자에게 x 값 받기
    float x = get_float("x: ");

    // 사용자에게 y 값 받기
    float y = get_float("y: ");

    // 나눗셈 후 출력
    printf("x / y = %.50f\n", x / y);
}
```

```
x: 1
y: 10
x / y = 0.10000000149011611938476562500000000000000000000000
```

정확한 결과는 0.1이 되어야 하지만 float에 저장 가능한 비트 수가 유한하기 때문에 다소 부정확한 결과를 내게 되는 것이다.



- 정수 오버플로우



```c
#include <stdio.h>
#include <unistd.h>

int main(void)
{
    for (int i = 1; ; i *= 2)
    {
        printf("%i\n", i);
        sleep(1);
    }
}
```

```
...
1073741824
overflow.c:6:25: runtime error: signed integer overflow: 1073741824 * 2 cannot be represented in type 'int'
-2147483648
0
0
...
```

정수를 계속 키우는 프로그램에서 10억을 넘기자 앞으로 넘어갈 1의 자리가 없어졌다.

int는 32개의 비트가 전부였기 때문에 이상의 숫자는 저장할 수 없다.



이러한 오버플로우는 실생활에서도 종종 발견된다.



1999년에 큰 이슈가 되었던 Y2K 문제는 연도를 마지막 두 자리수로 저장했던 관습 때문에 새해가 오면 ‘99’에서 ‘00’으로 정수 오버플로우가 발생하고, 새해가 2000년이 아닌 1900년으로 인식된다는 문제였다.

그리고 세계는 수백만 달러를 투자해서 프로그래머들에게 더 많은 메모리를 활용해서 이를 해결하도록 했다.

이는 통찰력 부족으로 발생한 아주 현실적이고 값비싼 문제였다.

 

또한 다른 사례로 비행기 보잉 787에서 구동 후 248일이 지나면 모든 전력을 잃는 문제가 있었다.

왜냐하면 강제로 안전 모드로 진입했기 때문이다.

이는 소프트웨어의 변수가 248일이 지난 뒤에 오버플로우가되어 발생하였기 때문이다.

248일을 1/100초로 계산하면 대략 2의 32제곱이 나온다.

보잉을 설계할때 사용한 변수보다 너무 커졌던 것이다.

이를 해결하기 위해 주기적으로 재가동을 하여 변수를 다시 0으로 리셋했다. 

따라서 다루고자 하는 데이터 값의 범위를 유의하며 프로그램을 작성하는 것이 중요하다.