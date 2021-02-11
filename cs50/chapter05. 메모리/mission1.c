#include <stdio.h>
#define x 6
#define y 5

int main(void){

int arr[x][y] = {{1, 2, 3, 4, 5}, 
                {6, 7, 8, 9, 10}, 
                {11, 12, 13, 14, 15}, 
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30}};
    
    int *p = (int *)arr;
    
    for(int i = x - 1; i >= 0; i--){
        for(int j = 0; j < y; j++){
            printf("%d\t", *(p + i * 5 + j));
        }
        printf("\n");
    }

    return 0;
}