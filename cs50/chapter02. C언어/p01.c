#include <cs50.h>
#include <stdio.h>

int profit(int order_num);
int remain_stock(int prev_num, int order_num);
void order(int prev_num, int order_num);

int main(void)
{
    int order_num;
    while(true){
        order_num = get_int("수박을 몇 개 주문 하시겠습니까?(5개 미만의 수를 입력해주세요)");
        if(order_num < 1 || order_num > 5){
            printf("입력값이 올바르지 않습니다.\n");
        }else{
            break;
        }
    }
    order(5, order_num);
}

void order(int prev_num, int order_num){
    printf("주문 건수:%i건\n", order_num);
    printf("기존 재고량:%i개\n", prev_num);
    printf("남은 재고량:%i개\n", remain_stock(prev_num, order_num));
    printf("매출액(부가세포함):%i원\n", profit(order_num));
}

int profit(int order_num){
    // 매출액(부가세포함)을 구한다.
    // 수익(재고량 * 가격) + 이익(수익 * 이자(수익 * 0.01))
    int price = 10000;
    int profit = order_num * price;
    return profit * 1.01;
}

int remain_stock(int prev_num, int order_num){
    // 기존 재고량에서 입력받은 재고량을 뺀서 남은 재고량을 구한다.
    return prev_num - order_num;
}
