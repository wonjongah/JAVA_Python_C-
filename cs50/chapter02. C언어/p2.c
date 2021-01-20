#include <cs50.h>
#include <stdio.h>

int profit(int order_num);
int remain_stock(int order_num);

int main(void){
    int order = get_int("주문 건수:");
    printf("%i건\n", order);
    printf("기존 재고량:5개\n");
    printf("남은 재고량:%i개\n", remain_stock(order));
    printf("매출액(부가세포함):%i원\n", profit(order));
}

int profit(int order_num){
    // 매출액(부가세포함)을 구한다.
    // 수익(재고량 * 가격) + 이익(수익 * 이자(수익 * 0.01))
     int price = order_num * 10000;
     return price + (price * 0.01);
}

int remain_stock(int order_num){
    // 기존 재고량에서 입력받은 재고량을 뺀서 남은 재고량을 구한다.
    return 5 - order_num;
}
