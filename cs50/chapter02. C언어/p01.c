#include <cs50.h>
#include <stdio.h>

int profit(int order_num);
int remain_stock(int prev_num, int order_num);
void order(int prev_num, int order_num);

int main(void)
{
    int order_num;
    while(true){
        order_num = get_int("������ �� �� �ֹ� �Ͻðڽ��ϱ�?(5�� �̸��� ���� �Է����ּ���)");
        if(order_num < 1 || order_num > 5){
            printf("�Է°��� �ùٸ��� �ʽ��ϴ�.\n");
        }else{
            break;
        }
    }
    order(5, order_num);
}

void order(int prev_num, int order_num){
    printf("�ֹ� �Ǽ�:%i��\n", order_num);
    printf("���� ���:%i��\n", prev_num);
    printf("���� ���:%i��\n", remain_stock(prev_num, order_num));
    printf("�����(�ΰ�������):%i��\n", profit(order_num));
}

int profit(int order_num){
    // �����(�ΰ�������)�� ���Ѵ�.
    // ����(��� * ����) + ����(���� * ����(���� * 0.01))
    int price = 10000;
    int profit = order_num * price;
    return profit * 1.01;
}

int remain_stock(int prev_num, int order_num){
    // ���� ������� �Է¹��� ����� ���� ���� ����� ���Ѵ�.
    return prev_num - order_num;
}
