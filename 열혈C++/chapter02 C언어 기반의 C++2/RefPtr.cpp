#include <iostream>
using namespace std;

int main(int argc, char const *argv[]) {
    int num = 12;
    int *ptr = &num; // ptr ������ ������ num�� �ּҰ�
    int **dptr = &ptr; // ptr ������ ������ ����Ű�� ������
    // **dptr(ptr�� �ּҰ�) -> *ptr(num�� �ּҰ�) -> num
    
    int &ref = num;
    int *(&pref) = ptr;
    int **(&dpref) = dptr;

    cout << ref << endl;
    cout << *pref << endl;
    cout << **dpref << endl;
    return 0;
}