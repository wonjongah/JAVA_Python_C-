#### 1. 메모리 주소



- 16진수



컴퓨터 과학에서는 10진수나 2진수 대신 16진수를 표현하는 경우가 많다.

데이터를 처리하기 위해 16진수를 사용할 때 장점이 있기 때문이다.

16진수를 사용하면 10진수보다 2진수를 간단하게 나타낼 수 있다.



- 10진수를 16진수로 바꾸어보기



JPG 이미지 파일은 255 216 255로 시작되고 이건 10진수이다. 하지만 실제 컴퓨터 내에서는 10진수를 사용하지 않는다.

먼저 255 216 255를 2진수로 나타내면 ff d8 ff로 나타낼 수 있다. 2^4이 16이기 때문에 4비트씩 두 덩어리로 나누면 0000부터 1111까지 16진수로 표현이 가능하다. 10에서 15까지는 a ~ f로 표현을 하고, 4비트씩 16진수로 변환 후 0x를 붙여 뒤에 오는 문자가 16진수임을 알려준다.



- 16진수의 유용성



너무 긴 2진수 표현보다 16진수 표현이 훨씬 간단하다.

컴퓨터는 8개의 비트가 모인 바이트 단위로 정보를 표현하기 때문에 2개의 16진수는 1byte 2진수로 변환되기 때문에 정보를 표현하기 유용하다.

ex)

```
65(10진수) -> 01000001(2진수)(4 1) -> 0x41(16진수)
```



- 메모리 주소



정수형 변수 n에 50이라는 값을 저장하고 출력한다고 생각해보자, 이 이라는 값은 int 타입이므로, 컴퓨터 메모리 어딘가에 4바이트의 자리를 차지하고 저장되어 있을 것이다.

C에서는 변수의 메모리상 주소를 받기 위해 '&'라는 연산자를 사용한다.

```c
#include <stdio.h>

int main(void){
	int n = 50;
	printf("%p\n", &n);
}
```

```
000000000061FE1C
```

위의 코드를 실행하면 주소 값을 얻을 수 있고, 이는 변수 n의 16진법으로 표현한 메모리 주소이다.

```c
#include <stdio.h>

int main(void){
	int n = 50;
	printf("%i\n", *&n);
}
```

```
50
```

n의 주소를 얻고, 다시 그 주소에 해당하는 값을 얻어와 출력한 것으로 결국 50이 출력된다.



#### 2. 포인터



'*' 연산자는 메모리 주소에 있는 값을 받아오게 해준다.

동시에 포인터 역할을 하는 변수를 선언할 수도 있다.

```c
#include <stdio.h>

int main(void)
{
   int n = 50;
   int *p = &n;
   printf("%p\n", p); // n의 주소
   printf("%i\n", *p); // p가 가리키는 변수(n)의 값
}
```

```
000000000061FE14
50
```

*p라는 포인터 변수에 &n, 변수 n의 주소를 저장한다.

int *p에서 p앞의 *는 이 변수가 포인터 변수라는 의미이고, int는 이 포인터가 int 타입의 변수를 가리킨다는 의미이다.



#### 3. 문자열



```c
string s = "EMMA";
```

string은 문자의 배열이고, 변수 s는 결국 이러한 문자열의 처음(s[0])을 가리키는 포인터가 된다.

```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    string s = "EMMA";
    printf("%s\n", s);
}
```

=

```c
#include <stdio.h>

int main(void)
{
    char *s = "EMMA";
    printf("%s\n", s);
}
```



#### 4. 문자열 비교



```c
#include <stdio.h>

int main(void)
{
    char *s = "EMMA";
    printf("%p\n", s);
}
```

위의 코드를 실행하면, "E"(s[0])에 해당하는 메모리 주소를 출력한다.

```c
printf("%p\n", &s[0]);
printf("%p\n", &s[1]);
printf("%p\n", &s[2]);
printf("%p\n", &s[3]);
```

각각의 주소값을 출력하는 코드이다.

문자열은 첫 번째 문자를 시작으로 메모리 상에서 바로 옆에 저장되어 있다.

다시 말해, 가장 첫 번째 문자에 해당하는 주소값을 하나씩 증가시키면 바로 옆에 있는 문자의 값을 출력할 수 있다.

```c
printf("%c\n", *s);
printf("%c\n", *(s+1));
printf("%c\n", *(s+2));
printf("%c\n", *(s+3));
```

위의 코드는 E M M A를 순서대로 출력한다.

```c
#include <cs50.h>
#include <stdio.h>

int main(void)
{
    // 사용자로부터 s와 t 두 개의 문자열 입력받아 저장
    string s = get_string("s: ");
    string t = get_string("t: ");

    // 두 문자열을 비교 (각 문자들을 비교)
    if (s == t)
    {
        printf("Same\n");
    }
    else
    {
        printf("Different\n");
    }
}
```

위의 코드는 변수가 저장되어 있는 주소가 다르기 때문에 다르다는 결과가 나올 것이다.

정확한 비교를 위해서는 실제 문자열이 저장되어 있는 곳으로 이동해 각 문자를 하나하나씩 비교해야 한다.



#### 5. 문자열 복사



```c
#include <cs50.h>
#include <ctype.h>
#include <stdio.h>

int main(void)
{
    string s = get_string("s: ");
    string t = s;

    t[0] = toupper(t[0]);

    printf("s: %s\n", s);
    printf("t: %s\n", t);
}
```

사용자에게 입력받은 값을 s에 저장, t를 s로 정의한다.

t의 첫 번째 문자를 대문자로 바꾼다면 s와 t는 어떻게 출력될까?

emma, Emma의 예상과 다르게 둘 다 Emma로 출력된다.

<u>그 이유는 s라는 변수에는 emma라는 문자열이 아닌 그 문자열이 있는 메모리의 주소가 저장되기 때문이다.</u>

string s는 char *s와 동일한 의미라는 것을 떠올리면 된다.

따라서 t도 s와 동일한 주소를 가리키고 있고, t를 통한 수정은 s에도 반영이 된다.



만일, 두 문자열을 메모리상에서 복사하려면 어떻게 해야 할까?

아래 코드와 같이 메모리 할당 함수를 사용하면 된다.

```c
#include <cs50.h>
#include <ctype.h>
#include <stdio.h>
#include <string.h>

int main(void)
{
    char *s = get_string("s: ");
    char *t = malloc(strlen(s) + 1);

    for (int i = 0, n = strlen(s); i < n + 1; i++)
    {
        t[i] = s[i];
    }

    t[0] = toupper(t[0]);

    printf("s: %s\n", s);
    printf("t: %s\n", t);
}
```

malloc 함수는 정해진 크기 만큼 메모리를 항당하는 함수이다.

즉 문자열 s의 길이에 널 종단 문자(\0)에 해당하는 1을 더한 만큼 메모리를 할당한 후, 루프를 돌려 s 문자열 배열에 있는 문자 하나 하나를 t 배열에 복사해주면 된다.



#### 6. 메모리 할당과 해제



malloc 함수를 이용해 메모리를 할당한 후에는 free를 이용해 메모리를 해제해줘야 한다.

그렇지 않은 경우 메모리에 쓰레기 값으로 남게 되어 메모리 용량의 낭비가 발생하게 된다.

이러한 현상을 <u>메모리 누수</u>라고 말한다.

valgrind 프로그램을 사용하면 코드에서 메모리 관련한 문제가 있는지 쉽게 확인 가능하다.



#### 7. 메모리 교환, 스택, 힙



```c
#include <stdio.h>

void swap(int a, int b);

int main(void)
{
    int x = 1;
    int y = 2;

    printf("x is %i, y is %i\n", x, y);
    swap(x, y);
    printf("x is %i, y is %i\n", x, y);
}

void swap(int a, int b)
{
    int tmp = a;
    a = b;
    b = tmp;
}
```

a와 b는 각각 x, y의 값을 복제해 가지게 된다. 즉 서로 다른 메모리 주소에 저장되는 것이다. 

heap에는 malloc으로 할당된 메모리의 데이터가 저장된다.

stack에는 프로그램 내의 함수와 관련된 것들이 저장된다.

a, b, x, y, tmp 모두 **스택 영역**에 저장되지만 a와 x, b와 y는 그 안에서도 서로 다른 위치에 저장된 변수이다.

따라서 a, b와 x, y를 바꾸는 것에 아무런 영향을 끼치지 못한다.

a, b를 각각 x와 y를 가리키는 포인터로 지정함으로써 이 문제를 해결할 수 있다.

```c
#include <stdio.h>

void swap(int *a, int *b);

int main(void)
{
    int x = 1;
    int y = 2;

    printf("x is %i, y is %i\n", x, y);
    swap(&x, &y);
    printf("x is %i, y is %i\n", x, y);
}

void swap(int *a, int *b)
{
    int tmp = *a;
    *a = *b;
    *b = tmp;
}
```



#### 8. 파일 쓰기



머신 코드 영역에는 프로그램이 컴파일된 바이너리가 저장된다.

글로벌 영역에는 프로그램 안에서 저장된 전역 변수가 저장된다.

힙 영역에는 malloc으로 할당된 메모리의 데이터가 저장, 스택에는 프로그램 내의 함수와 관련된 것들이 저장된다.

힙 영역에는 malloc에 의해 메모리가 더 할당될수록, 사용하는 메모리의 범위가 아래로 늘어난다.

스택도 함수가 더 많이 호출될 수록, 사용하는 메모리의 범위가 점점 위로 늘어난다.

제한된 메모리 용량 하에 기존의 값을 침범하는 경우가 있는데 이를 힘 오버플로우, 스택 오버플로우라 칭한다.



- 사용자에게 입력받기



```c
#include <stdio.h>

int main(void)
{
    int x;
    printf("x: ");
    scanf("%i", &x);
    printf("x: %i\n", x);
}
```

scanf로 받을 때 &를 사용해 주소를 입력해준다.

스택 영역 안에 s가 저장된 주소로 찾아가 사용자가 입력한 값을 저장하도록 하기 위함이다.



- 파일 쓰기



```c
#include <cs50.h>
#include <stdio.h>
#include <string.h>

int main(void)
{
    FILE *file = fopen("phonebook.csv", "a");
    char *name = get_string("Name: ");
    char *number = get_string("Number: ");
    fprintf(file, "%s,%s\n", name, number);
    fclose(file);
}
```

fopen 함수를 이용해 파일을 FILE이라는 자료형으로 불러올 수 있다.

fopen 함수의 첫 번째 인자는 파일의 이름, 두 번째 인자는 모드로 r은 읽기, w는 쓰기, a는 덧붙이기를 의마한다.

입력받은 문자열을 fprintf 함수를 이용해 printf에서처럼 파일에서 직접 내용을 출력할 수 있다.

작업이 끝난 후 fclose 함수로 파일에 대한 작업을 종료해준다.



#### 9. 파일 읽기



```c
#include <stdio.h>

int main(int argc, char *argv[])
{
    if (argc != 2)
    {
        return 1;
    }

    FILE *file = fopen(argv[1], "r");

    if (file == NULL)
    {
        return 1;
    }
 
   unsigned char bytes[3];
    fread(bytes, 3, 1, file);

    if (bytes[0] == 0xff && bytes[1] == 0xd8 && bytes[2] == 0xff)
    {
        printf("Maybe\n");
    }
    else
    {
        printf("No\n");
    }
    fclose(file);
}
```

(bytes[0] == 0xff && bytes[1] == 0xd8 && bytes[2] == 0xff)는 JPEG 형식의 파일을 정의할 때 만든 약속으로, JPEG 파일의 시작점에 꼭 포함되어 있어야 한다.

따라서 JPEG 파일인지 검색하려면 이를 확인하면 된다.