#### 2-1 Chapter 02의 시작에 앞서



[키워드 const의 의미]

-> const int num = 10; // 변수 num을 상수화.

-> cont int *ptr1 = &val1; // 포인터 ptr1을 이용해서 val1의 값을 변경할 수 없음.

-> int * const ptr2 = &val2; // 포인터 ptr2가 상수화 됨.

-> const int * const ptr3 = &val3; // 포인터 ptr3가 상수화되었으며, ptr3를 이용해서 val3을 변경할 수 없음.



[실행중인 프로그램의 메모리 공간]

데이터 -> 전역변수가 저장되는 영역

스택 -> 지역변수 및 매개변수가 저장되는 영역

힙 -> malloc 함수호출에 의해서 프로그램이 실행되는 과정에서 동적으로 할당이 이뤄지는 영역

malloc & free -> malloc 함수호출에 의해 할당된 메모리 공간은 free 함수호출을 통해서 소멸하지 않으면 해제되지 않는다.



[Call-by-value vs Call-by-reference]

```c++
void SwapByValue(int num1, int num2){
int temp = num1;
num1 = num2;
num2 = temp;
// call by value
}
```

```c++
void SwapByRef(int * ptr1, int * ptr2){
int temp = *ptr1;
*ptr1 = *ptr2;
*ptr2 = temp;
// call by reference
}
```



#### 2-2 새로운 자료형 bool



bool 형은 C 언어에는 존재하지 많고, C++에만 존재하는 자료형이다.



- '참'을 의미하는 true와 '거짓'을 의미하는 false



true와 false는 1과 0을 의미하는 키워드는 아니다. 둘은 참과 거짓을 표현하기 위한 1바이트 크기의 데이터일 뿐이다. 따라서 true와 false를 굳이 숫자에 연결시켜서 이해하려 들지 않고, true와 false는 그 자체를 참과 거짓을 나타내는 목적으로 정의된 데이터로 인식하는 것이 좋다.



- 자료형 bool



true와 false는 그 자체로 참과 거짓을 의미하는 데이터이기 때문에, 자료형이 별도로 정의되어 있다. true와 false를 가리켜 bool형 데이터라 한다.



#### 2-3 참조자(Reference)의 이해



- 참조자(Reference)의 이해



변수는 할당된 메모리 공간에 붙여진 이름이다. 그리고 그 이름을 통해서 해당 메모리 공간에 접근 가능하다.

그러면 할당된 하나의 메모리 공간에 둘 이상의 이름을 부여할 수 있을까?

```c++
int num1 = 2021;
```

이라는 2021로 초기화된 메모리 공간에 num1이라는 이름이 붙게 된다.

그런데 이 상황에서 다음의 문장을 실행하면,

```c++
int &num2 = num1;
```

num1이라는 이름이 붙어있는 메모리 공간에는 num2라는 이름이 하나 더 붙게 된다.

주소값과 혼란될 수 있으나 & 연산자는 다른 의미로 적용된다.

**이미 선언된 변수의 앞에 이 연산자가 오면 주소값의 반환을 명령하는 뜻이 되지만, 새로 선언되는 변수의 이름 앞에 등장하면, 이는 참조자의 선언을 뜻한다.**

```c++
int *ptr = &num1; // 변수 num1의 주소값을 반환해서 포인터 ptr에 저장해라.
int &num2 = num1; // 변수 num1에 대한 참조자 num2를 선언해라.
```

따라서 변수 num1 선언 이후

```c++
int &num2 = num1;
```

은 num2은 num1의 참조자가 되며 이는 결과적으로 num1이라는 이름이 붙어있는 메모리 공간에 num2라는 이름이 하나 더 붙은 것이다.

참조자조 변수로 봐도 무리는 없지만 , C++에서는 참조자와 변수를 구분해서 이야기한다.

num2의 값을 바꾸면 num1의 값도 바뀌게 된다.

이렇듯 참조자는 자신이 참조하는 변수를 대신할 수 있는 또 하나의 이름이다.

```c++
#include <iostream>
using namespace std;

int main(void){

    int num1 = 1020;
    int &num2 = num1; // 첫 선언 &, 레퍼런스

    num2 = 3047;
    cout << "VAL : " << num1 << endl;
    cout << "REF : " << num2 << endl;

    cout << "VAL : " << &num1 << endl; // 첫 선언 이후 사용, 주소값 리턴
    cout << "REF : " << &num2 << endl;
    return 0;
}
```

```
출력 내용
VAL : 3047    
REF : 3047    
VAL : 0x61fe14
REF : 0x61fe14
```

참조자는 변수를 대상으로만 선언이 가능하다는 점이 변수와 다르다. 하지만 일단 선언이 되고 나면 변수와 별 차이 없다. 

위 예제처럼 & 연산자를 이용해서 주소값 리턴도 가능하고, 함수 내 선언된 지역적(local) 참조자는 지역변수와 마찬가지로 함수를 빠져나가면 소멸된다.



- 참조자는 별칭이다.



전통적으로 C++에서는 참조자를 다음과 같이 설명한다.

변수에 별명(별칠)을 하나 붙여주는 것이다.



- 참조자의 수에는 제한이 없으며, 참조자를 대상으로도 참조자를 선언할 수 있다.



참조자의 수에는 제한이 없기 때문에 여러 개의 참조자를 선언하는 것도 가능하다.

또한 참조자를 대상으로 참조자를 선언하는 것도 가능하다.

```c++
int num1 = 1234;
int &num2 = num1;
int &num3 = num2; // 참조자로 참조자 선언 가능
```



- 참조자 선언 가능 범위



참조자는 변수에 대해서만 선언이 가능하고, 선언된 동시에 누군가를 참조해야 한다. 

즉, 다음의 선언은 유효하지 않다.

```c++
int &ref = 20; // (x)
```

참조자는 변수에 또 다른 이름을 붙이는 것이기 때문에 상수를 대상으로 참조자를 선언할 수 없다.

또한

```c++
int &ref; (x)
```

위와 같이 미리 참조자를 선언했다가 후에 누군가를 참조하는 것은 불가능하며, 참조의 대상을 바꾸는 것도 불가능하다.

```c++
int &ref = NULL; (x)
```

위와 같이 참조자를 선언할 때 NULL로 초기화하는 것도 불가능하다. 



그리고 참조자에서 말하는 변수의 범위에 배열도 포함된다.

```C++
#include <iostream>
using namespace std;

int main(void){

    int arr[3] = {1, 3, 5};
    int &ref1 = arr[0];
    int &ref2 = arr[1];
    int &ref3 = arr[2];

    cout << ref1 << endl;
    cout << ref2 << endl;
    cout << ref3 << endl;

    return 0;
}
```

```
출력 내용
1
3
5
```

배열요소(배열X, 배열요소)는 변수로 간주되어 참조자의 선언이 가능하다. 그리고 포인터 변수도 변수이기 때문에 참조자의 선언이 가능하다.

```C++
#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {
    int num = 12;
    int *ptr = &num; // ptr 포인터 변수는 num의 주소값
    int **dptr = &ptr; // ptr 포인터 변수를 가리키는 포인터
    // **dptr(ptr의 주소값) -> *ptr(num의 주소값) -> num
    
    int &ref = num;
    int *(&pref) = ptr; // 포인터 변수의 참조자 선언도 & 연산 추가
    int **(&dpref) = dptr;

    cout << ref << endl;
    cout << *pref << endl; // pref는 포인터 변수 ptr의 참조자이므로, 변수 num에 저장된 값 출력
    cout << **dpref << endl;
    return 0;
}
```

```c++
출력 내용
12
12
12
```



#### 2-4 참조자(Reference)와 함수



- Call-by-value & Call-by-reference

  

  - Call-by-value -> 값을 인자로 전달하는 함수의 호출방식
  - Call-by-reference -> 주소 값을 인자로 전달하는 함수의 호출방식

Call-by-value 기반의 함수는 다음과 같이 정의된 함수를 의미한다.

```c++
int Adder(int num1, int num2){
return num1 + num2;
}
```

Adder 함수는 정수 두 개를 인자로 요구하고 있다. 따라서 Call-by-value 기반의 함수이다.

<u>Call-by-value 형태로 정의된 함수의 내부에서는, 함수 외부에 선언된 변수에 접근이 불가능하다.</u>

따라서 두 변수에 저장된 값을 서로 바꿔서 저장할 목적으로 다음의 함수를 정의하고 main 함수를 실행하면 원하는 결과를 얻을 수 없다.

```c++
void SwapByValue(int num1, int num2){
int temp = num1;
num1 = num2;
num2 = temp;
// Call by value
}
```

그래서 필요한 것이 Call-by-reference 기반의 함수이다.

```c++
void SwapByRef(int *ptr1, int *ptr2){
int temp = *ptr1;
*ptr1 = *ptr2;
*ptr2 = temp;
// Call by reference
}
```

위의 함수는 두 개의 주소값을 받아서, 그 주소값이 참조되는 영역에 저장된 값을 직접 변경하고 있다.



- Call-by-address ? Call-by-reference !



연산의 주체가 변수이면, Call by value를 말한다.

주소값을 전달받아, 함수 외부에 선언된 변수에 접근하는 형태의 함수 호출을 Call by reference라고 한다.

주소값이 참조의 도구로 사용되었다는 것이 value와 reference 구분 기준이 된다.

C++에서 함수 외부에 선언된 변수의 접근 방법으로 두 가지가 존재한다.

1. 주소값을 이용한 Call-by-reference
2. 참조자를 이용한 Call-by-reference



- 참조자를 이용한 Call-by-reference



```C++
void SwapByRef2(int &ref1, int &ref2){
int temp = ref1;
ref1 = ref2;
ref2 = temp;
// Call by reference
}
```

참조자는 선언과 동시에 변수로 초기화가 되어야 하는데 매개변수 선언 위치에 왔다.

매개변수는 함수가 호출되어야 초기화되는 변수이기 때문에, 초기화가 이루어지지 않은 것이 아니라 함수 호출 시 전달되는 인자로 초기화하겠다는 의미의 선언이다.

메인 함수에서 메모리의 변수를 ref1, ref2가 참조(별명)하도록 된다.

```c++
#include <iostream>
using namespace std;

void SwapByRef2(int &ref1, int &ref2){
    int temp = ref1;
    ref1 = ref2;
    ref2 = temp;
}

int main(int argc, char const *argv[])
{
    int val1 = 10;
    int val2 = 20;
    
    SwapByRef2(val1, val2);
    cout << "val1: " << val1 << endl;
    cout << "val2: " << val2 << endl;
    return 0;
}
```

```
val1: 20
val2: 10
```



- 참조자를 이용한 Call-by-reference의 황당함과 const 참조자



코드를 분석하는 과정에서 함수의 호출문만 보고도 함수의 특성을 어느정도 파악할 수 있어야 하는데, 참조자를 사용하는 경우 함수의 원형을 확인해야 하고, 확인 결과 참조자가 매개변수에 있다면, 함수의 몸체까지 문장 단위로 확인해서 참조자를 통한 값의 변경이 일어나는지 확인해야 한다.

이러한 단점을 해결하기 위해서, const 키워드를 이용하면 된다.

```c++
void HappyFunc(const int &ref){...}
```

함수 HappyFunc 내에서 참조자 ref를 이용한 값의 변경은 하지 않겠다는 뜻이다. 

<u>함수 내에서, 참조자를 통한 값의 변경을 진행하지 않는 경우, 참조자를 const로 선언해서, 함수의 원형만 봐도 값의 변경이 이뤄지지 않음을 알 수 있게 한다.</u>



- 변환형이 참조형(Reference Type)인 경우



함수의 반환형에도 참조형이 선언될 수 있다.

```c++
int& RefRetFuncOne(int &ref){
ref++;
return ref;
}
```

ex)

```c++
#include <iostream>
using namespace std;

int& RefRetFuncOne(int &ref){
    ref++;
    return ref;
}

int main(int argc, char const *argv[])
{
    int num1 = 1; // 1
    int &num2 = RefRetFuncOne(num1); // 2
    
    num1++; // 3
    num2++; // 4
    cout << "num1 : " << num1 << endl;
    cout << "num2 : " << num2 << endl; 
    return 0;
}
```

```
num1 : 4
num2 : 4
```



num1, num2, ref 모두 한 곳을 가리키고 있다.

```c++
int num1 = 1;
int &ref = num1;
int &num2 = ref;
```

ref는 지역변수와 동일한 성격으로 함수에서 반환하면, 참조자 ref는 소멸된다.

```c++
int &num2 = RefRetFuncOne(num1);
-> int num2 = RefRetFuncOne(num1);
```

위 처럼 변수에 대입하면 어떻게 될까? 

```c++
#include <iostream>
using namespace std;

int& RefRetFuncOne(int &ref){
    ref++;
    return ref;
}

int main(int argc, char const *argv[])
{
    int num1 = 1;
    int num2 = RefRetFuncOne(num1);
    
    num1++;
    num2+=100;
    cout << "num1 : " << num1 << endl;
    cout << "num2 : " << num2 << endl; 
    return 0;
}
```

```
num1 : 3
num2 : 102
```

ref와 num1은 한 곳을 가리키고, num2는 다른 곳을 가리킨다.

```c++
int num1 = 1;
int &ref = num1;
int num2 = ref;
```

반환형이 참조형인 경우, 반환값을 무엇으로 저장하느냐에 따라 차이를 보인다.

```c++
#include <iostream>
using namespace std;

int RefRetFuncTwo(int &ref){ // 반환 기본 자료형 int
    ref++;
    return ref;
}

int main(int argc, char const *argv[])
{
    int num1 = 1;
    int num2 = RefRetFuncTwo(num1);
    
    num1++;
    num2+=100;
    cout << "num1 : " << num1 << endl;
    cout << "num2 : " << num2 << endl; 
    return 0;
}
```

```
num1 : 3
num2 : 102
```

함수의 반환을 참조자가 아닌 그냥 기본 자료형 int로 설정했다. 

결과값은 이전과 다른 게 없어보이지만, 

```c++
< 반환값 참조자 >
int num2 = RefRetFuncOne(num1); // OK!
int &num2 = RefRetFuncOne(num1); // OK!
< 반환값 int >
int num2 = RefRetFuncTwo(num1); // OK!
int &num2 = RefRetFuncTwo(num1); // XXXXXXXX!!
```

참조자를 반환값으로 지정한 함수는 참조자, 기본 자료형 둘 다 대입 가능하지만, 반환값이 참조자가 아닌 경우는 참조자 변수에는 대입 불가능하다.



- 잘못된 참조의 반환



지역변수를 참조형으로 반환하는 일은 없어야 한다. 소멸되지 않은 쓰레기 형태로 남아있는 데이터를 참조해 이상한 출력 결과를 보이기도 하니 주의해야 한다.



- const 참조자의 또 다른 특징



```c++
const int num = 20;
int &ref = num; // error
ref += 10;
cout << num << endl;
```

const 선언으로 num을 상수화했는데, 참조자 ref를 통해 값을 변경했다.

변수 num의 상수화는 의미가 없어지고, C++ 컴파일러는 에러를 띄운다.

상수화된 변수에 대한 참조자 설정은 다음과 같이 해야 한다.

```c++
const int num = 20;
const int &ref = num;
```

이렇게 선언하면 ref를 통한 값의 변경이 불가능하기 때문에 논리적인 문제가 발생하지 않는다.



- 참조자가 상수 참조를 할 수 있는 이유



```c++
const int &ref = 50;
```

은 가능하다.

참조자는 변수만 참조가 가능하다고 했지만, 리터럴 상수(위의 50을 예)는 임시적으로 존재하는 값이다.

const 참조자를 통해 상수를 참조할 때, 임시변수를 만든다. 그리고 이 장소에 상수 30을 저장하고 참조자가 이를 참조하게끔 한다.

```c++
int Adder(const int &num1, const int &num2){
return num1 + num2;
}
```

위와 같이 정의된 함수에 인자의 전달할 때 임시변수의 생성을 통한 const 참조자의 상수참조를 허용해, 다음과 같이 간단하게 호출이 가능해졌다.

```c++
cout << Adder(3, 4) << endl;
```



#### 2-5 malloc & free를 대신하는 new & delete



힙의 메모리 할당 및 소멸에 필요한 함수가 malloc & free이다.



- new & delete



```c++
#include <iostream>
#include <string.h>
#include <stdlib.h>
using namespace std;

char * MakeStrAdr(int len){
    char * str = (char*)malloc(sizeof(char)*len);
    // 길이 받아 길이만큼의 배열 생성(힙 영역에 할당) 후
    return str;
    // 배열의 주소값 반환
}

int main(void){
    char * str = MakeStrAdr(20);
    strcpy(str, "I am so happy");
    cout <<  str << endl;
    free(str); // 힙에 할당된 메모리 소멸
    return 0;
}
```



두 가지 불편한 점이 보인다.

1. 할당할 대상의 정보를 무조건 바이트 크기 단위로 전달해야 한다.
2. 반환형이 void 형 포인터이기 때문에 적절한 형 변환을 거쳐야 한다.

C++의 new와 delete를 사용하면 이런 불편함이 사라진다.

new는 malloc 대체, delete는 free를 대체한다.

```c++
int *ptr1 = new int;
double * arr1 = new double[7];

delete ptr1;
delete []arr1;
```

ex)

```c++
#include <iostream>
#include <string.h>
using namespace std;

char * MakeStrAdr(int len){
    // char * str = (char*)malloc(sizeof(char)*len);
    char * str = new char[len];
    return str;
}

int main(void){
    char * str = MakeStrAdr(20);
    strcpy(str, "I am so happy!");
    cout << str << endl;
    delete []str;
    return 0;
}
```

```
I am so happy!
```



- 객체의 생성에서는 반드시 new & delete



```c++
#include <iostream>
#include <stdlib.h>
using namespace std;

class Simple{
    public:
    Simple(){
        cout << "I'm simple constructor!" << endl;
    }
};

int main(void){
    cout << "case 1: ";
    Simple * sp1 = new Simple;

    cout << "case 2: ";
    Simple * sp2 = (Simple*)malloc(sizeof(Simple)*1);

    cout << endl << "end of main" << endl;
    delete sp1;
    free(sp2);
    return 0;
}
```

```
case 1: I'm simple constructor!
case 2:
end of main
```

case 2는 출력되지 않는다.

new와 malloc 함수의 동작방식에는 차이가 있다는 것을 알 수 있다.



- 힙에 할당된 변수를 포인터를 사용하지 않고 접근하기



new 연산자를 이용해 할당된 메모리 공간에도 참조자의 선언이 가능할까?

C++에서는 new 연산자를 이용해서 할당된 메모리 공간도 변수로 간주해서 참조자의 선언이 가능하도록 하고 있다.

```c++
int *ptr = new int;
int &ref = *ptr; // 힙 영역에 할당된 변수에 대한 참조자 선언
ref = 20;
cout << *ptr << endl; // 20 출력
```

참조자의 선언을 통해서 포인터 연산 없이 힙 영역에 접근할 수 있다.



#### 2.6 C++에서 C언어의 표준함수 호출하기



- c를 더하고 .h를 빼기



```
#include <stdio.h> -> #include <cstdio>
#include <math.h> -> #include <cmath>
```

헤더파일의 확장자인 .h를 생략하고 앞에 c를 붙이면 C언어에 대응하는 C++ 헤어파일 이름이 된다.

물론 C언어의 헤더파일을 이용해도 되지만, 가급적 C++ 헤더를 기반으로 예제를 작성하는 것이 좋다.



- C++ 헤더를 선언해야 하는 이유



하위 버전과의 호환성으로 .h 헤더파일도 허용하긴 한다. 

하지만 C++과 C 라이브러리의 함수가 완전히 일치하지 않고, C++에는 오버로딩된 함수들도 존재한다. 