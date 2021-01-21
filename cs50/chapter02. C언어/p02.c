#include <cs50.h>
#include <stdio.h>

int mature(int principal);

int main(void){
    int principal = get_int("예금액을 입력해주세요.\n");
    int prin_inter = mature(principal);
    printf("1년 원리금은 %i원입니다.\n", prin_inter);
}

int mature(int principal){
    // 목표 금액의 1년 만기시 금액을 구한다.
    return principal * (1 + 0.012);
}
