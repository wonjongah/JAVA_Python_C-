#include <cs50.h>
#include <stdio.h>

int main(void)
{
    // ����ڷκ��� s�� t �� ���� ���ڿ� �Է¹޾� ����
    string s = get_string("s: ");
    string t = get_string("t: ");

    // �� ���ڿ��� �� (�� ���ڵ��� ��)
    if (s == t)
    {
        printf("Same\n");
    }
    else
    {
        printf("Different\n");
    }
}