#### 1-1 printf와 scanf를 대신하는 입출력 방식



- 헤더파일 선언문 #include <iostream>



C언어에서는 입출력을 위한 printf 함수와 scanf 함수의 호출을 목적으로 헤더파일 <stdio.h>를 포함했다면, C++에서는 입출력 관련 일을 하기 위해서 #include <iostream>을 추가해야 한다.

std, cout, endl 같은 것을 사용하기 위해 필요하다.



- std::cout과 << 연산자를 이용한 출력



```C++
std::cout << '출력대상';
```



'출력대상' 위치에는 무엇이든 올 수 있다. C언어의 printf 함수와 달리 출력 포맷을 지정하지 않아도 데이터의 성격에 따라 적절한 출력이 이루어진다.



- << 연상자를 이용한 출력 대상의 연이은 표현과 개행



<< 연산자를 이용하면 다음과 같이 둘 이상의 출력 대상을 연이어서 출력할 수도 있다.



```C++
std::cout<<'출력대상1' << '출력대상2' << '출력대상3';
```



<< 연산자를 이용한 std::endl의 출력은 개행으로 이어진다.



- 데이터의 입력에 사용하는 std::cin과 >> 연산자



키보드로부터 데이터 입력을 받기 위해서는 아래와 같은 형식을 취하면 된다.



```c++
std::cin >> '변수';
```



'변수'의 위치에는 키보드로부터 입력받은 데이터를 저장할 변수의 이름이 오면 된다. 위는 즉 키보드로부터 데이터 하나를 입력받아서 변수에 저장하라는 의미이다.

C++에서는 데이터의 입력도 출력과 마찬가지로 별도의 포맷 지정이 필요 없기 때문에 데이터 타입에 맞는 변수 입력이 진행된다.



```C++
std::cin >> '변수1' >> '변수2';
```



다음과 같은 구조로 연속적인 데이터 입력을 요구할 수도 있다. 첫 번째 변수와 두 번째 변수의 경계는 탭, 스페이스바, Enter 같은 공백에 의해 나눠진다.



- C++의 지역변수 선언



C++의 지역변수 선언은 함수 내 어디든 삽입이 가능하다. 



- for 문 내의 변수 선언 및 초기화



```c++
for(int i = val1 + 1; i < val2; i++){
...
}
```



와 같이 for 문 내에 변수를 선언과 동시에 초기화할 수 있다.



#### 1-2 함수 오버로딩



C언어에서는 동일한 이름의 함수가 정의되는 것을 컴파일 오류를 내며 허용하지 않는다. 그러나 함수 호출 시 전달되는 인자를 통해서 호출하고자 하는 함수의 구분이 가능하기 때문에 매개변수의 선언 형태가 다르다면, 동일한 이름의 함수 정의를 허용할 수 있다. 이런 C++은 이를 허용하며, 함수 오버로딩(Function Overloading)이라 부른다.

C++은 허용하고 C는 허용하지 않는 이유는 C++은 호출할 함수를 찾을 때 '함수의 이름', '매개변수의 선언' 두 가지 정보를 동시에 활용하기 때문이다. 반면 C언어는 함수의 이름만 이용해서 호출 대상을 찾기 때문에 함수의 오버로딩이 불가능하다.



- 함수 오버로딩 예



```c++
int MyFunc(char c){...}
int MyFunc(int n){...}
```



함수 오버로딩이 가능하려면 매개변수의 선언이 달라야 한다. 위는 매개변수의 자료형이 다르므로, 자료형을 통해 호출할 함수의 구분이 가능하기 때문에 오버로딩이 가능하다.



```c++
int MyFunc(int n){...}
int MyFunc(int n1, int n2){...}
```



마찬가지로 매개변수의 개수가 다른 경우도 호출할 함수의 구분이 가능하기 때문에 위의 경우도 함수의 오버로딩이 가능하다.



즉, 함수의 오버로딩이 가능기 위해선 매개변수의 자료형 또는 개수가 달라야 한다.



```c++
void MyFunc(int n){...}
int MyFunc(int n){...}
```



반면 위의 예는 반환형이 다르다. 하지만 반환형은 함수 호출 시, 호출되는 함수를 구분하는 기준이 될 수 없기 때문에 위는 컴파일 오류로 이어진다.



#### 1-3 매개변수의 디폴트 값



- 매개변수에 설정하는 '디폴트 값'의 의미



함수의 매개변수를 다음의 형태로 선언하는 것이 가능하다.



```c++
int Func(int num = 7){
return num+1;
}
```



위의 Func의 매개변수 선언은 int num = 7이다. 이 의미는 함수 호출 시 인자를 전달하지 않으면 7이 전달된 것으로 간주하겠다는 뜻이다. 따라서 Func();과 Func(7); 이 두 호출문은 완전히 동일하다.

매개변수에 디폴트 값이 설정되어 있으면, 선언된 매개변수의 수보다 적은 수의 인자 전달이 가능하다.  그리고 전달되는 인자는 왼쪽에서부터 채워져 나가고, 부족분은 디폴트 값으로 채워진다.



```C++
int Adder(int num1 = 1, int num2 = 2);

int Adder(int num1, int num2){
    return num1 + num2;
}
```



매개변수의 디폴트 값은 함수의 원형 선언에만 위치시켜야 한다.



- 부분적 디폴트 값 설정



```c++
int Func(int num1, int num2 = 5, int num3 = 7){...}
```



일부분만 디폴트 값으로 지정하면, Func(10); // Func(10, 5, 7);

Func(10, 20); // Func(10, 20, 7);

과 같은 형태로 함수 호출이 가능하다.



하지만, 반드시 오른쪽 매개변수의 디폴트 값부터 채우는 형태로 정의해야 한다.



```c++
int Func(int num1 = 3, int num2); // 에러
```



함수에 전달되는 인자가 왼쪽에서부터 오른쪽으로 채워지기 때문이다.



#### 1-4 인라인 함수



inline 함수를 의역하면, 프로그램 코드라인 안으로 들어가버린 함수를 말한다.



- 매크로 함수의 장점



매크로 함수는 일반적인 함수에 비해서 실행속도의 이점이 있으나, 단점으로 정의하기 어려우며, 복잡한 함수를 매크로의 형태로 정의하는 데에 한계가 있다.



```c++
#include <iostream>
#define SQUARE(x) ((x)*(x))

int main(void)
{
std::cout << SQUARE(5) << std::endl;
return 0;
}
```

위의 코드는 전처리를 겪으면 밑과 같아진다.

```c++
#include <iostream>

int main(void)
{
std::cout << ((5)*(5)) << std::endl;
return 0;
}
```

위와 같이 함수의 몸체 부분이 함수 호출 문장을 완전히 대체했을 때 함수가 인라인화 되었다고 표현한다. 따라서 매크로 함수는 정의하기 복잡하니, 일반 함수처럼 정의할 수 있으면 좋겠다.



- C++ 기반의 인라인 함수 정의



매크로를 이용한 함수의 인라인화는 전처리기에 의해 처리되지만, 키워드 inline을 이용한 함수의 인라인화는 컴파일러에 의해서 처리된다. 따라서 컴파일러는 함수의 인라인화가 오히려 성능에 해가 된다고 판단할 경우, 이 키워드를 무시하기도 한다. 또한 컴파일러는 필요한 경우 일부 함수를 임의로 인라인 처리하기도 한다.



- 매크로 함수에는 있지만, 인라인 함수에는 없는 장점



매크로 함수일 경우 자료형에 의존적이지 않은 함수가 되기 때문에 어떠한 경우에도 데이터의 손실이 발생하지 않는다. 하지만 특정 자료형으로 정의된 inline 함수는 이외의 데이터 타입을 사용해서 호출할 경우 데이터 손실이 일어난다.



```c++
#define SQUARE(x) ((x)*(x))
inline int SQUARE(int x) {return x*x;}
```



함수의 오버로딩을 사용하면 이 문제를 해결할 수 있으나 함수를 추가로 정의하게 되면 한 번만 정의해도 되는 매크로 함수의 장점과는 멀어진다. 그러나 C++의 템플릿을 사용하면 매크로 함수와 마찬가지로 자료형에 의존적이지 않은 함수가 완성된다.



```c++
#include <iostream>

template <typename T>
inline T SQUARE(T x)
{
return x*x;
}
```



#### 1-5 이름공간(namespace)에 대한 소개



namespace란, 말 그대로 특정 영역에 이름을 붙여주기 위한 문법적 요소이다.



- 이름공간



이름충돌이 나지 않도록 제시한 문법.



- 이름공간의 원리



이름의 소속을 지칭하면 이름충돌이 나지 않는 원리 

namespace라는 키워드를 사용해서 이름공간을 지칭한다.



```c++
#include <iostream>

namespace BestComImpl{
    void SimpleFunc(void){
        std::cout << "Bestcom이 정의한 함수" << std::endl;
    }
}

namespace ProgComImpl{
    void SimpleFunc(void){
        std::cout << "ProgCom이 정의한 함수" << std::endl;
    }
}

int main(void){
    BestComImpl::SimpleFunc();
    ProgComImpl::SimpleFunc();
    return 0;
}
```



다음과 같이 :: 연산자를 가리켜 '범위지정 연산자( scope resolution operator)'라고 칭하며, 이름공간을 지정할 때 사용하는 연산자이다.



- 이름공간 기반의 함수 선언과 정의의 구분



함수는 선언과 정의를 분리하는 것이 일반적이다. 이름공간 기반으로 함수 선언과 정의를 구분하는 방법은 아래와 같다.

```c++
#include <iostream>

namespace BestComImpl{  // 이름공간 안에서 함수의 선언만 삽입
    void SimpleFunc(void);
}

namespace ProgComImpl{
    void SimpleFunc(void);
}

int main(void){
    BestComImpl::SimpleFunc();
    ProgComImpl::SimpleFunc();
    return 0;
}

void BestComImpl::SimpleFunc(void){  // 이름공간 안에 선언된 함수의 정의 부분
    std::cout << "BestCom이 정의한 함수" << std::endl;
}

void ProgComImpl::SimpleFunc(void){
    std::cout << "ProgCom이 정의한 함수" << std::endl;
}
```

선언 부분에는 기본 함수 뼈대를 제시하고 ;로 마무리짓는다. 

정의 부분에서는 해당이름공간::함수{함수의 정의}로 정의내린다.

```c++
#include <iostream>

namespace BestComImpl{  // 이름공간 안에서 함수의 선언만 삽입
    void SimpleFunc(void);
}

namespace ProgComImpl{
    void SimpleFunc(void);
}

namespace ProgComImpl{
    void SimpleFunc2(void);
}

int main(void){
    BestComImpl::SimpleFunc();
    ProgComImpl::SimpleFunc();
    return 0;
}

void BestComImpl::SimpleFunc(void){  // 이름공간 안에 선언된 함수의 정의 부분
    std::cout << "BestCom이 정의한 함수" << std::endl;
    ProgComImpl::SimpleFunc2(); // 다른 이름공간
}

void ProgComImpl::SimpleFunc(void){
    std::cout << "ProgCom이 정의한 함수" << std::endl;
    SimpleFunc2();  // 동일 이름공간
}

void ProgComImpl::SimpleFunc2(void){
    std::cout << "ProgCom의 func2" << std::endl;
}
```

동일한 이름공간의 함수 정의 부분에선 이름공간::을 생략해서 함수를 호출할 수 있다.

다른 이름공간의 함수를 호출할 경우엔 이름공간::을 붙여서 호출해야 한다.



- 이름공간의 중첩



이름공간은 다른 이름공간 안에 삽입될 수 있다.

```c++
namespace Parent{
int num = 2;

namespace SubOne{
int num = 3;
}

namespace SubTwo{
int num = 4;
}
}
```

총 3개의 num이 존재하지만 각각 선언된 이름공간이 다르기 때문에 이름충돌 문제가 발생하지 않는다.

```c++
cout << Parent::num << endl; // 2
cout << Parent::SubOne::num << endl; // 3
cout << Patent::SubTwo::num << endl; // 4
```

중첩된 이름공간은 순서대로 :: 연산자를 사용해 활용할 수 있다.



- std::cout, std::cin, std::endl;



즉, 이름공간 std에 선언된 cout, cin, endl를 의미한다.

```c++
namespace std{
cout ...
cin ...
endl ...
}
```

이런식으로 선언되어 있을 것이다. C++ 표준에서 제공하는 다양한 요소들은 이름공간 std 안에 선언되어 있다.



- using을 이용한 이름공간 명시



이름공간::을 매번 붙여주는 것이 번거롭기 때문에 using 이름공간 선언을 사용한다. 이는 프로그램 전체영역에 효력을 미치게 하기 위해 전역변수와 마찬가지로 함수 밖에 선언해야 한다.

```c++
using std::cin;
using std::cout;
using std::endl;
```

위는 cin, cout, endl을 이름공간 std에서 찾으라는 선언이다.

일일이 using 선언을 하는 게 귀찮으면, 아래와 같이 이름공간 std에 선언된 모든 것에 대해 이름공간 지정의 생략을 명령할 수 있다.

```c++
using namespace std;
```

프로그래밍하기엔 위의 예가 편하지만, 이렇게 선언하면 이름충돌이 날 확률이 상대적으로 높아지므로 상황을 판단해 혼용해야 한다.



- 이름공간의 별칭 지정



이름공간이 많이 중첩되면, 

```c++
AAA::BBB::CCC::num = 20;
```

과 같이 불편하다. 이러한 경우엔 AAA::BBB::CCC에 별칭을 줄 수 있다.

```c++
namespace ABC=AAA::BBB::CCC;
```

위의 선언으로

```c++
ABC::num = 20;
```

와 같은 접근이 가능하다.



- 범위지정 연산자(Scope Resolution Operator)의 또 다른 기능



지역변수의 이름이 전역변수의 이름과 같은 경우, 전역변수는 지역변수에 의해 가려진다. 

```c++
int val = 100; // 전역변수

int SimpleFunc(void){
int val = 20; // 지역변수
val += 3; // 지역변수 val의 값 3 증가
}
```

SimpleFunc 내에서 전역변수와 동일한 이름의 지역변수 va에 의해 이어 등장하는 문장은 지역변수 val의 값을 증가시킨다.

SimpleFunc 함수 내에서 전역변수 val에 접근하기 위해선, 범위지정 연산자를 쓰면 된다.

```c++
int val = 100; // 전역변수

int SimpleFunc(void){
int val = 20; // 지역변수
::val += 3; // 전역변수 val의 값 3 증가
}
```

