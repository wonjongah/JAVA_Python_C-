#include <iostream>

int main(void){

    int num;

    std::cout << "출력할 구구단의 단을 입력하세요 : ";
    std::cin >> num;

    for (int i = 1; i < 10; i++){
        std::cout << num << '*' << i << '=' << num * i << std::endl;
    }
}