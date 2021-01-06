#include <iostream>

int main(void){
    
    int first, second, third, fourth, fifth;

    std::cout << "1번째 정수 입력: ";
    std::cin >> first;
    std::cout << "2번째 정수 입력: ";
    std::cin >> second;
    std::cout << "3번째 정수 입력: ";
    std::cin >> third;
    std::cout << "4번째 정수 입력: ";
    std::cin >> fourth;
    std::cout << "5번째 정수 입력: ";
    std::cin >> fifth;

    int result = first + second + third + fourth + fifth;

    std::cout << "합계: " << result << std::endl;

    return 0;
}