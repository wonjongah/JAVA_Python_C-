#include <stdio.h>                                                         
  
 int main(void){
    int num;
    int i;
    int sum = 0, n =0 ;
     
    printf("10�ڸ� ���ڸ� �Է��ϼ��� : ");
    scanf("%d", &num);
    if(num < 0){
    num = -num;
    }
    
    for(i=num; i>0; i=i/10){
        sum= sum + i%10;
        n+=1;
       printf("%d, %d\n",sum,n);
    }
}