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

