#include <iostream>
using namespace std;

void AddOne(int &num){
    num++;
}

void Reverse(int &num){
    num = -num;
}

int main(int argc, char const *argv[])
{
    int n = 1;
    AddOne(n);
    cout << "AddOne : " << n << endl;
    Reverse(n);
    cout << "Reverse : " << n << endl;
    return 0;
}
