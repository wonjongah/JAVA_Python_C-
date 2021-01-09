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