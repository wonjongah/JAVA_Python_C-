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
