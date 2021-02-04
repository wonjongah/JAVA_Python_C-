#include <stdio.h>
int main(void)
{
    int a[5];
    for(int i = 0; i < 5; i++){
        scanf("%d", &a[i]);
    }
    int n = sizeof(a) / sizeof(int);
    double median;
    int temp;
    for(int i = 0; i < n - 1; i++)
        for(int j = 0; j< n - i - 1; j++)
        {
            if(a[j+1] < a[j])
            {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    if(n/2 == 0)
        median=(a[n/2] + a[n/2+1]) / 2;
    else
        median=a[(n+1) / 2];
    printf("median = %d\n", (int)median);
    return 0;
}