#include <iostream>

int main(void){
    
    int first, second, third, fourth, fifth;

    std::cout << "1��° ���� �Է�: ";
    std::cin >> first;
    std::cout << "2��° ���� �Է�: ";
    std::cin >> second;
    std::cout << "3��° ���� �Է�: ";
    std::cin >> third;
    std::cout << "4��° ���� �Է�: ";
    std::cin >> fourth;
    std::cout << "5��° ���� �Է�: ";
    std::cin >> fifth;

    int result = first + second + third + fourth + fifth;

    std::cout << "�հ�: " << result << std::endl;

    return 0;
}