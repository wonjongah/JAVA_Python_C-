#include <iostream>

int main(void){

    int num;

    std::cout << "����� �������� ���� �Է��ϼ��� : ";
    std::cin >> num;

    for (int i = 1; i < 10; i++){
        std::cout << num << '*' << i << '=' << num * i << std::endl;
    }
}