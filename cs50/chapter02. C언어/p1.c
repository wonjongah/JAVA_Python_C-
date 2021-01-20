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
     int price = order_num * 10000;
     return price + (price * 0.01);
}

int remain_stock(int order_num){
    return 5 - order_num;
}
