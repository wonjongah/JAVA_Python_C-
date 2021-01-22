#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {
    int num = 12;
    int *ptr = &num; // ptr 포인터 변수는 num의 주소값
    int **dptr = &ptr; // ptr 포인터 변수를 가리키는 포인터
    // **dptr(ptr의 주소값) -> *ptr(num의 주소값) -> num
    
    int &ref = num;
    int *(&pref) = ptr;
    int **(&dpref) = dptr;

    cout << ref << endl;
    cout << *pref << endl;
    cout << **dpref << endl;
    return 0;
}