#include <cs50.h>
#include <stdio.h>

int mature(int principal);

int main(void){
    int principal = get_int("���ݾ��� �Է����ּ���.\n");
    int prin_inter = mature(principal);
    printf("1�� �������� %i���Դϴ�.\n", prin_inter);
}

int mature(int principal){
    // ��ǥ �ݾ��� 1�� ����� �ݾ��� ���Ѵ�.
    return principal * (1 + 0.012);
}
