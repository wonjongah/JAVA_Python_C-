#include <iostream>

int main(void){
    
    char name[100];
    char phone[100];

    std::cout << "�̸��� �Է��Ͻÿ�: ";
    std::cin >> name;
    std::cout << "��ȭ��ȣ�� �Է��Ͻÿ�: ";
    std::cin >> phone;

    std::cout << "�̸��� " << name << " ��ȭ��ȣ�� " << phone << "�Դϴ�." << std::endl;
    return 0;
}