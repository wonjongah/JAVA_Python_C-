#include <cs50.h>
#include <stdio.h>

int profit(int order_num);
int remain_stock(int order_num);

int main(void){
    int order = get_int("�ֹ� �Ǽ�:");
    printf("%i��\n", order);
    printf("���� ���:5��\n");
    printf("���� ���:%i��\n", remain_stock(order));
    printf("�����(�ΰ�������):%i��\n", profit(order));
}

int profit(int order_num){
    // �����(�ΰ�������)�� ���Ѵ�.
    // ����(��� * ����) + ����(���� * ����(���� * 0.01))
     int price = order_num * 10000;
     return price + (price * 0.01);
}

int remain_stock(int order_num){
    // ���� ������� �Է¹��� ����� ���� ���� ����� ���Ѵ�.
    return 5 - order_num;
}
